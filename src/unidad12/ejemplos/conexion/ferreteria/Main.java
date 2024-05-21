package unidad12.ejemplos.conexion.ferreteria;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Main {
	/*
	static String jdbcURL = "jdbc:mysql://192.168.0.101:3306/SouidiElBaroudi";
	static String jdbcUser =   "SouidiElBaroudi";
	static String jdbcPass = "Soui";
	
	*/
	static String jdbcURL = "jdbc:mysql://localhost:3306/bd";
	static String jdbcUser =   "root";
	static String jdbcPass = "12345";
	public static void main(String[] args) {
		
		
		List<String> listaProductos = new ArrayList<String>();
		
		try {
			//En la listaProductos tenemos todos los productos obtenidos desde el fichero productos.csv
			listaProductos = Files.readAllLines(Paths.get("ficheros//configuracion//bd//ferreteria//productos.csv"), StandardCharsets.UTF_8);
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		int contadorLinea = 0;
		// recorremos listaProductos para trocear los datos y crear los objetos de tipo producto
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
		// aqui una vez insertados los productos en la base de datos se realiza los diferentes tratamientos UPDATE ,SELECT , DELETE 
		tratarProductos();

		
	}
	
	/**
	private static void cargarConfiguracionBD() {
		
		//Leer las propiedades del Properties
		
	}
	*/
	private static void tratarProductos() {
	
		ProductoDAO productoDAO = new ProductoDAO(jdbcURL, jdbcUser, jdbcPass);
		
		
		//La funcion listaTodosLosProductos devuelve una lista de todos los productos 
		List<Producto> listaProductos =  productoDAO.listarTodosLosProductos();
		for (Producto producto : listaProductos) {
			System.out.println("PRODUCTO=="+producto);
		}
		
		
		
		//Mostrar por pantalla la lista productos
		//insertarlo en un json
		//insertarlo en un .dat
		//insertarlo en una BDOO.
		
		 //llamamos al producto a modificar 
		
		// hacemos referencia al producto que queremos eliminar 
		Producto productoEliminar = new Producto("GWXDYH90","Martillo","Herramienta manual para golpear",31.65);
		// llamamos a la funcion que se encarga de eliminar el producto
		System.out.println(productoDAO.eliminarProducto(productoEliminar));
		
		
		// hacemos referencia al producto que queremos modificar 
		Producto productoModificar = new Producto("TGQITQSE","Llave inglesa","Llave ajustable",113.69);
		
		// llamamos a la funcion que se encarga de modificar el producto
		System.out.println(productoDAO.actualizarProducto(productoModificar));
		
		
		// apartir del codigo lo pasamos a la funcion obtenerProducto donde nos devuelve el producto buscado
		Producto productoBuscado = productoDAO.obtenerProducto("C2JKQAQJ");
		
		System.out.println("PRODUCTO ENCONTRADO =="+productoBuscado);
		
	}
	
	
	
	
	
	
	
	
	

	private static void insertarProducto(Producto producto) {
		// creamos un objeto donde pasamos los datos de la conexion a base de datos
		ProductoDAO productoDAO = new ProductoDAO(jdbcURL , jdbcUser,jdbcPass);		
		//vamos pasando cada producto para insertarlo en la base de datos 
		productoDAO.insertProducto(producto);
		
	}

}
