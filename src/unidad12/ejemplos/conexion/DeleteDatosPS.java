package unidad12.ejemplos.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteDatosPS {

	public static void main(String[] args) {
		String url = "jdbc:mysql://192.168.0.101:3306/SouidiElBaroudi";
		String usuario = "SouidiElBaroudi";
		String password ="Soui";
		
		String dato="3 OR 1";
				
		try (Connection con = DriverManager.getConnection(url,usuario,password)){
			
		
			String sql = ("DELETE FROM personas WHERE id=?");
			PreparedStatement sentencia = con.prepareStatement(sql);
			
		
			sentencia.setInt(1,3);
			
			
			int filasBorradas = sentencia.executeUpdate();
			System.out.println("Filas afectadas : "+filasBorradas);
			
			
		} catch (SQLException e) {
			e.printStackTrace();
			e.getMessage();
		}
	}
	}



