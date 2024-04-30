package unidad12.ejemplos.conexion.salidaEntrada;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;

public class CrearTabla {

	static Properties propiedades = new Properties(); 
	static String[] cabecera = new String[] {"ID" ,"NOMBRE", "APELLIDO" , "CIUDAD"};

	public static void main(String[] args) {

		
		
		String[][] datos = recuperarListadoPersonas();
		String titulo ="Empleados";
		
		recuperarListadoPersonas();
		new Tabla(datos, cabecera , titulo).setVisible(true);
		
		
	}
	
	
	
	public static String[][] recuperarListadoPersonas() {
		cargarConfiguracion();
		String url = propiedades.getProperty("url");
		String bd = propiedades.getProperty("basedatos");
		String usuario = propiedades.getProperty("usuario");
		String password = propiedades.getProperty("password");
		
		String[][] datos = null;
		
		try {
			
			RowSetFactory rowSetFactory = RowSetProvider.newFactory();
			
			JdbcRowSet rowSet = rowSetFactory.createJdbcRowSet();
			
			rowSet.setUrl(url + bd);
			
			rowSet.setUsername(usuario);
			rowSet.setPassword(password);
			
			rowSet.setCommand("SELECT * FROM personas");
			rowSet.execute();
			
			
			//Obtener el numero de filas que nos devuelve la sentencia del select
			
			int numFilas = 0;
			if(rowSet.last()) {
				numFilas = rowSet.getRow();
				rowSet.beforeFirst();//regresa el curso a la primera posicion para volver a recorrerla
			}
			
			datos  = new String[numFilas][cabecera.length];
			
			
			int contadorFila =0;
			while(rowSet.next()) {
				String[] fila = new String[cabecera.length];
				fila[0] = String.valueOf(rowSet.getInt("id"));
				fila[1] = rowSet.getString("nombre");
				fila[2] = rowSet.getString("apellido");
				fila[3] = rowSet.getString("ciudad");

				datos[contadorFila] = fila;
				contadorFila++;
				

			}

			
		} catch (Exception e) {
			e.printStackTrace();
			e.getMessage();
		}
		
		return datos;
		
	}
	

	private static void cargarConfiguracion() {
		FileInputStream fis;
		try {
			fis = new FileInputStream(Constantes.fichero);
			propiedades.load(fis);
			
		}catch(IOException e){
			e.printStackTrace();
			e.getMessage();
		}
		
	}

}
