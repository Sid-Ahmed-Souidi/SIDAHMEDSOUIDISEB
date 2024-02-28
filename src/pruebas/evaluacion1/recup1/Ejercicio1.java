package pruebas.evaluacion1.recup1;

import java.util.Scanner;

public class Ejercicio1 {

	public static Scanner entrada = new Scanner(System.in);
	public static final int tam = 6;
	public static  int[] matriz = new int[6];
	public static  int[] matriz2 = new int[6];
	public static int[] matriz3 = new int[12];
	
	
	public static void main(String[] args) {
		
		numeros1tabla();
		numeros2tabla();
		mostrarArray();
		
	}
	private static void mostrarArray() {
		
		for(int i = 0 ; i < matriz.length ; i++) {
			for(int j =0 ; j <matriz2.length ; j++ ) {
				if(matriz[i]<matriz[j]) {
					
				}
				
			}
			
		}
		
		
		
		
	}
	private static void numeros2tabla() {
		System.out.println("Introducir numero en la segunda tabla");
		for(int i = 0 ; i < tam ; i++) {
			System.out.println("Introduce el numero "+(i+1)+" de la segunda tabla");
			int numero = entrada.nextInt();
			matriz[i] = numero;
		}
		
	}
	private static void numeros1tabla() {
		System.out.println("Introducir numero en la primera tabla");
		for(int i = 0 ; i < tam ; i++) {
			System.out.println("Introduce el numero "+(i+1)+" de la primera tabla");
			int numero = entrada.nextInt();
			matriz[i] = numero;
		}
		
	}

}
