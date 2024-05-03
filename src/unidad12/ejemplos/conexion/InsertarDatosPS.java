package unidad12.ejemplos.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class InsertarDatosPS {
 
	public static void main(String[] args) {
		//String url = "jdbc:mysql://192.168.0.101:3306/SouidiElBaroudi";
		String url = "jdbc:mysql://localhost/bd";
		String usuario = "root";
		String password ="12345";
		
		try (Connection con = DriverManager.getConnection(url,usuario,password)){
			
		
			String sql = ("INSERT INTO personas (nombre,apellido,ciudad) "
					+ "VALUES (?,?,?)");
			PreparedStatement sentencia = con.prepareStatement(sql);
			
			sentencia.setString(1,"Paula");
			sentencia.setString(2,"Rodrigez");
			sentencia.setString(3,"Caceres");
			
			
			int filasAfectadas = sentencia.executeUpdate();
			System.out.println("Filas afectadas : "+filasAfectadas);
			
			
		} catch (SQLException e) {
			e.printStackTrace();
			e.getMessage();
		}
	}

}
