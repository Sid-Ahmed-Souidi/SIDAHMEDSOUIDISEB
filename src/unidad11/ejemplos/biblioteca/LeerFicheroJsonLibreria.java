package unidad11.ejemplos.biblioteca;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import com.google.gson.Gson;

public class LeerFicheroJsonLibreria {
	
	  public static void main(String[] args) {
	        try {
	            // Ruta del archivo JSON
	            String ruta ="ficheros1//json//libreria.json";
	            // Crear el lector de archivo
	            BufferedReader lector = new BufferedReader(new FileReader(new File(ruta)));
	            // Crear un objeto Gson para parsear el JSON
	            Gson gson = new Gson();
	            // Leer el JSON y convertirlo a un objeto Libreria
	            Libreria libreria = gson.fromJson(lector, Libreria.class);
	            // Cerrar el lector
	            lector.close();
	            // Mostrar la información de la librería y sus libros
	            System.out.println("Información de la librería:");
	            System.out.println(libreria.getNombre());
	            System.out.println(libreria.getUbicacion());
	            System.out.println("Libros disponibles:");
	            for (Libro libro : libreria.getLibros()) {
	                System.out.println(libro);
	            }
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }

}
