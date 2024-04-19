package unidad11.ejemplos.directorios;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class CreacionDirectoriosFicheros {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingrese la ruta del directorio a crear : ");
		String nombreDirectorio = entrada.nextLine();
		
		//no crea directorio
		File directorio = new File(nombreDirectorio);
		if(directorio.exists()) {
			System.out.println("Directorio ya existe...");			
		
		}else {
			System.out.println("El directorio no existe");
			//mkdirs crea toda la estructura necesaria
			//con mkdir crea solo el directorio
			if(directorio.mkdir()) {
				System.out.println("Directorio creado");
			}else {
				System.out.println("Directorio no creado");
			}
		
		}
		
		
		System.out.println("Ingrese el nombre del fichero a crear");
		String nombreFichero = entrada.nextLine();
		// de esta forma ponemos el directamente la ruta y a la hora de pasar por teclado solo pasamos el nombre del fichero
		File fichero = new File(nombreDirectorio+"//"+nombreFichero);
		
		if(fichero.exists()){
			System.out.println("El fichero existe");
		}else {
			
			try {
				if(fichero.createNewFile()) {
					System.out.printf("El fichero %s se ha creado con existo%n",nombreFichero);
				}else {
					System.out.println("Fichero no se ha creado");
				}
				
				
				
			}catch(IOException e){
				e.printStackTrace();
				
			}
			
		}
		entrada.close();
		
		
		
		
		
		
	}

}
