package unidad11.ejemplos.cuentaBancaria;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
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
	
	private static final String directorio = "/home/diurno/Sid/ficheros";
	public static void main(String[] args) {

		
		tarjetasPorTipo = new HashMap<String , List<String>>();
		
		
		leerInfoTarjetaCSV("ficheros1/cuentasTarjetasBancos.csv");
		crearCarpetasTiposTarjetas();
		
		mostrarTiposTarjetas();
		
		
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
			for(String elemento : valores) {
				System.out.println("-" +elemento);
			}
			
			
		}
		
		
	}
	private static void leerInfoTarjetaCSV(String fichero) {
		
		try (BufferedReader lector = new BufferedReader(new  FileReader(fichero))
		){
			String linea = lector.readLine();
			
			int numeroLinea =0;
			
			while(linea!=null) {
				if(numeroLinea>0) {
				String [] campos = linea.split(",");
				Tarjeta tarjeta = crearTarjeta(campos);
				guardarTarjetaPorTipo(tarjeta);
				}
				linea = lector.readLine();
				
				numeroLinea++;
				
			}
			
		}catch(IOException e) {
			e.printStackTrace();
		
			
		}

		
	}
	
	
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

		String numeroTarjeta = campos[0];
		String tipo = campos[1];
		String numeroCuenta = campos[2];
		LocalDate fechaCaducidad = obtenerFechaCaducidad(campos[3]);
		
		
		
		return new Tarjeta(numeroTarjeta,tipo, numeroCuenta , fechaCaducidad);
		
		
	}
	private static LocalDate obtenerFechaCaducidad(String fecha) {

		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate fechaFormateada = LocalDate.parse(fecha,formato);
		return null;
	}

}
