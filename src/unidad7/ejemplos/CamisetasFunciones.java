package unidad7.ejemplos;

import java.util.Scanner;

public class CamisetasFunciones {

	public static Scanner entrada = new Scanner(System.in);
	
	public static String material() {
		
		System.out.println("Selecciona el tipo de material disponible");
		System.out.println("1.Algodon");
		System.out.println("2.Seda");
		System.out.println("3.Lana");
		int seleccion = entrada.nextInt();
		switch(seleccion) {
		case 1 :
			System.out.println("Ha seleccionado  Algodón");
			return "Algodon";
		case 2 :
			System.out.println("Ha seleccionado  Seda");
			return "seda";
		case 3 :
			System.out.println("Ha seleccionado  lana");	
			return "lana"; 
		default :
			System.out.println("debe seleccionar uno de los materiales disponibles");
			material();
			
		}
		
	}
}
