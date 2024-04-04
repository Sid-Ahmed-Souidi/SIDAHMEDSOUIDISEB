package unidad11.ejemplos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Donantes {

	public static void main(String[] args) {
		
		
		
		//
	Map<String,Integer> donantes = new HashMap<String,Integer>();
		//de esta si no esta al principio cuando no esta incializado nos inicia al principio por defecto
		//int valorInicial =0;
		//donantes.put(AB_NEGATIVO, donantes.getOrDefault(AB_NEGATIVO, valorInicial)+1);

		
		
		
		String rutaFichero = "ficheros1//donantes.txt";
		
		File fichero = new File(rutaFichero);
		
		
		try(BufferedReader lector = new BufferedReader(new FileReader(fichero))) {
			
			String cadena;
			cadena = lector.readLine();
			
			
			while(cadena!=null) {
				String[] datos = cadena.split(",");
				String tipo = datos[2];
				System.out.println(tipo);
				
				int valorInicial =0;

				donantes.put(tipo, donantes.getOrDefault(tipo, valorInicial)+1);

				cadena = lector.readLine();
				


				
			}
		}catch(IOException e){
			e.printStackTrace();
		
		}
		
	
	
	 for (Map.Entry<String, Integer> entry : donantes.entrySet()) {
         System.out.println("Tipo de sangre: " + entry.getKey() + ", Cantidad: " + entry.getValue());
     }

}
}
