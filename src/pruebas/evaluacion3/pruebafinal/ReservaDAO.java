package pruebas.evaluacion3.pruebafinal;

import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import certificados.Certificado;

public class ReservaDAO {
	private static String url = "";
	private static String usuario =  "";
	private static String password = "";
	private static Connection jdbcConnection;
	
	

	public ReservaDAO(String url, String usuario, String password) {
		super();
		this.url = url;
		this.usuario = usuario;
		this.password = password;
		
	}
	
     public static void crearDirectorios(List<Reserva> listaCitas) {
		
	for (Reserva reserva : listaCitas) {
		File directorio = new File("ficheros/"+ File.separator + reserva.getDocumento());
		File fichero = null;

		if(directorio.exists()) {
			System.out.println(directorio+" ya existe");
		
		
		}else {
			directorio.mkdirs();
			fichero = new File(directorio + File.separator + "justificantes.txt");
			try {
				fichero.createNewFile();
			} catch (IOException e) {
				e.getMessage();
				e.printStackTrace();
			}
		}
		

	}

	}

	
	
	
	public static void insertarReserva(Reserva reserva) {
			String sql = "INSERT INTO reservas(documento,"
					+ "fecha,hora,cita,estado_pago,tramite,"
					+ "telefono,email) VALUES (?,?,?,?,?,?,?,?)";
			
			boolean filaInsertada = false;

			conectar();
			try {
				
			PreparedStatement sentencia = jdbcConnection.prepareStatement(sql);
			sentencia.setString(1,reserva.getDocumento());
			sentencia.setString(2,reserva.getFecha());
			sentencia.setString(3,reserva.getHora());
			sentencia.setString(4,reserva.getCita());
			sentencia.setString(5,reserva.getEstado_pago());
			sentencia.setString(6,reserva.getTramite());
			sentencia.setString(7,reserva.getTelefono());
			sentencia.setString(8,reserva.getEmail());

			
			//Cuando es eliminar o modificar debe ser executeUpdate y cuando es un select es un executeQuery
			 filaInsertada = sentencia.executeUpdate() > 0;
			 
			 sentencia.close();

		} catch (SQLException e) {
			e.getMessage();
			e.printStackTrace();
		}
		desconectar();
		System.out.println("Fila Insertada "+filaInsertada);
		
		}
		
		
	
	
	
	
	
	private static void desconectar() {
		try {
			if(jdbcConnection!=null && !jdbcConnection.isClosed()) {
				jdbcConnection.close();
}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	

	
	private static  void conectar() {
		try {
			if(jdbcConnection==null || jdbcConnection.isClosed()) {
				jdbcConnection = DriverManager.getConnection(url,usuario,password);
				
			}
		} catch (SQLException e) {
			e.getMessage();
			e.printStackTrace();
		}
		
		
	}


	public void leerReserva() {
		conectar();
		try {
		String sql = "SELECT * FROM reservas ";
		PreparedStatement sentencia;
		sentencia = jdbcConnection.prepareStatement(sql);
		//Cuando es eliminar o modificar debe ser executeUpdate y cuando es un select es un executeQuery
		ResultSet resultado = sentencia.executeQuery();
		System.out.println();
		System.out.println("Tabla ordenada por codigo_tecnico");
		System.out.println();
		while(resultado.next()) {
			System.out.println("ID reserva: " + resultado.getString("id") + 
                    ", documento: " + resultado.getString("documento") +
                    ", fecha: " + resultado.getString("fecha") +
                    ", hora: " + resultado.getString("cita") +
                    ", estado_pago: " + resultado.getString("estado_pago") +
                    ", tramite: " + resultado.getString("tramite") +
                    ", telefono: " + resultado.getString("telefono") +
                    ", email: " + resultado.getString("email"));
		}
			} catch (SQLException e) {
		e.getMessage();
		e.printStackTrace();
	}
	desconectar();
				
	}
	
	

}
