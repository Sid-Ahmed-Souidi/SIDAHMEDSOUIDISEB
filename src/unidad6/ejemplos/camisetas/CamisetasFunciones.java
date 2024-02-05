package unidad6.ejemplos.camisetas;

import java.util.Random;
import java.util.Scanner;

public class CamisetasFunciones {
	
	public static int seleccion;
	public static double precio;
	public static String descripcion;
	

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
			precio = 12.99;
		System.out.println("La camiseta de algodón cuesta "+precio);
		
	}else if(seleccion==2) {
		precio = 99.99;
			System.out.println("La camiseta de seda cuesta "+precio);
	}else if(seleccion==3) {
			precio = 22.99;
			System.out.println("La camiseta de lana cuesta "+precio);
	}else  {
			System.out.println("No ha seleccionado el material para la camiseta");
		}
	
				return precio;
	
		}
	
	
	public static String descripcion() {
		
		if(seleccion ==1) {	
			descripcion = "Descripción : camiseta de algodón .Marca Tommy hilfiger .Fabricada en Vietnam.";
		}else if(seleccion ==2) {
			descripcion ="Descripción : camiseta de seda .Marca BOSS .Fabricada en china" ;
		}else if(seleccion ==3) {
			descripcion ="Descripción : camiseta de lana .Marca Silk .Fabricada en EEUU.";
		}else {
		System.out.println(" ");
		}
		return descripcion;
	} 
}
	
