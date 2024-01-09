package unidad5.ejemplos;

import java.util.Scanner;

public class Ejercicio2repaso {

	
	public static int[] matriz = {3 ,5,67,8,9};
	
	public static Scanner entrada = new Scanner(System.in);
	
	public static void main(String[] args) {
		//Escriba un programa Java para probar si una matriz contiene un valor específico.		
		buscarElemento();
	
	}


	private static void buscarElemento() {
		System.out.println("Introduzca el elemento que quiere probar si esta en la matriz");
		int elemento = entrada.nextInt();
		for(int i = 0 ; i < matriz.length ; i++) {
			if(matriz[i] == elemento) {
				System.out.println("El elemento esta en la matriz "+elemento);
				System.out.println("En la posicion "+(i+1));
				
			}
		}
		
		
	}

}
