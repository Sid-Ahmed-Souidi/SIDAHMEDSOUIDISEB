package unidad11.ejemplos.directorios;

import java.io.File;

public class Fichero0Directorio {

	public static void main(String[] args) {

		File fichero = new File("/home/diurno/Sid/prueba2/fichero2");
		
		if(fichero.isDirectory()) {
			System.out.println("Es un directorio");
		}else {
			System.out.println("Es un fichero");
		}
		
		
	}

}
