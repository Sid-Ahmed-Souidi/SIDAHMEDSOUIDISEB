package unidad12.ejemplos.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LeerDatosPS {

	public static void main(String[] args) {
		String url = "jdbc:mysql://192.168.0.101:3306/SouidiElBaroudi";
		String usuario = "SouidiElBaroudi";
		String password ="Soui";
		
		String ciudad ="Madrid";
		
		
		try (Connection con = DriverManager.getConnection(url,usuario,password)){
			
		
			String sql = ("SELECT nombre FROM personas WHERE ciudad=?");
			PreparedStatement sentencia = con.prepareStatement(sql);
	
			sentencia.setString(1,"Madrid");
			ResultSet  resultado = sentencia.executeQuery();
			while(resultado.next()) {
				System.out.println(resultado.getString("nombre"));
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
			e.getMessage();
		}
	}

}
