package Pruebas1;

import java.util.Scanner;

public class Ejercicio1Prueba1 {
	
	public static Scanner entrada = new Scanner(System.in);
	public static final int tam = 10;
	public static int[] pila = new int[tam];
	public static int[] cola = new int[tam];
	public static int seleccion ;
	public static void main(String[] args) {
		
		do {
			System.out.println("1. Añadir en pila");
			System.out.println("2. salir");
			seleccion = entrada.nextInt();
			switch(seleccion) {
			
			case 1:
				añadirPila();
				break;
			default:
				System.out.println("Seleccione una de las opciones");
			}
		
		
		
		}while(seleccion!=2);
	}

	private static void añadirPila() {
		boolean introducido = false;
		boolean movido = false;
		System.out.println("Introduce el numero en la pila");
		int numero = entrada.nextInt();
		for(int i = 0 ; i < tam && !introducido ; i++ ) {
			if(pila[i] == 0) {
				pila[i] = numero;
				introducido = true;
			}
		}
		for(int i = pila.length -1  ; i >= 0; i--) {			
				pila[i] = pila[i-1];
				pila[i] = 0;
				
				
			}
			
		}
		
		for( int numero1 : pila) {
			System.out.print(numero1+" | ");
			
		}
		
	}

}
