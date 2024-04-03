package unidad11.ejemplos;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class EscribirFichero2 {

	public static void main(String[] args) {


		String nombreFichero = "ejemplo2.txt";
		
		
		try(BufferedWriter escritor = new BufferedWriter(new FileWriter(nombreFichero))){
			
			escritor.write("Primera línea de texto");
			escritor.newLine();
			escritor.write("Segunda línea de texto");
			escritor.newLine();
			escritor.write("Tercera línea de texto");
			
			System.out.println("Escritura en fichero con exito");

			
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
		
	}

}
