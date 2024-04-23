package unidad11.ejemplos.cuentaBancaria;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class LeerDatosFicheroTarjetas {

	
	private static Map<String , List<String>> tarjetasPorTipo;
	//C:\Users\Sid Ahmed Souidi\Desktop
	//private static final String directorio = "/home/diurno/Sid/ficheros";
	private static final String directorio = "C:\\Users\\Sid Ahmed Souidi\\Desktop";

	public static void main(String[] args) {
		
		tarjetasPorTipo = new HashMap<String , List<String>>();
		
		
		leerInfoTarjetaCSV("ficheros1/cuentasTarjetasBancos.csv");
		crearCarpetasTiposTarjetas();
		String ficheroVisa = "C:\\Users\\Sid Ahmed Souidi\\Desktop\\Visa\\ficheroVisa";
		crearFicheros(ficheroVisa);
		String Ficheroamericanexpress = "C:\\Users\\Sid Ahmed Souidi\\Desktop\\americanexpress\\ficheroAmericaexpress";
		crearFicheros(Ficheroamericanexpress);
		String ficheroMastercard = "C:\\Users\\Sid Ahmed Souidi\\Desktop\\mastercard\\ficheroMastercard";
		crearFicheros(ficheroMastercard);
		mostrarTiposTarjetas();
		
		
	}
	private static void crearFicheros(String rutaFichero) {
	
		boolean insertado = false ; 
		try(BufferedWriter escritor = new BufferedWriter(new FileWriter(rutaFichero))){
			
			for(Map.Entry<String, List<String>> tarjetas: tarjetasPorTipo.entrySet()) {
				String clave = tarjetas.getKey();
				List<String> valores = tarjetas.getValue();

				if(clave.equals("Visa")) {
				//System.out.println("Clave: " + clave);
				for(String elemento : valores) {
					System.out.println(elemento);
					escritor.write(elemento);	
					escritor.newLine();
					}
				}else if(clave.equals("americanexpress")) {
					//System.out.println("Clave: " + clave);
					for(String elemento : valores) {
						escritor.write(elemento);	
						escritor.newLine();
						}
					
				}
				else if(clave.equals("mastercard")) {
					//System.out.println("Clave: " + clave);
					for(String elemento : valores) {
						escritor.write(elemento);	
						escritor.newLine();
						}
					
				}
				
			}
			System.out.println("Escritura en fichero con exito");

			
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
		
	}
		
		
		

	private static void crearCarpetasTiposTarjetas() {
		
		Iterator<String> it = tarjetasPorTipo.keySet().iterator();
		String clave;
		while(it.hasNext()) {
			
			clave =(String)it.next();
			File carpeta = new File(directorio+"/"+clave);
			if(carpeta.exists()) {
				System.out.println("Carpeta ya existe");
			}else {
				carpeta.mkdirs();
				System.out.printf("Carpeta %s creada con existo ",clave);
				System.out.println();
			}
			
		}
		 
	}
	private static void mostrarTiposTarjetas() {

		for(Map.Entry<String, List<String>> tarjetas: tarjetasPorTipo.entrySet()) {
			String clave = tarjetas.getKey();
			List<String> valores = tarjetas.getValue();
			System.out.println("Clave: " + clave);
			if(clave.equals("Visa")) {
			for(String elemento : valores) {
				//System.out.println("-" +elemento);
			}
			
		}
		}
		
	}
	private static void leerInfoTarjetaCSV(String fichero) {
			// con el bufferedReader leemos por linea
		try (BufferedReader lector = new BufferedReader(new  FileReader(fichero))
		){
			String linea = lector.readLine();
			
			int numeroLinea =0;
			
			while(linea!=null) {
				// numeroLinea sirve para saltar la primera linea del fichero
				if(numeroLinea>0) {
					//estos son los campos del fichero que se almacena en una array "campos"
				String [] campos = linea.split(",");
				//pasamos los campos a la funcion crearTarjeta donde se va almacenar en el objeto tarjeta
				Tarjeta tarjeta = crearTarjeta(campos);
				// pasamos la tarjeta creada a la funcion guardarTarjetaPorTipo 
				guardarTarjetaPorTipo(tarjeta);
				}
				linea = lector.readLine();
				
				numeroLinea++;
				
			}
			
		}catch(IOException e) {
			e.printStackTrace();
		
		}

	}
	
	/**
	 * En esta funcion 
	 */
	private static void guardarTarjetaPorTipo(Tarjeta tarjeta) {

		String tipo = tarjeta.getTipo();
		String numeroTarjeta = tarjeta.getNumero();
		
		// la lista donde se almacena los numeros de cuenta 
		List<String> tarjetas = tarjetasPorTipo.get(tipo);
		
		// la primera vez que se crea va a ser null
		if(tarjetas == null) {
			tarjetas = new ArrayList<String>();
			tarjetasPorTipo.put(tipo, tarjetas);
		}
		// aqui se añade cuando ya esta creada la lista 
		tarjetas.add(numeroTarjeta);
		
			
		
	}
	
	
	
	private static Tarjeta crearTarjeta(String[] campos) {
		// asignamos los campos a los atributos 
		String numeroTarjeta = campos[0];
		String tipo = campos[1];
		String numeroCuenta = campos[2];
		LocalDate fechaCaducidad = obtenerFechaCaducidad(campos[3]);
		
		
		// creamos el objeto tarjeta
		return new Tarjeta(numeroTarjeta,tipo, numeroCuenta , fechaCaducidad);
		
		
	}
	private static LocalDate obtenerFechaCaducidad(String fecha) {

		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate fechaFormateada = LocalDate.parse(fecha,formato);
		return null;
	}

}
