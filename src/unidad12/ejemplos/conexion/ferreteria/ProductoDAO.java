package unidad12.ejemplos.conexion.ferreteria;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductoDAO {
	List<Producto> lista = new ArrayList<>();
  
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


	public boolean insertProducto(Producto producto) {
		
		String sql = "INSERT INTO productos(codigo,nombre,descripcion,precio) VALUES (?,?,?,?)";
		
		boolean filaInsertada = false;
		
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
		
		desconectar();
		return filaInsertada;
		
		
	}
	
	
		public List<Producto> listarTodosLosProductos(){
			
			String sql = "SELECT * FROM productos";
			PreparedStatement sentencia = jdbcConnection.prepareStatement(sql);
			
		
			
			ResultSet resultado = sentencia.executeQuery();
			while(resultado.next()) {
				Producto producto = new Producto(resultado.getString("codigo"),resultado.getString("nombre")
						,resultado.getString("descripcion"),resultado.getDouble("precio"));
				
			}
			
		}
	
		public boolean eliminarProducto(Producto producto) {
			
			//String sql = "DELETE FROM productos WHERE codigo = "+producto.getCodigo();
		
		}
	
		public boolean actualizarProducto(Producto producto) {
		
		}
		
		public Producto obtenerProducto(String codigo) {
			
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

