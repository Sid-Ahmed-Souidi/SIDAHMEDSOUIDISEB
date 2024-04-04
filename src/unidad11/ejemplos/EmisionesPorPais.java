package unidad11.ejemplos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class EmisionesPorPais {


	
	
	
	
	public static void main(String[] args) {
		System.out.println("Leer fichero");
		
		String rutaFichero = "emisiones.txt";
		
		
		File fichero = new File(rutaFichero);
		
		
		 Map<String,Integer> emisionesPorPais = new HashMap<String,Integer>();

		
		// esto me hace el close en vez de usar el finally
		try(BufferedReader lector = new BufferedReader(new FileReader(fichero));
				) {
			String cadena;
			cadena = lector.readLine();
			
			
			while(cadena!=null) {
				int contador =0;
				
				String[] datos = cadena.split(",");
				int  anyo = Integer.parseInt(datos[0].trim());
				String pais = datos[1].trim();
				int emision = Integer.parseInt(datos[2].trim());
				
				emisionesPorPais.put(pais, emisionesPorPais.getOrDefault(pais, contador)+emision);

				
				cadena = lector.readLine();

				
			}
			
			
			
		}catch(FileNotFoundException e){
			e.printStackTrace();
		
		}catch(IOException e){
			e.printStackTrace();
		
		}
		
		
		 for (Map.Entry<String, Integer> entry : emisionesPorPais.entrySet()) {
	         System.out.println("Pais : " + entry.getKey() + ", emisiones totales: " + entry.getValue());
	     }
		
		
		
		
	}

		
		
	
}
