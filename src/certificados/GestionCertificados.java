package certificados;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.System.Logger;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import unidad12.ejemplos.conexion.ferreteria.Producto;
import unidad12.ejemplos.conexion.ferreteria.ProductoDAO;

public class GestionCertificados {

	
	static Properties propiedades = new Properties();
	
	static String url = "";
	static String usuario=  "";
	static String password = "";


	static List<Certificado> listaCertificadosFicheros = new ArrayList<Certificado>();

	public static void main(String[] args) {
		
		cargarConfiguracion();
		  url = propiedades.getProperty("urlcasa");
		  usuario = propiedades.getProperty("usuariocasa"); 
		  password = propiedades.getProperty("passwordcasa");
		 
		  
		List<String> listaDatos = new ArrayList<String>();
		

		
		try {
			//En la listaProductos tenemos todos los productos obtenidos desde el fichero productos.csv
			listaDatos = Files.readAllLines(Paths.get("ficheros//certificados//certificadosEnergeticos.txt"), StandardCharsets.UTF_8);
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		int contadorLinea = 0;

		// recorremos listaProductos para trocear los datos y crear los objetos de tipo producto
		for(String lineaCertificado : listaDatos) {
			if(contadorLinea>0) {
				String[] datos = lineaCertificado.split(";");
				//validar
				
				
				Certificado certificado = new Certificado(datos[0],datos[1], datos[2],datos[3],datos[4],datos[5],datos[6],datos[7]);
				listaCertificadosFicheros.add(certificado);
			}
			
			
			contadorLinea++;

		}		
		compararCertificados(listaCertificadosFicheros);

		
		
	}
	
	
	private static void compararCertificados(List<Certificado> listaCertificadosFicheros2) {
		// creamos un objeto donde pasamos los datos de la conexion a base de datos
		CertificadoDAO certificadoDAO= new CertificadoDAO(url , usuario,password);		
		//vamos pasando cada producto para insertarlo en la base de datos 
		certificadoDAO.leerCertificadoBd(listaCertificadosFicheros);
		
	}





	public static void cargarConfiguracion() {
		// carga los datos del ficherpo de propiedades
		FileInputStream fis;
		try {

			fis = new FileInputStream("ficheros" + File.separator + "certificados" +  File.separator + "conexion2.properties");
			propiedades.load(fis);

		} catch (IOException e) {

			e.printStackTrace();
		}
	}
	
	

}
