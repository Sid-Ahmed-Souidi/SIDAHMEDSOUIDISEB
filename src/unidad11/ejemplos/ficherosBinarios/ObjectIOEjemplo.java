package unidad11.ejemplos.ficherosBinarios;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectIOEjemplo {

	public static void main(String[] args) {

		
		try(ObjectOutputStream oos = new ObjectOutputStream( new FileOutputStream(new File("ficheros1/personas.dat")))) {
			
			Persona persona1 = new Persona("Pegaso",38);
			Persona persona2 = new Persona("Adromeda",25);
			
			oos.writeObject(persona1);
			oos.writeObject(persona2);
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		
		try(ObjectInputStream ois = new ObjectInputStream( new FileInputStream(new File("ficheros1/personas.dat")))) {
			
	
			Persona persona1 = (Persona)ois.readObject();
			Persona persona2 = (Persona)ois.readObject();

			System.out.println(persona1);
			System.out.println(persona2);

			
		}catch(IOException   | ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		leerObjetosDelFichero();
		
	}

	private static void leerObjetosDelFichero() {
		System.out.println("Lectura de objetos desde el fichero");
		try(ObjectInputStream ois = new ObjectInputStream( new FileInputStream(new File("ficheros1/personas.dat")))) {
			
			
		while(true) {
			try {
				Persona persona = (Persona)ois.readObject();
				System.out.println(persona);
				
			}catch(EOFException e) {
				break;
			}
		}
			
		}catch(IOException   | ClassNotFoundException e) {
			e.printStackTrace();
	}
		

	}
}
