package unidad11.ejemplos.sociedadesCoperativas;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import com.google.gson.Gson;

public class LeerSociedadesCoperativas {

	
		public static void main(String[] args) {
			String rutaFichero = "ficheros" + File.separator + "json" + File.separator + "Sociedades_Cooperativas.txt";
			
			File fichero = new File(rutaFichero);
			Gson gson = new Gson();
			
			try(BufferedReader lector = new BufferedReader(new FileReader(fichero))) {
				
				String encabezado = lector.readLine();
				String cadena;
				cadena = lector.readLine();
				int contador = 0;

				while(cadena!=null) {

				
					String [] ciclos =cadena.split("\",");
					String numInscripcion = ciclos[0];
					numInscripcion = quitarCaracteres(numInscripcion);
					String denoSocial = ciclos[1];
					denoSocial = quitarCaracteres(denoSocial);
					String provincia = ciclos[2];
					provincia = quitarCaracteres(provincia);
					String localidad = ciclos[3];
					localidad = quitarCaracteres(localidad);
					String codigoPostal = ciclos[4];
					codigoPostal = quitarCaracteres(codigoPostal);
					String clase = ciclos[5];
					clase = quitarCaracteres(clase);
					String fechaInscripcion = ciclos[6];
					
					System.out.println("num inscripcion"+numInscripcion);
					System.out.println("deno"+denoSocial);
					System.out.println("provincia"+provincia);
					System.out.println("localidad"+localidad);
					System.out.println("codigo postal"+codigoPostal);
					System.out.println("clase"+clase);
					System.out.println("fechaInscripcion "+fechaInscripcion);
					System.out.println("----------------------------------");	
					
					contador++;
					cadena = lector.readLine();

					}
				System.out.println(contador);
		
				
			
				
			}catch(FileNotFoundException e){
				e.printStackTrace();
			
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			
		
	
		
	
		
		}

		private static String quitarCaracteres(String campo) {
			campo = campo.substring(1);		
			return campo;

		}
}


