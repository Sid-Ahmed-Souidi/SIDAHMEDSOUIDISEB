package unidad11.ejemplos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class EmisionesPorPais {

	public static void main(String[] args) {
		System.out.println("Leer fichero");
		
		String rutaFichero = "emisiones.txt";
		
		
		File fichero = new File(rutaFichero);
		
		
		// esto me hace el close en vez de usar el finally
		try(BufferedReader lector = new BufferedReader(new FileReader(fichero));
				) {
			String cadena;
			cadena = lector.readLine();
			
			String[] datos = cadena.split(",");
			
			while(cadena!=null) {
				//System.out.println(cadena);
				int  anyo = Integer.parseInt(datos)[0].trim();
				System.out.println(anyo);
				String pais = datos[1].trim();
				System.out.println(pais);
				String emision = datos[2];
				System.out.println(emision);
				cadena = lector.readLine();

				
			}
			
			
			
		}catch(FileNotFoundException e){
			e.printStackTrace();
		
		}catch(IOException e){
			e.printStackTrace();
		
		}
		
		
		
		
	}

		
		
	
}
