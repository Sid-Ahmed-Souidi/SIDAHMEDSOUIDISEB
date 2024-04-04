package unidad11.ejemplos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Precipitaciones {

	public static void main(String[] args) {
		
		 Map<String,Double> precipitaciones = new HashMap<String,Double>();

		String rutaFichero = "ficheros1//precipitacionesExt.txt";
		File fichero = new File(rutaFichero);
		
		
		
		try(BufferedReader lector = new BufferedReader(new FileReader(fichero));
				) {
			
			// de esta manera me salto el encabezado 
			lector.readLine();
			
			String cadena ;
			 cadena = lector.readLine();
			

			 while(cadena!=null) {
				 double  contador = 0;
				 String[] datos = cadena.split("\\s+");

				 if(datos.length >= 4) {
				 String provincia = datos[0].replaceAll("[^a-zA-Zá]", "");
				 System.out.println(provincia);
				 System.out.println("Dato a convertir a entero: " + datos[1].replaceAll("[^\\d]", ""));
				 int anyo = Integer.parseInt(datos[1].replaceAll("[^\\d]", ""));
				 System.out.println(anyo);
				 String meses = datos[2].replaceAll("[^a-zA-Z]", "");
				 System.out.println(meses);
				 double valores = Double.parseDouble(datos[3].replace(',', '.').replaceAll("[^\\d.]", ""));
	                System.out.println(valores);
				 precipitaciones.put(provincia, precipitaciones.getOrDefault(provincia, contador)+valores);
				 }else {
					 System.out.println("La linea no tiene suficientes elementos"+cadena);
				 }
					cadena = lector.readLine();

			 }
			 
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		
		catch(IOException e) {
			e.printStackTrace();
		}
		
		System.out.println();
		System.out.println("Total de precipitaciones por provincia");
		System.out.println();
		for (Map.Entry<String, Double> entry : precipitaciones.entrySet()) {
	         System.out.println(": " + entry.getKey() + ", Cantidad: " + Math.round(entry.getValue()));
	     }
		
		
	}

}
