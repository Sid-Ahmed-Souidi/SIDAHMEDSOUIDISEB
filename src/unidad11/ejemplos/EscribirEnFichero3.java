package unidad11.ejemplos;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class EscribirEnFichero3 {

	public static void main(String[] args) {

		
		try {
			PrintWriter escritor = new PrintWriter("ejemplo3.txt");
			
			escritor.write("Este es un ejemplo de como escribir con printWriter");
			escritor.println();
			escritor.printf("Podemos escribir %s con formato","textos");
			escritor.println();
			escritor.printf("Podemos escribir %d con formato",6);

			escritor.close();
			
			
		}catch(FileNotFoundException e) {
			e.printStackTrace();
			
		}
		
		
	}

}
