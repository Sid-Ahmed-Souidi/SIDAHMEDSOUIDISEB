package tareasFinales.formulario;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

import unidad13.formulario.Pedido;

public class BaseDatos {

		static Properties propiedades = new Properties();

		public void crearTabla() {

			cargarConfiguracion();

			String url = propiedades.getProperty("url");

			String bd = propiedades.getProperty("basedatos");

			String usuario = propiedades.getProperty("usuario"); // root

			String password = propiedades.getProperty("password");

			;// contraseña


			try (Connection con = DriverManager.getConnection(url+bd, usuario, password)) {

				// sentencua sql para crear una table

				String crearTablaPedido= "CREATE TABLE IF NOT EXISTS pedido("
	                    + " nombre varchar(100)," +" apellido varchar(100)," + "direccion varchar(100)," + "tipoPedido varchar(255),"
	                    + "seleccionPizza varchar(255)," +"seleccionTamaño varchar(255),"+"precio varchar(255));";

				// conecta a la base de datos realiza una conexion de tabla

				PreparedStatement sentencia = con.prepareStatement(crearTablaPedido);


				sentencia.executeUpdate();


			} catch (SQLException e) {

				e.printStackTrace();

			}


		}

		public  void insertarEnTabla(Pedido pedido) {

			cargarConfiguracion();

			String url = propiedades.getProperty("url");

			String bd = propiedades.getProperty("basedatos");

			String usuario = propiedades.getProperty("usuario"); // root

			String password = propiedades.getProperty("password");


			


			// permite recuperar filas de manera más potente

			try (Connection con = DriverManager.getConnection(url+bd, usuario, password)) {

				String sql = "INSERT INTO pedido (nombre,apellido,direccion,tipoPedido,seleccionPizza,seleccionTamaño,precio) VALUES(?,?,?,?,?,?,?);";
				
				

				PreparedStatement sentencia = con.prepareStatement(sql);
				sentencia.setString(1, pedido.getNombre());
				sentencia.setString(2, pedido.getApellido());
				sentencia.setString(3, pedido.getDireccion());
				sentencia.setString(4, pedido.getTipoPedido());
				sentencia.setString(5, pedido.getPizza());
				sentencia.setString(6, pedido.getTamaño());
				sentencia.setString(7, pedido.getPrecio());

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

