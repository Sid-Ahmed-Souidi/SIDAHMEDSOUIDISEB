package unidad12.ejemplos.conexion.ferreteria;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import unidad12.ejemplos.ferreteria.Producto;
import unidad12.ejemplos.ferreteria.ProductoDAO;

public class Main {
	
	static String jdbcURL = "jdbc:mysql://192.168.0.101:3306/SouidiElBaroudi";
	static String jdbcUser =   "SouidiElBaroudi";
	static String jdbcPass = "Soui";
	

	public static void main(String[] args) {
		
		
		List<String> listaProductos = new ArrayList<String>();
		
		try {
			listaProductos = Files.readAllLines(Paths.get("ficheros//configuracion//bd//ferreteria//productos.csv"), StandardCharsets.UTF_8);
			
			
			
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		int contadorLinea = 0;
		for(String lineaProducto : listaProductos) {
			if(contadorLinea>0) {
				System.out.println("Linea producto"+lineaProducto);
				String[] datos = lineaProducto.split(",");
				//validar
				Producto producto = new Producto(datos[0],datos[1], datos[2],Double.parseDouble(datos[3]));
				insertarProducto(producto);
			}
			
			contadorLinea++;


		}
		tratarProductos();

		
	}
	
	private static void cargarConfiguracionBD() {
		
		//Leer las propiedades del Properties
		
	}

	private static void tratarProductos() {
	
		ProductoDAO productoDAO = new ProductoDAO(jdbcURL, jdbcUser, jdbcPass);
		
		List<Producto> listaProductos =  productoDAO.listarTodosLosProductos();
		
		//Mostrar por pantalla la lista productos
		//insertarlo en un json
		//insertarlo en un .dat
		//insertarlo en una BDOO.
		
		Producto productoModificar = new Producto("RIW38Q09","Clavos","Elementos metálicos para unir",7.42);
		
		
		productoDAO.eliminarProducto(productoModificar);
		
		Producto productoModificar = new Producto();
		
		productoDAO.actualizarProducto(productoModificar);
		
		Producto productoBuscado = productoDAO.obtenerProducto("C2JKQAQJ");
		
		System.out.println(productoBuscado);
		
	}
	
	
	
	
	
	
	
	

	private static void insertarProducto(Producto producto) {
		ProductoDAO productoDAO = new ProductoDAO(jdbcURL , jdbcUser,jdbcPass);		
		productoDAO.insertProducto(producto);
		
	}

}
