package unidad12.ejemplos.conexion.empleados;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

import unidad13.formulario.Pedido;

public class BaseDatosEmpleados {


	static Properties propiedades = new Properties();

	public void crearTabla() {

		cargarConfiguracion();

		String url = propiedades.getProperty("urlcasa");

		String bd = propiedades.getProperty("basedatoscasa");

		String usuario = propiedades.getProperty("usuariocasa"); // root

		String password = propiedades.getProperty("passwordcasa");

		;// contraseña


		try (Connection con = DriverManager.getConnection(url+bd, usuario, password)) {

			// sentencua sql para crear una table

			String salariosBrutos= "CREATE TABLE IF NOT EXISTS salariosBrutos("
                    + " nombre varchar(100)," +" apellido varchar(100)," + "salario varchar(255));";
			
			String salariosNetos= "CREATE TABLE IF NOT EXISTS salariosNetos("
                    + " nombre varchar(100)," +" apellido varchar(100)," + "salario varchar(255));";

			// conecta a la base de datos realiza una conexion de tabla

			PreparedStatement sentencia = con.prepareStatement(salariosBrutos);
			PreparedStatement sentencia2 = con.prepareStatement(salariosNetos);


			sentencia.executeUpdate();
			sentencia2.executeUpdate();


		} catch (SQLException e) {

			e.printStackTrace();

		}


	}



	public  void insertarEnTabla(SalarioEmpleado empleado) {

		cargarConfiguracion();

		String url = propiedades.getProperty("urlcasa");

		String bd = propiedades.getProperty("basedatoscasa");

		String usuario = propiedades.getProperty("usuariocasa"); // root

		String password = propiedades.getProperty("passwordcasa");

		// permite recuperar filas de manera más potente

		try (Connection con = DriverManager.getConnection(url+bd, usuario, password)) {

			String sql = "INSERT INTO salariosBrutos (nombre,apellido,salario) VALUES(?,?,?);";
			
			PreparedStatement sentencia = con.prepareStatement(sql);
			sentencia.setString(1, empleado.getNombre());
			sentencia.setString(2, empleado.getApellido());
			sentencia.setString(3, empleado.getSalario());
			
			String sql2 = "INSERT INTO salariosNetos (nombre,apellido,salario) VALUES(?,?,?);";
			
			PreparedStatement sentencia2 = con.prepareStatement(sql2);
			sentencia2.setString(1, empleado.getNombre());
			sentencia2.setString(2, empleado.getApellido());
			sentencia2.setString(3, empleado.aplicarIVA());
			
			int filaAfectadas =0;
			filaAfectadas += sentencia.executeUpdate();

			filaAfectadas+= sentencia2.executeUpdate();

			System.out.println("Filas insertadas: "+ filaAfectadas);

		} catch (SQLException e) {

			e.printStackTrace();
		}

	}




	public static void cargarConfiguracion() {
		// carga los datos del ficherpo de propiedades
		FileInputStream fis;
		try {

			fis = new FileInputStream("ficheros" + File.separator + "configuracion" + File.separator + "bd"

					+ File.separator + "conexion.properties");
			propiedades.load(fis);

		} catch (IOException e) {

			e.printStackTrace();
		}
	}
}
