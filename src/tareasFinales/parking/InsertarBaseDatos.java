package tareasFinales.parking;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

import unidad13.formulario.Pedido;

public class InsertarBaseDatos {

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

			String crearTablaPedido= "CREATE TABLE IF NOT EXISTS parking("
                    + " matricula varchar(100)," +" tiempo varchar(100)," + "cobro varchar(255));";

			// conecta a la base de datos realiza una conexion de tabla

			PreparedStatement sentencia = con.prepareStatement(crearTablaPedido);


			sentencia.executeUpdate();


		} catch (SQLException e) {

			e.printStackTrace();

		}


	}

	public  void insertarEnTabla(Vehiculo vehiculo , double cobro) {

		cargarConfiguracion();

		String url = propiedades.getProperty("urlcasa");

		String bd = propiedades.getProperty("basedatoscasa");

		String usuario = propiedades.getProperty("usuariocasa"); // root

		String password = propiedades.getProperty("passwordcasa");

		// permite recuperar filas de manera más potente

		try (Connection con = DriverManager.getConnection(url+bd, usuario, password)) {

			String sql = "INSERT INTO parking (matricula,tiempo,cobro) VALUES(?,?,?);";
			
			PreparedStatement sentencia = con.prepareStatement(sql);
			
			sentencia.setString(1, vehiculo.getMatricula());
			String tiempoString = Long.toString(vehiculo.getTiempo());
			sentencia.setString(2, tiempoString);
			String cobroString = Double.toString(cobro);
			sentencia.setString(3,cobroString);
			
		

			int filaAfectadas= sentencia.executeUpdate();

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