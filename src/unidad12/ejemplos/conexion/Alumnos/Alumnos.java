package unidad12.ejemplos.conexion.Alumnos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Alumnos {

	public static void main(String[] args) {
		String url = "jdbc:mysql://192.168.0.101:3306/SouidiElBaroudi";
		String usuario = "SouidiElBaroudi";
		String password ="Soui";
		
		try (Connection con = DriverManager.getConnection(url,usuario,password)){
			
			crearTabla(con);
		
			/**
			
			sentencia.setString(1,"Sid Ahmed");
			sentencia.setString(2,"Souidi");
			sentencia.setString(3,"Caceres");
			*/
			
			int filasAfectadas = sentencia.executeUpdate();
			System.out.println("Filas afectadas : "+filasAfectadas);
			
			
		} catch (SQLException e) {
			e.printStackTrace();
			e.getMessage();
		}
	}

	private static void crearTabla(Connection con) {
		String sql = ("INSERT INTO personas (nombre,apellido,ciudad) "
				+ "VALUES (?,?,?)");		
		PreparedStatement sentencia = con.prepareStatement(sql);

	}
	

}
