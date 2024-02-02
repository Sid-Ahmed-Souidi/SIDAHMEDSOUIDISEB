package unidad6.ejemplos;

import java.util.Random;
import java.util.Scanner;

public class CamisetasFunciones {
	
	public static int seleccion;
	public static double precio;
	

	public static Scanner entrada = new Scanner(System.in);
	
	public static String material() {
		String camiseta = "vacio";
		System.out.println("Selecciona el tipo de material disponible (El precio deribará segun el material seleccionado)");
		System.out.println("1.Algodon");
		System.out.println("2.Seda");
		System.out.println("3.Lana");
		seleccion = entrada.nextInt();

	if(seleccion==1) {
			System.out.println("Ha seleccionado  Algodón");
			return "Algodón";
	}else if(seleccion==2) {
			System.out.println("Ha seleccionado  Seda");
			return "seda";
	}else if(seleccion==3) {
			System.out.println("Ha seleccionado  lana");	
			return "lana"; 
	}else
			System.out.println("debe seleccionar uno de los materiales disponibles");
				return camiseta;
		
		
	}
	public static int generarIde() {
		Random random = new Random();
		   int ide = random.nextInt(90000000);
		   return ide;
	}
	
	public static double precioCamisetas() {
		
		if(seleccion==1) {
			System.out.println("La camiseta de algodón cuesta");
			return  precio = 12.99;
	}else if(seleccion==2) {
			System.out.println("La camiseta de seda cuesta");
			return  precio =99.99;
	}else if(seleccion==3) {
			System.out.println("La camiseta de lana cuesta");
			return  precio =22.99; 
	}else
			System.out.println("No ha seleccionado el material para la camiseta");
				return  precio = 00.00;	
	}
	
	public static String descripcion() {
		
		if(seleccion ==1) {
			return "El material seleccionado es l algodon con un precio de 12.99";
		}else if(seleccion ==2) {
			return "El material seleccionado es la seda con un precio de 99.99";
		}else if(seleccion ==3) {
			return "El material seleccionado es la lana con un precio de 22.99";
		}else {
			return "no has seleccionado los pasos anteriores";
		}
	} 
}
	
