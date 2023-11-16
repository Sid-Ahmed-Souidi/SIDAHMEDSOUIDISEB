package unidad4.ejemplos;

import java.util.Scanner;

public class Recursividad {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduzca las veces que quiere ser saludado");
		int numVeces = entrada.nextInt();
		System.out.println("Saludo con bucle");
		saludar(numVeces);
		System.out.println("Saludo con recursividad");
		saludarRecursivamente(numVeces);

	}
	private static void saludar(int veces) {
		for(int i=0;i<veces;i++) {
			System.out.println("Hola");
		}
	}


	private static void saludarRecursivamente(int veces) {

		if(veces>0) {
			System.out.println("Hola");
			saludarRecursivamente(veces-1);
		}

	}




}
