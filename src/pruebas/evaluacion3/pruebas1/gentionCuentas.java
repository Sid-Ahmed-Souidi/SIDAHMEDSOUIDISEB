package pruebas.evaluacion3.pruebas1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class gentionCuentas {
	
    public static  Map<String, Integer> mapaCuentas = new HashMap<>();
    public static List<CuentaBancaria> listaCuenta = new ArrayList<CuentaBancaria>();
	private static final String directorio = "datosBancarios";
	private static final double LIMITEINFERIOR = 0.0 ; 

	public static void main(String[] args) {

		System.out.println("Leer fichero");
		
		String rutaFichero = "ficheros/balances.csv";
		
		
		File fichero = new File(rutaFichero);

		
		// esto me hace el close en vez de usar el finally
		try(BufferedReader lector = new BufferedReader(new FileReader(fichero));
				) {			
			lector.readLine();

			// con el bufferedReader lee por linea y no por caracter como el fileReader
			String cadena;
			
			cadena = lector.readLine();

			while(cadena!=null) {
				String [] ciclos =cadena.split(",");
				String idCliente = ciclos[0];
				String iban = ciclos[1];
				String balanceString = ciclos[2];
				double balance = convertirDouble(balanceString);
				
				
				CuentaBancaria cuenta = new CuentaBancaria(idCliente,iban ,balance);
				listaCuenta.add(cuenta);
				String inicialPais = iban.substring(2);
				sacarPais(cuenta);
				

				
				
	
				cadena = lector.readLine();
			}
			
			crearDirectorios();
			//rearFicheros();

			
			
		}catch(FileNotFoundException e){
			e.printStackTrace();
		
		}catch(IOException e){
			e.printStackTrace();
		
		}
		
		
		
		
	}

	
	private static void limiteInferior() {
		String nombreFichero = "pruebas/evaluacion3/cuentasPlus.json";
		
		
		try(BufferedWriter escritor = new BufferedWriter(new FileWriter(nombreFichero))){
			
			

			for (CuentaBancaria cuentaBancaria : listaCuenta) {
				if(cuentaBancaria.getBalance()<LIMITEINFERIOR) {
					escritor.write(cuentaBancaria.getIdCliente()+"  ");
					escritor.write(cuentaBancaria.getIBAN()+"  ");
					escritor.write(cuentaBancaria.getBalance()+"  ");
					
				
				
			}
			}
	
			System.out.println("Escritura en fichero con exito");

			
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
		

	}
	
	private static void crearDirectorios() {
		Iterator<String> it = mapaCuentas.keySet().iterator();
		String clave;
		while(it.hasNext()) {
			
			clave =(String)it.next();
			File carpeta = new File(directorio+"/"+clave);
			if(carpeta.exists()) {
				System.out.println("Carpeta ya existe");
			}else {
				carpeta.mkdirs();
				añadirTarjetas(carpeta);
				System.out.printf("Carpeta %s creada con existo ",clave);
				System.out.println();
			}
			
		}
		 
		
	}

	

	
	
	private static void añadirTarjetas(File carpeta) {
		boolean insertado = false ; 
		try(BufferedWriter escritor = new BufferedWriter(new FileWriter(carpeta))){
			for (CuentaBancaria cuentaBancaria : listaCuenta) {
				if(cuentaBancaria.getIBAN().substring(2).equals(carpeta)) {
					escritor.write(cuentaBancaria.getIdCliente()+"  ");
					escritor.write(cuentaBancaria.getIBAN()+"  ");
					escritor.write(cuentaBancaria.getBalance()+"  ");

					escritor.newLine();
				}
				
			}
			
			System.out.println("Escritura en fichero con exito");

			
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
		
	
		
		
	}



	private static double convertirDouble(String balanceString) {
		double numero = Double.parseDouble(balanceString);
        return numero;
	
	}

	private static void sacarPais(CuentaBancaria cuenta) {
		
		String idPais = cuenta.getIBAN().substring(2);

		
		if(mapaCuentas.containsKey(idPais)) {
			mapaCuentas.put(idPais , mapaCuentas.get((idPais))+1);
		}else {

			mapaCuentas.put(idPais, 1);
		}
		
		
		
		
	}

}
