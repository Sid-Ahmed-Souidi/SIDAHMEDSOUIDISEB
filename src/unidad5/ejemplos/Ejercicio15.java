package unidad5.ejemplos;

import java.util.Scanner;

public class Ejercicio15 {

	static final int TAM = 6;
	static int [] array = new int[TAM];
	
	static Scanner entrada = new Scanner(System.in);
	
	public static void main(String[] args) {

		introducirElementos();
		 suma();
		 promedio();
		 mayorElemento();
		 ordenAscendente();

	}

	private static void ordenAscendente() {
		 int tmp ;  
		for(int i = 0 ; i < TAM ; i++) {
			if(array[i] > array[i+1]) {
				tmp = array[i];
				
				
			}
			
			
		}
		
		
	}

	

	private static void mayorElemento() {
		int elementoM = 0 ; 
		for(int i = 0 ; i < TAM ; i++) {
			if(elementoM < array[i]) {
				elementoM = array[i];
				
			}
			
		}System.out.println("El elemento mayor de la array es "+elementoM);
		
		
	}

	private static void promedio() {
		int contador = 0;
		for(int i = 0 ; i < TAM ; i++) {
			contador += array[i];
		
		}
		
		int  media= contador / TAM ; 
		System.out.println(media);	
		
	}

	private static void introducirElementos() {
		for(int i = 0 ; i < TAM ; i++) {
			System.out.println("Introduzca un numero");
			int numero = entrada.nextInt();
			array[i] = numero;
		}
		for(int numeros : array) {
			System.out.println(numeros);
		}
	}

	private static void suma() {
		int contador = 0;
		for(int i = 0 ; i < TAM ; i++) {
			contador += array[i];
		
		}System.out.println(contador);	
	}

}
