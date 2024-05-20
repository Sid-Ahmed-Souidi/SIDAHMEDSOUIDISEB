package unidad12.ejemplos.conexion;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;


public class leerDatosProperties {
	
	static Properties propiedades = new Properties(); 
	

	public static void main(String[] args) {
		
		
		cargarConfiguracion();
		
		String ciudad ="Madrid";
		String url = propiedades.getProperty("urlcasa");
		String bd = propiedades.getProperty("basedatoscasa");
		String usuario = propiedades.getProperty("usuariocasa");
		String password = propiedades.getProperty("passwordcasa");

		
		
		try (Connection con = DriverManager.getConnection(url+bd,usuario,password)){
			
		
			Statement sentencia = con.createStatement();
			ResultSet resultado = sentencia.executeQuery("SELECT  * FROM personas ");
			while(resultado.next()) {
				System.out.println(resultado.getString("apellido"));
			}
			
			
			
			
		} catch (SQLException e) {
			e.printStackTrace();
			e.getMessage();
		}
		
	}


	private static void cargarConfiguracion() {
		
		FileInputStream fis;
		
		try {
			fis = new FileInputStream("ficheros/configuracion/bd/conexion.properties");
			propiedades.load(fis);
			
		}catch(IOException e){
			e.printStackTrace();
			e.getMessage();
		}
		
	}

}
