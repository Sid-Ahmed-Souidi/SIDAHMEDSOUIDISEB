package unidad12.ejemplos.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class leerDatos {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/empresa";
		String usuario = "root";
		String password ="admin.1234";
		
		String ciudad ="Madrid";
		
		
		try (Connection con = DriverManager.getConnection(url,usuario,password)){
			
		
			Statement sentencia = con.createStatement();
			ResultSet resultado = sentencia.executeQuery("SELECT * FROM personas WHERE ciudad='"+ciudad+"'");
			while(resultado.next()) {
				System.out.println(resultado.getString("nombre"));
			}
			
			
			
			
		} catch (SQLException e) {
			e.printStackTrace();
			e.getMessage();
		}
		
	}

}
