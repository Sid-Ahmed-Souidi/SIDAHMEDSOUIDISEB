package unidad11.ejemplos.sociedadesCoperativas;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;

public class LeerSociedadesCoperativas {

      public static  Map<String, Integer> mapa = new HashMap<>();
      public static List<SociedadCoperativa> listaSociedades = new ArrayList<SociedadCoperativa>();

      
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
					String codigo = ciclos[4];
					codigo = quitarCaracteres(codigo);
					String codigoPostal = codigo;
					String clase = ciclos[5];
					clase = quitarCaracteres(clase);
					String fecha = ciclos[6];
					 fecha = fecha.trim();
					LocalDate fechaInscripcion = transformarFecha(fecha);
					/**
					System.out.println("num inscripcion"+numInscripcion);
					System.out.println("deno"+denoSocial);
					System.out.println("provincia"+provincia);
					System.out.println("localidad"+localidad);
					System.out.println("codigo postal"+codigoPostal);
					System.out.println("clase"+clase);
					System.out.println("fechaInscripcion "+fechaInscripcion);
					System.out.println("----------------------------------");	
					System.out.println(contador);
					*/
					
					cadena = lector.readLine();
					//Determinar cuántas sociedades cooperativas hay en cada provincia
					sociedadesProvincia(provincia);
					crearSociedad(numInscripcion,denoSocial,provincia,localidad,codigoPostal,clase,fechaInscripcion);
					

					}
				
				System.out.println(contador);
				
				mostrarsociedadesXprovincia(mapa);			
				sociedadReciente(listaSociedades);
		
				
			
				
			}catch(FileNotFoundException e){
				e.printStackTrace();
			
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			
		
		}
		
	

		private static void sociedadReciente(List<SociedadCoperativa> listaSociedades2) {
				
			for (SociedadCoperativa sociedadCoperativa : listaSociedades2) {
				 System.out.println(sociedadCoperativa.getFechaInscripcion());
					
			
			
		}

		}

		// en esta funcion creamos las diferentes sociedades y la introducimos en la listaSociedades
	 private static void crearSociedad(String numInscripcion, String denoSocial, String provincia, String localidad,
				String codigoPostal, String clase, LocalDate fechaInscripcion) {
		 SociedadCoperativa sociedad = new SociedadCoperativa(numInscripcion,denoSocial,provincia,localidad,codigoPostal,clase,fechaInscripcion);
		 listaSociedades.add(sociedad);
		 
		}

	 
	 
	// funcion para cambiar a numero entero 
		private static int  cambiarNumero(String numero) {
			//eliminar comillas si estan presentes
		    numero = numero.replace("\"", "");
	        int numeroEntero = Integer.parseInt(numero);
	        return numeroEntero;
			
		}
		
		
		// transformamos la fecha tipo String a localdate
		private static LocalDate transformarFecha(String fecha) {
	        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yy");
	        LocalDate fechaLocalDate = null;
	        try {
	            fechaLocalDate = LocalDate.parse(fecha, formato);
	        } catch (DateTimeParseException e) {
	            // Manejar el error, por ejemplo, imprimir un mensaje de error
	            System.err.println("Error al parsear la fecha: " + e.getMessage());
	        }
	        return fechaLocalDate;

			
		}

		private static void mostrarsociedadesXprovincia(Map<String, Integer> mapa2) {
			  for (Map.Entry<String, Integer> entry : mapa.entrySet()) {
		            System.out.println("Provincia: " + entry.getKey() + ", Total Sociedades: " + entry.getValue());
		        }
			
			
		}

		
		
		private static void sociedadesProvincia(String provincia) {
            // Si el objeto ya está en el mapa, incrementar su conteo			
			if(mapa.containsKey(provincia)) {
			mapa.put(provincia , mapa.get((provincia))+1);
			}else {
                // Si el objeto no está en el mapa, agregarlo con un conteo inicial de 1
				mapa.put(provincia, 1);
			}
		}

		
		
		private static String quitarCaracteres(String campo) {
			campo = campo.substring(1);	
			return campo;

		}
}


