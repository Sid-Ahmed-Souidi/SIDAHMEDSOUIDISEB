package Pruebas1;

import java.util.Scanner;

public class Ejercicio1Prueba1 {
	
	public static Scanner entrada = new Scanner(System.in);
	public static final int tam = 10;
	public static int[] pila = new int[tam];
	public static int[] cola = new int[tam];
	public static int seleccion ;
	public static int contador ;
	public static int contador0 ;

	public static void main(String[] args) {
		
		do {
			System.out.println("1. Añadir en pila");
			System.out.println("2.Extraer de la pila");
			System.out.println(". salir");
			seleccion = entrada.nextInt();
			switch(seleccion) {
			
			case 1:
				añadirPila();
				break;
			case 2:
				extraerPila();
				break;
			
			default:
				System.out.println("Seleccione una de las opciones");
			}
		}while(seleccion!=3);
	}
	private static void extraerPila() {
		boolean extraido = false ;
		for(int i = 0 ; i < pila.length && !extraido ; i++) {
			if(pila[i] != 0) {
			pila[i] =0;
			System.out.println("Elemento extradido");
			extraido = true;
			mostrarArray();
			}
		}
		
		// terminar la comprobacion de que si la fila esta vacia mandar un mensaje 
		for(int j = 0 ; j < pila.length ; j++) {
			if(pila[j] == 0) {
				contador++;
				

			}
			
		}
					
				
			
		
	}
	private static void añadirPila() {
		System.out.println("Introduce el numero en la pila");
		int numero = entrada.nextInt();
		if(contador== pila.length) {
			System.out.println("La cola esta llena");
		}
		else {
		for(int i = pila.length -1  ; i > 0; i--) {	
				pila[i] = pila[i-1];// todos los elementos se desplazan a la derecha
				//System.out.println(i+"-"+(i-1) );
			}
			pila[0] = numero;
			contador++;
		System.out.println("Contador "+contador);
		}
		mostrarArray();
		
	}

	private static void mostrarArray() {
		for( int numero1 : pila) {
			System.out.print(numero1+" | ");
		}System.out.println();		
	}

}
