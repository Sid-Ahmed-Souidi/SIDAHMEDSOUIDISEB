package unidad11.ejemplos;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class LeerFicheroTexto {

	public static void main(String[] args) {
	
		
		System.out.println("Leer fichero");
		
		String rutaFichero = "mancomunidades_extremadura.txt";
		
		
		//El File  se usa para trabajar como por ejemplo de los permisos en si del fichero como 
		//permisos de lectura etc..
		File fichero = new File(rutaFichero);
		
		
		FileReader lector = null;

		
		try {
			
			lector = new FileReader(fichero);
			int caracter;
			while((caracter = lector.read())!=-1) {
				System.out.print((char)caracter);
				
			}
			
		}catch(IOException e){
			e.printStackTrace();
		}
		
		
		
		
	}

}
