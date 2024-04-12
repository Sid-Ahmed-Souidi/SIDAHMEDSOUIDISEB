package unidad11.ejemplos.ListaAlumnos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;

public class InsertarAlumnos {
	

	  public static  List<Alumno> alumnos = new ArrayList<>();
	public static void main(String[] args) {
		
		

		try {
			Properties propiedades = new Properties();
			FileInputStream fis = new FileInputStream("ficheros1/alumnos.properties");
			propiedades.load(fis);
		
			
			String directorio = propiedades.getProperty("directorio");
			String nombreFichero = propiedades.getProperty("ficheroHistorial");
			
			File fichero = new File(directorio+File.separator+nombreFichero);
			FileReader  fr = new FileReader(fichero);
			BufferedReader br = new BufferedReader(fr);
			
			String linea = br.readLine();
			
			
			int numLinea = 0;
			int id = 0;
			while(linea!=null) {
				
				if(numLinea> 0) {
				String[] datos = linea.split("\\|");
				separarAlumno(datos , id);
				}
			    linea= br.readLine();
				numLinea++;
				id++;
				
			}
			br.close();
			fr.close();
			
		}catch(IOException e) {
			
			e.printStackTrace();
			
		}
		
		
	}
	

	private static void separarAlumno(String[] datos , int id ) {
		
		String apellidosYNombre = datos[0];
		String[] datos2 = apellidosYNombre.split(", ");
		String nombre = datos2[1];
		String apellidos = datos2[0];
		String nombreCiclo = datos[1];
		String curso = datos[2];
		 int idCurso = obtenerIdCurso(curso);
		
		Alumno alumno = new Alumno(id,nombre.trim(),apellidos,idCurso);
		alumnos.add(alumno);
		recorrerListaAlumnos(alumnos);
		
	

		
		
	}

	private static void recorrerListaAlumnos(List<Alumno> alumnos2) {

		for (Alumno alumno : alumnos2) {
			System.out.println(alumno);
			
			
		}
		
		
	}

	private static int obtenerIdCurso(String curso) {

		int id = 0 ;
		
		if(curso.equals("DAW")) {
			id = 1;
		}if(curso.equals("DAM")) {
			id = 2;
		}if(curso.equals("ASIR")) {
			id = 3;
		}
		
		return id ;

		
	}
	
	
	private static void escribirFichero(File fichero) {


		try (PrintWriter escritor = new PrintWriter(new BufferedWriter(new FileWriter(fichero)))) {

		Iterator<Alumno> it = alumnos.iterator();


		while (it.hasNext()) {


		Alumno alumno = (Alumno) it.next();

		escritor.println("INSERT INTO (id, nombre, apellidos, ciclo_formativo) VALUES(" + alumno.getId() + ",'"

		+ alumno.getNombre() + "','" + alumno.getApellidos() + "'," + alumno.getCicloFormativo() + ");");


		}


		} catch (Exception e) {


		e.getMessage();


		
	
	//al escribir en el fichero tengo que ponerlo en una fila  el insert into (....) values(y aqui los gets de los campos get.nombre);
	

	

		}
		}
}