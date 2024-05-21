package unidad12.ejemplos.conexion.ferreteria;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductoDAO {
	List<Producto> listaProductos = new ArrayList<>();
  
	private String jdbcURL = "";
	private String jdbcUser =   "";
	private String jdbcPass = "";
	private Connection jdbcConnection;
	
	
	public ProductoDAO(String jdbcURL, String jdbcUser, String jdbcPass) {
		super();
		this.jdbcURL = jdbcURL;
		this.jdbcUser = jdbcUser;
		this.jdbcPass = jdbcPass;

	}


	
	//esta  funcion inserta el producto 
	public boolean insertProducto(Producto producto) {
		
		String sql = "INSERT INTO productos(codigo,nombre,descripcion,precio) VALUES (?,?,?,?)";
		
		boolean filaInsertada = false;
		
		// cargamos la configuracion para conectar con la base de datos
		conectar();
		
		try {
			PreparedStatement sentenciaPreparada = jdbcConnection.prepareStatement(sql);
			sentenciaPreparada.setString(1, producto.getCodigo());
			sentenciaPreparada.setString(2, producto.getNombre());
			sentenciaPreparada.setString(3, producto.getDescripcion());
			sentenciaPreparada.setDouble(4, producto.getPrecio());
			
			 filaInsertada = sentenciaPreparada.executeUpdate() > 0;

			 sentenciaPreparada.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		
		// Y desconectamos para evitar problemas de varias conexiones
		desconectar();
		return filaInsertada;
		
		
	}
	
	
		public List<Producto> listarTodosLosProductos(){
			String sql = "SELECT * FROM productos";
			conectar();

			PreparedStatement sentencia;
			try {
				sentencia = jdbcConnection.prepareStatement(sql);
				
				
				ResultSet resultado = sentencia.executeQuery();
				while(resultado.next()) {
					Producto producto = new Producto(resultado.getString("codigo"),resultado.getString("nombre")
							,resultado.getString("descripcion"),resultado.getDouble("precio"));
						listaProductos.add(producto);
				}
				return listaProductos;
				
				
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			desconectar();
			return listaProductos;
			
			}
		
		
	
		public boolean eliminarProducto(Producto producto) {
			// cada vez que hagamos alguna operacion con la base de datos nos conectamos y desconectamos
			conectar();

			try {
				String sql = "DELETE  FROM productos WHERE codigo =?";
				PreparedStatement sentencia;
				sentencia = jdbcConnection.prepareStatement(sql);
				sentencia.setString(1,producto.getCodigo());
				
				//Cuando es eliminar o modificar debe ser executeUpdate y cuando es un select es un executeQuery
				int  filasBorradas = sentencia.executeUpdate();
				System.out.println("Filas borradas "+filasBorradas);
				return true;

				
			} catch (SQLException e) {
				e.getMessage();
				e.printStackTrace();
			}
			desconectar();
			return false;
		
			
			}		
	
		
		
		public boolean actualizarProducto(Producto producto) {
			conectar();
			try {
				String sql = "UPDATE productos Set precio=? WHERE codigo =?";
				PreparedStatement sentencia;
				sentencia = jdbcConnection.prepareStatement(sql);
				sentencia.setDouble(1,200.0);
				sentencia.setString(2,producto.getCodigo());

				int  filasModificadas = sentencia.executeUpdate();
				System.out.println("Filas modificadas "+filasModificadas);
				return true;

				
			} catch (SQLException e) {
				e.getMessage();
				e.printStackTrace();
			}
			desconectar();
			return false;
		}
		
		
		public Producto obtenerProducto(String codigo) {
			String sql = "SELECT * FROM productos WHERE codigo=?";
			conectar();

			PreparedStatement sentencia;
			try {
				sentencia = jdbcConnection.prepareStatement(sql);
				
				sentencia.setString(1,codigo);
				ResultSet resultado = sentencia.executeQuery();
				while(resultado.next()) {
					Producto producto = new Producto(resultado.getString("codigo"),resultado.getString("nombre")
						,resultado.getString("descripcion"),resultado.getDouble("precio"));
						return producto;

				}
				
				
				
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			desconectar();
			return null;
			
			
			
		}
		
	
	// si la conexion es distinta de null y no esta cerrada

	private void desconectar() {
		try {
			if(jdbcConnection!=null && !jdbcConnection.isClosed()) {
				jdbcConnection.close();
}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	// si la conexion es  null y esta cerrrada 
	private void conectar() {
		try {
			if(jdbcConnection==null || jdbcConnection.isClosed()) {
				jdbcConnection = DriverManager.getConnection(jdbcURL,jdbcUser,jdbcPass);
				
			}
		} catch (SQLException e) {
			e.getMessage();
			e.printStackTrace();
		}
		
		
	}



	
	
	
	



}

