package unidad11.ejemplos.razasComarcas2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import com.google.gson.Gson;

public class leerRazasComarcas {

	public static void main(String[] args) {
		String rutaFichero = "ficheros1" + File.separator + "json" + File.separator + "razasComarcasExtremadura.json";
		
		
		File fichero = new File(rutaFichero);
		Gson gson = new Gson();
		
		try(BufferedReader lector = new BufferedReader(new FileReader(fichero))) {
			
			String cadena;
			cadena = lector.readLine();
			while(cadena!=null) {
				//System.out.println(cadena);
				String [] ciclos =cadena.split(",");
				//separamos campos por coma , pero los campos estan de forma clave :valor ej "raza_ganado":"ovino" 
				String campoCodigo = ciclos[0];
				String codigo =  separarClaveValor(campoCodigo);
				String campoRaza = ciclos[1];
				String raza =  separarClaveValor(campoRaza);
				String campoNumero = ciclos[2];
				String numero =  separarClaveValor(campoNumero);
				String campoFecha = ciclos[3];
				String fecha =  separarClaveValor(campoFecha);
				String campoZona = ciclos[4];
				String zona =  separarClaveValor(campoZona);
				System.out.println(codigo);
				raza =quitarCaracteres(raza);
				System.out.println(raza);
				System.out.println(numero);
				fecha =quitarCaracteres(fecha);
				System.out.println(fecha);
				zona =quitarCaracteres(zona);
				zona = zona.substring(0,zona.length() - 1);	
				if(zona.equals("castuera\"")) {
					zona = zona.substring(0,zona.length() - 1);
				}
				System.out.println(zona);		

				System.out.println();

				
				
				cadena = lector.readLine();
			
		
			
		}
			lector.close();	

			
		}catch(FileNotFoundException e){
			e.printStackTrace();
		
		}
		
		
		catch(IOException e){
			e.printStackTrace();
		
		}
		
	}

	private static String  quitarCaracteres(String campo) {
		campo = campo.substring(1, campo.length() - 1);		
		return campo;
	}

	private static String separarClaveValor(String campo) {
		//array que contiene los campos en formato clave valor 
	 // lo separamos mediante el split y nos quedamos con el valor en este caso por ejemplo de "raza":"bovino"
		// nos quedamos con bovino
		String[] array = campo.split(":");
		return array[1];		
	}

	

}
