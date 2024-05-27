package datosBancarios;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import unidad11.ejemplos.ficherosBinarios.Persona;

import java.util.Iterator;


public class GestionCuentasBancarias {
	
	public static final double LIMITE_INFERIOR= 0.0;
	public static final double LIMITE_SUPERIOR= 900000.0;
    public static List<CuentaBancaria> listaCuenta = new ArrayList<CuentaBancaria>();
	private static Map<String, List<CuentaBancaria>> mapCuentas = new HashMap<String, List<CuentaBancaria>>();

	public static void main(String[] args) {


		System.out.println("Leer fichero");
		
		String rutaFichero = "ficheros//balances.csv";
		
		File fichero = new File(rutaFichero);

		
		
		try(BufferedReader lector = new BufferedReader(new FileReader(fichero))) {
			lector.readLine();

			// con el bufferedReader lee por linea y no por caracter como el fileReader
			String cadena;
			while((cadena = lector.readLine())!=null) {
				String [] ciclos =cadena.split(",");
				
				String idCliente = ciclos[0];
				String iban = ciclos[1];
				String balanceString = ciclos[2];
				double balance = convertirDouble(balanceString);
				
				
				CuentaBancaria cuenta = new CuentaBancaria(idCliente,iban ,balance);
				listaCuenta.add(cuenta);
				
				cadena = lector.readLine();
			

			}
            mostrarCuentas(listaCuenta);
            añadirCuentaPorIBAN(listaCuenta);
            mostrarcuentasPorIBAN(mapCuentas);
            crearDirectorios();
            escribirDirectorios();
            crearFicheroEnDescubierto();
            crearFicheroCuentasPlus();
            crearFicherosBinarios();

			
		}catch(FileNotFoundException e){
			e.getMessage();
			e.printStackTrace();
		
		}catch(IOException e){
			e.getMessage();
			e.printStackTrace();
		
		}

	}

	
	private static void crearFicherosBinarios() {
		 Iterator<String> it = mapCuentas.keySet().iterator();
	        while (it.hasNext()) {
	            String clave = it.next();
	            File directorio = new File("C:\\datosBancarios1" + File.separator + clave);
	            if (!directorio.exists()) {
	                directorio.mkdirs(); // Crea el directorio si no existe
	            }

	            File fichero = new File(directorio, "cuentas.dat");

	            try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fichero))) {
	            	
	                List<CuentaBancaria> cuentas = mapCuentas.get(clave);
	                for (CuentaBancaria cuenta : cuentas) {
	                    oos.writeObject(cuenta);
	                }
	            } catch (IOException e) {
	                e.printStackTrace();
	            }
	        }
	    }



	


	private static void crearFicheroCuentasPlus() {
		// creamos el archivo de la ruta
		File fichero = new File("C:\\datosBancarios1" + File.separator + "cuentasPlus.json");
		//si no existe creamos el fichero
		if (!fichero.exists()) {
			try {
				fichero.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
				e.getMessage();
			}
		}
		//creamos el objeto gson para poder escribir en el fichero json
		Gson gson = new GsonBuilder().setPrettyPrinting().create();

		try (PrintWriter escritor = new PrintWriter(new BufferedWriter(new FileWriter(fichero)))) {
			
			//recoremos la lista de las cuentas 
			//las cuentas que superan al limite superior se escriben en el fichero
			for (CuentaBancaria cuenta : listaCuenta) {
				if (cuenta.getBalance() > LIMITE_SUPERIOR) {
					gson.toJson(cuenta, escritor);
				}
			}

		} catch (IOException e) {

			e.getMessage();

		}


		
	}





	private static void crearFicheroEnDescubierto() {
		//creamos el fichero cuentasEnDescubierto
		File fichero = new File("C:\\datosBancarios1" + File.separator + "cuentasEnDescubierto.txt");
		try {
			fichero.createNewFile();
		} catch (IOException e) {
			e.getMessage();
			e.printStackTrace();
		}

		for (CuentaBancaria cuenta : listaCuenta) {
			if(cuenta.getBalance()<LIMITE_INFERIOR) {
				try (PrintWriter escritor = new PrintWriter(new BufferedWriter(new FileWriter(fichero, true)))) {

					escritor.println("ID: " + cuenta.getIdCliente() + ", IBAN: " + cuenta.getIBAN() + ", Balance: "
							+ cuenta.getBalance());

				} catch (IOException e) {

					e.getMessage();
					e.printStackTrace();
				}
				
				
			}
			
		}
		
		
		
		
	}


	private static void escribirDirectorios() {
		// obtenemos el iterador para recorrer las claves del mapa
		Iterator<String> it = mapCuentas.keySet().iterator();
		while (it.hasNext()) {
			String clave = (String) it.next();
			//creamos el archivo file que representa la ruta donde se van a escribir los datos
			File fichero = new File("C:\\datosBancarios1" + File.separator + clave + File.separator + "cuentas.txt");
			//obtenemos la listas asociada a la clave actual 
			List<CuentaBancaria> cuentas = mapCuentas.get(clave);

			for (CuentaBancaria cuenta : cuentas) {
				try (PrintWriter escritor = new PrintWriter(new BufferedWriter(new FileWriter(fichero, true)))) {

					escritor.println("ID: " + cuenta.getIdCliente() + ", IBAN: " + cuenta.getIBAN() + ", Balance: "
							+ cuenta.getBalance());

				} catch (IOException e) {

					e.getMessage();
					e.printStackTrace();
				}
			}
		}		
	}


	private static void crearDirectorios() {
		
		File directorio = new File("C:\\datosBancarios1");
		File fichero = null;

		//no crea directorio
		if(directorio.exists()) {
			System.out.println("Directorio ya existe ...");
		
		}else {
			directorio.mkdir();
			for (String clave : mapCuentas.keySet()) {
				File ruta = new File(directorio + File.separator + clave);
				if(ruta.exists()) {
					System.out.println(ruta+" ya existe");
				
				
				}else {
					ruta.mkdirs();
					fichero = new File(ruta + File.separator + "cuentas.txt");
					try {
						fichero.createNewFile();
					} catch (IOException e) {
						e.getMessage();
						e.printStackTrace();
					}

					

					
				}
			}
		}
		
		
		
	}


	private static void mostrarcuentasPorIBAN(Map<String, List<CuentaBancaria>> mapCuentas2) {
	     for (Map.Entry<String, List<CuentaBancaria>> entry : mapCuentas2.entrySet()) {
	            System.out.println(entry.getKey() + ": " + entry.getValue());
	        }

	
	}


	// las serie de listas de cuentas que tendran como clave las dos primeras letras del IBAN 
	private static void añadirCuentaPorIBAN(List<CuentaBancaria> listaCuenta2) {
			for (CuentaBancaria cuenta : listaCuenta2) {//Itera sobre cada cuenta.
				String clave = cuenta.getIBAN().substring(0, 2);//Extrae los dos primeros caracteres del IBAN para usar como clave.
				if(clave.matches("[A-Z]{2}")) {
				mapCuentas.put(clave, new ArrayList<CuentaBancaria>());//Inicializa una nueva lista vacía en el mapa para cada clave si no existe ya.
			}
			}
			for (CuentaBancaria cuenta : listaCuenta2) {//Itera sobre cada cuenta.
				String clave = cuenta.getIBAN().substring(0, 2);//Usa los dos primeros caracteres del IBAN para recuperar la lista correspondiente del mapa.
	            if (clave.matches("[A-Z]{2}")) {
				List<CuentaBancaria> cuentas = mapCuentas.get(clave);//obtengo la lista correspondiente con la clave de la cuenta
				cuentas.add(cuenta); //Añade la cuenta a la lista correcta.
	            }
		}		
	}

	
	private static void mostrarCuentas(List<CuentaBancaria> listaCuenta2) {

		for (CuentaBancaria cuentaBancaria : listaCuenta2) {
			//System.out.println(cuentaBancaria);
			
			
		}
		
	}
	

	
	private static double convertirDouble(String balanceString) {
		double numero = Double.parseDouble(balanceString);
		return numero;
	}

}
