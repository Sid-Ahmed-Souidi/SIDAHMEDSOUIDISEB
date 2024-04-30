import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import unidad12.ejemplos.conexion.salidaEntrada.Constantes;

public class CONEXIONVIRGENBD {
	static Properties propiedades = new Properties(); 

	
	public static void main(String[] args) {

		
		

		
	}
	
	public static void recuperarListadoPersonas() {
		
		String url = propiedades.getProperty("url");
		String bd = propiedades.getProperty("basedatos");
		String usuario = propiedades.getProperty("usuario");
		String password = propiedades.getProperty("password");
		
	}
	
	
	
	private static void cargarConfiguracion() {
		
		FileInputStream fis;
		
		try {
			fis = new FileInputStream(Constantes.fichero);
			propiedades.load(fis);
			
		}catch(IOException e){
			e.printStackTrace();
			e.getMessage();
		}
		
	}


}
