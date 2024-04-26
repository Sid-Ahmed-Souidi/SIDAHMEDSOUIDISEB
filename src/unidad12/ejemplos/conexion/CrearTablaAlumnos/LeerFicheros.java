package unidad12.ejemplos.conexion.CrearTablaAlumnos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import unidad11.ejemplos.ListaAlumnos.Alumno;

public class LeerFicheros {
	static Properties propiedades = new Properties();

	public static List<Alumno> alumnos = new ArrayList<Alumno>();
	public static List<Curso> cursos = new ArrayList<Curso>();
	// aqui donde almacenamos en la clave el codigo y en el valor en nombre del
	// ciclo

	public static Map<String, String> mapaCiclos = new HashMap<String, String>();

	public static void main(String[] args) {

		try {
			Properties propiedades = new Properties();
			FileInputStream fis = new FileInputStream("ficheros1/alumnos.properties");
			propiedades.load(fis);

			String directorio = propiedades.getProperty("directorio");
			String nombreFichero = propiedades.getProperty("ficheroHistorial");

			File fichero = new File(directorio + File.separator + nombreFichero);
			FileReader fr = new FileReader(fichero);
			BufferedReader br = new BufferedReader(fr);

			String linea = br.readLine();

			int numLinea = 0;
			int id = 0;
			while (linea != null) {

				if (numLinea > 0) {
					String[] datos = linea.split("\\|");
					separarAlumno(datos, id);
				}
				linea = br.readLine();
				numLinea++;
				id++;

			}
			br.close();
			fr.close();
			File escribirFichero = new File("ficheros1/ESCRIBIR_ALUMNOS.txt");
			escribirFichero(escribirFichero);

			pasarloMap(cursos);
			insertarCiclos();
			
		} catch (IOException e) {

			e.printStackTrace();

		}

	}

	private static void separarAlumno(String[] datos, int id) {

		String apellidosYNombre = datos[0];
		String[] datos2 = apellidosYNombre.split(", ");
		String nombre = datos2[1];
		String apellidos = datos2[0];
		String nombreCiclo = datos[1];
		String codigo = datos[2];
		int idCurso = obtenerIdCurso(codigo);

		Alumno alumno = new Alumno(id, nombre.trim(), apellidos, idCurso);
		alumnos.add(alumno);
		recorrerListaAlumnos(alumnos);
		// creamos curso como con el objetos alumnos
		Curso curso = new Curso(nombreCiclo.trim(), codigo.trim());
		cursos.add(curso);
		recorrerListaCursos(cursos);
		// lo pasamos a map para no tener objetos duplicados
		

	}

	private static void insertarCiclos() {
		try {
			FileInputStream fis = new FileInputStream("ficheros/configuracion/bd/conexion.properties");
			
			propiedades.load(fis);
			
			String url = propiedades.getProperty("url");
			String bd = propiedades.getProperty("basedatos");
			String usuario = propiedades.getProperty("usuario");
			String password = propiedades.getProperty("password");
			try (Connection con = DriverManager.getConnection(url + bd, usuario, password)) {

				for (String clave : mapaCiclos.keySet()) {

					String sql = "INSERT INTO cicloformativos (nombre, codigo) VALUES ('" + clave + "', " + "'" + mapaCiclos.get(clave) + "')";
					PreparedStatement sentencia = con.prepareStatement(sql);

					sentencia.executeUpdate();

				}

			} catch (SQLException e) {
				e.printStackTrace();
				e.getMessage();
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private static void pasarloMap(List<Curso> cursos2) {

		for (Curso curso : cursos2) {
			// insertamos el nombre y el codigo
			mapaCiclos.put(curso.getNombre(), curso.getCodigo());

		}

		for (String clave : mapaCiclos.keySet()) {
			System.out.println("Clave = " + clave + ", valor = " + mapaCiclos.get(clave));
		}

	}

	private static void recorrerListaAlumnos(List<Alumno> alumnos2) {
		for (Alumno objeto : alumnos2) {
			System.out.println(objeto);

		}
	}

	private static void recorrerListaCursos(List<Curso> cursos2) {

		for (Curso curso : cursos2) {
			System.out.println(curso);

		}

	}

	private static int obtenerIdCurso(String curso) {

		int id = 0;

		if (curso.equals("DAW")) {
			id = 1;
		}
		if (curso.equals("DAM")) {
			id = 2;
		}
		if (curso.equals("ASIR")) {
			id = 3;
		}

		return id;

	}

	private static void escribirFichero(File fichero) {

		try (PrintWriter escritor = new PrintWriter(new BufferedWriter(new FileWriter(fichero)))) {

			Iterator<Alumno> it = alumnos.iterator();
			while (it.hasNext()) {

				Alumno alumno = (Alumno) it.next();
				escritor.println("INSERT INTO(id,nombre,apellidos,ciclo_formativo) VALUES(" + alumno.getId() + ",'"
						+ alumno.getNombre() + "','" + alumno.getApellidos() + "'," + alumno.getCicloFormativo()
						+ ");");
			}
		} catch (Exception e) {
			e.getMessage();
		}
		// al escribir en el fichero tengo que ponerlo en una fila el insert into (....)
		// values(y aqui los gets de los campos get.nombre);

	}

}
