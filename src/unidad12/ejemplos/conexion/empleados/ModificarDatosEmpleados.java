package unidad12.ejemplos.conexion.empleados;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ModificarDatosEmpleados {

	public static void main(String[] args) {
		String url = "jdbc:mysql://192.168.0.101:3306/SouidiElBaroudi";
		String usuario = "SouidiElBaroudi";
		String password ="Soui";
		
		try (Connection con = DriverManager.getConnection(url,usuario,password)){
			
		
			String sql = ("UPDATE personas SET nombre=? WHERE id=?");
			PreparedStatement sentencia = con.prepareStatement(sql);
			
			
			
			
			sentencia.setString(1,"Sara");
			sentencia.setInt(2,11);
			
			
			int filasAfectadas = sentencia.executeUpdate();
			System.out.println("Filas afectadas : "+filasAfectadas);
			
			
		} catch (SQLException e) {
			e.printStackTrace();
			e.getMessage();
		}
	}

}
