package unidad11.ejemplos;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class EscribirFichero4 {

	public static void main(String[] args) {

		
		File fichero = null;
		FileWriter fw = null;
		BufferedWriter bw = null;
		PrintWriter pw = null;
		
		try {
			
			fichero = new File("ficheros1//nombres.txt");
			//con el true es el append añadir en vez de sobrescribir
			fw = new FileWriter(fichero,true);
			bw = new BufferedWriter(fw);
			pw = new PrintWriter(bw);
			
			
			pw.println("Audi");
			pw.println("Mercedes");
			pw.println("mazda");

			
			pw.flush();
			System.out.println("Datos añadidos");
			
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				
				
				if(fw!=null) {
				fw.close();
				}if(bw!=null) {
					bw.close();
				}if(pw!=null) {
					pw.close();
					}
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
		
		
		
	}

}
