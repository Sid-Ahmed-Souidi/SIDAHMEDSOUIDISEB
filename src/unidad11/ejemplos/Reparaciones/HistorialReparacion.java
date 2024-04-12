package unidad11.ejemplos.Reparaciones;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;

public class HistorialReparacion {

	
	private static List<Reparacion> reparaciones = new ArrayList<Reparacion>();
	
	public static void main(String[] args) {
		
		
		try {
			Properties propiedades = new Properties();
			FileInputStream fis = new FileInputStream("ficheros1/configuracion.properties");
			propiedades.load(fis);
		
			
			String directorio = propiedades.getProperty("directorio");
			String nombreFichero = propiedades.getProperty("ficheroHistorial");
			
			
			
			
			
			File fichero = new File(directorio+File.separator+nombreFichero);
			FileReader  fr = new FileReader(fichero);
			BufferedReader br = new BufferedReader(fr);
			
			String linea = br.readLine();
			
			while(linea!=null) {
				tratarLineaReparacion(linea);
			    System.out.println(linea);
			    linea= br.readLine();
			}
			br.close();
			fr.close();
			
		}catch(IOException e) {
			
			e.printStackTrace();
			
		}
		
		mostrarDatos();
		

		
		

	}

	private static void mostrarDatos() {
		Iterator<Reparacion> ite = reparaciones.iterator();
		while(ite.hasNext()) {
			Reparacion reparacion =(Reparacion)ite.next();
			System.out.println(reparacion);
		}
		
	}

	private static void tratarLineaReparacion(String linea) {

		String[] datos = linea.split(" ");
		TIPOVEHICULO tipo = null;
		tipo = obtenerTipoVehiculo(datos[0]);

		if(datos.length==3) {
			crearNuevaReparacion(tipo,datos[1],datos[2],null);
			
		}else {
			List<String> anioReparacion = obtenerAniosReparacion(linea);
			
		}
		
	}

	private static List<String> obtenerAniosReparacion(String linea) {

		String[] datos = linea.split(" ");
		List<String> anios = new ArrayList<String>();
		
		for(int i=3; i<datos.length;i++) {
			anios.add(datos[i]);
		}
		return anios;
	}

	private static void crearNuevaReparacion(TIPOVEHICULO tipo, String matricula, String anioCompra, List listaReparaciones) {

		
		Reparacion reparacion = new Reparacion(tipo, matricula,anioCompra,listaReparaciones);
		reparaciones.add(reparacion);
	}
	
	

	private static TIPOVEHICULO obtenerTipoVehiculo(String nombreTipo) {
		
		TIPOVEHICULO tipo = null;
		
		if(TIPOVEHICULO.COCHE.getNombre().equals(nombreTipo)) {
			tipo = TIPOVEHICULO.COCHE;
		}
		if(TIPOVEHICULO.MOTO.getNombre().equals(nombreTipo)) {
			tipo = TIPOVEHICULO.MOTO;
		}
		if(TIPOVEHICULO.CAMION.getNombre().equals(nombreTipo)) {
			tipo = TIPOVEHICULO.CAMION;
		}

		
		return tipo;
	}

}
