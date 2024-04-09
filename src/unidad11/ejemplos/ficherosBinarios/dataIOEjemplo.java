package unidad11.ejemplos.ficherosBinarios;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class dataIOEjemplo {

	public static void main(String[] args) {
		
		try(DataOutputStream dos = new DataOutputStream(new FileOutputStream("ficheros1/datos1.dat"))){
			
			dos.writeInt(42);
			dos.writeDouble(3.14);
			dos.writeUTF("Mañana no vengo");
			
			
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
			
		try(DataInputStream dis = new DataInputStream(new FileInputStream("ficheros1/datos1.dat"))){
			
		int entero = dis.readInt();	
		double doble = dis.readDouble();
		String cadena = dis.readUTF();
		
		System.out.println(entero);
		System.out.println(doble);
		System.out.println(cadena);
		
		
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		
		
	}

}
