package certificados;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.neodatis.odb.ODB;

public class CertificadoDAO {
	
	
	static Logger logger = Logger.getLogger(CertificadoDAO.class);


	
	private static String url = "";
	private static String usuario =  "";
	private static String password = "";
	private static Connection jdbcConnection;
	
    public static List<Certificado> certificadosBD = new ArrayList<Certificado>();
    public static List<Certificado> certificadosEliminar = new ArrayList<Certificado>();
    public static List<Certificado> certificadosInsertar = new ArrayList<Certificado>();
    public static List<Certificado> certificadosBOO = new ArrayList<Certificado>();
    public static List<Certificado> certificadosBOOResidenciales = new ArrayList<Certificado>();



	
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
		
			while(resultado.next()) {
				Certificado certificado1 = new Certificado(resultado.getString("id_certificado"),resultado.getString("propietario")
						,resultado.getString("direccion"),resultado.getString("tipo_de_propiedad"),resultado.getString("clasificacion_energetica"),
					resultado.getString("fecha_de_expedicion"),resultado.getString("empresa_certificadora") ,resultado.getString("codigo_tecnico"));
					certificadosBD.add(certificado1);
			}
			
			//comprobamos los certificados de ambas listas
			comprobarCertificados(listaCertificadosFicheros,certificadosBD);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		desconectar();
	
	}
	
	
	/**
	private static void mostrarCertificados(List<Certificado> listaCertificadosFicheros,
			List<Certificado> certificadosBD2) {
				for (Certificado certificado : certificadosBD2) {
					System.out.println("Certificados BD "+certificado);
					
				}
				for (Certificado certificado1 : listaCertificadosFicheros) {
					System.out.println("Certificados ficheros "+certificado1);
					
				}
	}
	*/


	
	private static void comprobarCertificados(List<Certificado> listaCertificadosFicheros,List<Certificado> certificadosBD2) {
		
		PropertyConfigurator.configure("log4j.properties");

		for (int i = 0 ; i< listaCertificadosFicheros.size(); i++) {
			Certificado certificadoFicheros = listaCertificadosFicheros.get(i);
            Certificado certificadoBaseDatos = certificadosBD2.get(i);
            if((certificadoFicheros.equals(certificadoBaseDatos))==true) {
            	//System.out.println("Certificado fichero iguales   "+certificadoFicheros);
            	//System.out.println("Certificado base de datos  iguales "+certificadoBaseDatos);
            	// paso a la lista de certificados BOO los certificadosFicheros ya que son los correctos
            	certificadosBOO.add(certificadoFicheros);

            }else {
            	//System.out.println("No son iguales");
            	certificadosEliminar.add(certificadoBaseDatos);
            	// tener en cuenta que solo un certificado es correcto y los demas no coinciden en los datos
            	// con la tabla por eso se va a eliminar e insertar los certificados de ficheros
            	certificadosInsertar.add(certificadoFicheros);
            	certificadosBOO.add(certificadoFicheros);
            }
		}
		
		logger.info("Elimina los certificados de la tabla erróneos");
		logger.debug("Elimina los certificados de la tabla erróneos");

		   eliminarCertificadoTabla(certificadosEliminar);
			logger.info("Inserta los certificados del fichero");
			logger.debug("Inserta los certificados del fichero");
           insertarCertificadoFichero(certificadosInsertar);
   			logger.info("Mostrar los certificados de la tabla de la base de datos relacional ordenada por codigo tecnico");
   			logger.debug("Mostrar los certificados de la tabla de la base de datos relacional ordenada por codigo tecnico");
   			mostrarTablaOrdenada();
   			logger.info("Inserta los certificados de tipo residencial en una base de datos orientada a objetos");
   			logger.debug("Inserta los certificados de tipo residencial en una base de datos orientada a objetos");
   			System.out.println();
   			System.out.println();
            insertarCertificadoBOO(certificadosBOO);
            
   			
   		

				
		}

		
	

	private static void mostrarTablaOrdenada() {
		conectar();
		try {
		String sql = "SELECT * FROM certificados_energeticos ORDER BY codigo_tecnico";
		PreparedStatement sentencia;
		sentencia = jdbcConnection.prepareStatement(sql);
		//Cuando es eliminar o modificar debe ser executeUpdate y cuando es un select es un executeQuery
		ResultSet resultado = sentencia.executeQuery();
		System.out.println();
		System.out.println("Tabla ordenada por codigo_tecnico");
		System.out.println();
		while(resultado.next()) {
			System.out.println("ID Certificado: " + resultado.getString("id_certificado") + 
                    ", Propietario: " + resultado.getString("propietario") +
                    ", Dirección: " + resultado.getString("direccion") +
                    ", Tipo de Propiedad: " + resultado.getString("tipo_de_propiedad") +
                    ", Clasificación Energética: " + resultado.getString("clasificacion_energetica") +
                    ", Fecha de Expedición: " + resultado.getString("fecha_de_expedicion") +
                    ", Empresa Certificadora: " + resultado.getString("empresa_certificadora") +
                    ", Código Técnico: " + resultado.getString("codigo_tecnico"));
		}
			} catch (SQLException e) {
		e.getMessage();
		e.printStackTrace();
	}
	desconectar();
		
		
	}


	private static void insertarCertificadoBOO(List<Certificado> certificadosBOO2) {
	    List<Certificado> certificadosBOOResidenciales = new ArrayList<Certificado>();

		for (Certificado certificado : certificadosBOO2) {
			if(certificado.getTipoPropiedad().equalsIgnoreCase("Residencial")) {
				certificadosBOOResidenciales.add(certificado);
			}else {
			}
			
		}
		
		
		AppCRUD appcrud = new AppCRUD();
		appcrud.vaciarBaseDeDatos();
		ODB odb = appcrud.insertarCertificadosBOO(certificadosBOOResidenciales);
		System.out.println();
		System.out.println("Lectura de los certificados  de la base de datos orientada a objetos");
		System.out.println();
		appcrud.leerCertificadosBOO(odb);
		
		
	}


	
	
	
	//inserto los certificados del fichero que no estan en la tabla despues de eliminar los erroneos
	private static void insertarCertificadoFichero(List<Certificado> certificadosInsertar2) {
		for (Certificado certificadoInsertar : certificadosInsertar2) {
			String sql = "INSERT INTO certificados_energeticos(id_certificado,"
					+ "propietario,direccion,tipo_de_propiedad,clasificacion_energetica,fecha_de_expedicion,"
					+ "empresa_certificadora,codigo_tecnico) VALUES (?,?,?,?,?,?,?,?)";
			
			boolean filaInsertada = false;

			conectar();
			try {
				
			PreparedStatement sentencia = jdbcConnection.prepareStatement(sql);
			sentencia.setString(1,certificadoInsertar.getId());
			sentencia.setString(2,certificadoInsertar.getPropietario());
			sentencia.setString(3,certificadoInsertar.getDireccion());
			sentencia.setString(4,certificadoInsertar.getTipoPropiedad());
			sentencia.setString(5,certificadoInsertar.getClasificacionEnergetica());
			sentencia.setString(6,certificadoInsertar.getFechaExpedicion());
			sentencia.setString(7,certificadoInsertar.getEmpresaCertificadora());
			sentencia.setString(8,certificadoInsertar.getCodigoTecnico());

			
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
		
		
	}


	
	
	// elimino los certificados que no coinciden los he pasado a la lista certificadosEliminar
	//y los elimindo de la tabla 
	private static void eliminarCertificadoTabla(List<Certificado> certificadosEliminar2) {
		for (Certificado certificadoEliminar : certificadosEliminar2) {
		conectar();
			try {
			String sql = "DELETE  FROM certificados_energeticos WHERE id_certificado =?";
			PreparedStatement sentencia;
			sentencia = jdbcConnection.prepareStatement(sql);
			sentencia.setString(1,certificadoEliminar.getId());
			
			//Cuando es eliminar o modificar debe ser executeUpdate y cuando es un select es un executeQuery
			int  filasBorradas = sentencia.executeUpdate();
			System.out.println("Filas borradas "+filasBorradas);
		} catch (SQLException e) {
			e.getMessage();
			e.printStackTrace();
		}
		desconectar();
		
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
	
}
