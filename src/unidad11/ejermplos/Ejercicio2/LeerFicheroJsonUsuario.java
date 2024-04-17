package unidad11.ejermplos.Ejercicio2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import com.google.gson.Gson;

public class LeerFicheroJsonUsuario {

	public static void main(String[] args) {

		
		
		try {
			
			String ruta =" ficheros1/json/usuario.json";
			
			File fichero = new File(ruta);
			
			BufferedReader lector = new BufferedReader(new FileReader(fichero));
			
			
			StringBuilder  contenido = new StringBuilder();
			String linea ;
			while((linea=lector.readLine())!=null){
				
				contenido.append(linea);
				
				}
			lector.close();
			
			//convertir el contenido JSON a un objeto Usuario
				Gson gson = new Gson();
				Cliente cliente =  gson.fromJson(contenido.toString(), Cliente.class);
			
		} catch (Exception e) {
			e.printStackTrace();

		}
	}

}
