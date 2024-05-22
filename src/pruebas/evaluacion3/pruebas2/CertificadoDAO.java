package pruebas.evaluacion3.pruebas2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import unidad11.ejemplos.sociedadesCoperativas.SociedadCoperativa;
import unidad12.ejemplos.conexion.ferreteria.Producto;

public class CertificadoDAO {
	
	private static String url = "";
	private static String usuario =  "";
	private static String password = "";
	private static Connection jdbcConnection;
	
    public static List<Certificado> certificadosBD = new ArrayList<Certificado>();
    public static List<Certificado> certificadoFichero = new ArrayList<Certificado>();


	
	public CertificadoDAO(String url, String usuario, String password) {
		super();
		this.url = url;
		this.usuario = usuario;
		this.password = password;
		
	}


	public static void leerCertificadoBd(List<Certificado> listaCertificadosFicheros) {
		String sql = "SELECT * FROM certificados_energeticos";
		conectar();
		PreparedStatement sentencia = null;
		try {
			try {
				sentencia = jdbcConnection.prepareStatement(sql);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			ResultSet resultado = sentencia.executeQuery();
			/**
			 * 	public Certificado(String id, String propietario, String direccion, String tipoPropiedad,
			String clasificacionEnergetica, String fechaExpedicion, String empresaCertificadora, String codigoTecnico) {
			 */
			while(resultado.next()) {
				Certificado certificado1 = new Certificado(resultado.getString("id_certificado"),resultado.getString("propietario")
						,resultado.getString("direccion"),resultado.getString("tipo_de_propiedad"),resultado.getString("clasificacion_energetica"),
					resultado.getString("fecha_de_expedicion"),resultado.getString("empresa_certificadora") ,resultado.getString("codigo_tecnico"));
					certificadosBD.add(certificado1);
			}
			
			
			
			mostrarCertificados(listaCertificadosFicheros,certificadosBD);
			comprobarCertificados(listaCertificadosFicheros,certificadosBD);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		desconectar();
		
		
		
	}
	
	
	
	
	


	private static void mostrarCertificados(List<Certificado> listaCertificadosFicheros,
			List<Certificado> certificadosBD2) {
				for (Certificado certificado : certificadosBD2) {
					System.out.println("Certificados BD "+certificado);
					
				}
				for (Certificado certificado1 : listaCertificadosFicheros) {
					System.out.println("Certificados ficheros "+certificado1);
					
				}

		
	}


	
	private static void comprobarCertificados(List<Certificado> listaCertificadosFicheros,List<Certificado> certificadosBD2) {
		for (Certificado certificado : certificadosBD2) {
			for (Certificado certificado1 : listaCertificadosFicheros) {
				if(certificado.getCodigoTecnico().equals(certificado1.getCodigoTecnico())) {
					System.out.println("Certificado "+certificado.getCodigoTecnico());
					
					
					
					
					
				
			}
			}

			
		}
				
			
		
		
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
	
	private static LocalDate transformarFecha(String fecha) {
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        LocalDate fechaLocalDate = null;
        try {
            fechaLocalDate = LocalDate.parse(fecha, formato);
        } catch (DateTimeParseException e) {
            // Manejar el error, por ejemplo, imprimir un mensaje de error
            System.err.println("Error al parsear la fecha: " + e.getMessage());
        }
        return fechaLocalDate;

		
	}

	
	
	
	
	
	
	

}
