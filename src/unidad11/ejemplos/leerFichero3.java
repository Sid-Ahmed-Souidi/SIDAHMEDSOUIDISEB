package unidad11.ejemplos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class leerFichero3 {
	
	public static void main(String[] args) {
		System.out.println("Leer fichero");
		
		String rutaFichero = "mancomunidades_extremadura.txt";
		
		
		File fichero = new File(rutaFichero);
		
		
		// esto me hace el close en vez de usar el finally
		try(BufferedReader lector = new BufferedReader(new FileReader(fichero));
) {
			// con el bufferedReader lee por linea y no por caracter como el fileReader
			String cadena;
			cadena = lector.readLine();
			while(cadena!=null) {
				String [] ciclos =cadena.split(",");
				String idCliente = ciclos[0];
				String iban = ciclos[1];
				String balance = ciclos[2];

				

				System.out.println(idCliente);
				System.out.println(iban);
				System.out.println(balance);
				cadena = lector.readLine();
			}
			
			
			
		}catch(FileNotFoundException e){
			e.printStackTrace();
		
		}catch(IOException e){
			e.printStackTrace();
		
		}
		
		
		
		
	}

		
		
	


	

}
