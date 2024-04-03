package unidad11.ejemplos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;

public class Donantes {

	public static void main(String[] args) {
		
		//
	//	Map<String,Integer> donantes = new HashMap<String,Integer>();
		/**
		 * de esta si no esta al principio cuando no esta incializado nos inicia al principio por defecto
		int valorInicial =0;
		donantes.put(ab_negativo, donantes.getOrDefault(AB_NEGATIVO, valorInicial)+1);

		*/
		
		
		String rutaFichero = "ficheros1//donantes.txt";
		
		File fichero = new File(rutaFichero);
		
		
		try(BufferedReader lector = new BufferedReader(new FileReader(fichero))) {
			
			String cadena;
			cadena = lector.readLine();
			
			String[] datos = cadena.split(",");
			
			while(cadena!=null) {
				
				String tipo = datos[2];
				System.out.println(tipo);
				cadena = lector.readLine();
				


				
			}
		}catch(IOException e){
			e.printStackTrace();
		
		}
		
		
		

	}

}
