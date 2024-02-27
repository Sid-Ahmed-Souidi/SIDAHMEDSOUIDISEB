package Pruebas1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Ejercicio1Prueba1 {
	
	public static Scanner entrada = new Scanner(System.in);
	public static final int tam = 10;
	public static int[] pila = new int[tam];
	public static int[] cola = new int[tam];
	public static int seleccion ;
	public static int contadorPila ;
	public static int contadorCola ;
	// estos contadores sirven para saber si en ambas arrays estan vacias de elementos 
	public static int cantidadPila;
	public static int cantidadCola ;
	 
	

	public static void main(String[] args) {
		
		do {
			System.out.println("1. Añadir en pila");
			System.out.println("2.Extraer de la pila");
			System.out.println("3. Añadir en cola");
			System.out.println("4.Extraer de la cola");
			System.out.println("5. Numeros pares de la pila");
			System.out.println("6.Suma de los impares y mayores de la cola");
			System.out.println("7.Ordenar decreciente la cola");
			System.out.println("8.Secuencia que permite buscar elementos en la pila ");
			System.out.println(". salir");
			seleccion = entrada.nextInt();
			switch(seleccion) {
			
			case 1:
				añadirPila();
				break;
			case 2:
				extraerPila();
				break;
			case 3: 
				añadirCola();
				break;
			case 4 :
				extraerCola();
			case 5 :
				paresPila();
				break;
			case 6:
				sumaCola();
				break;
			case 7:
				ordenDecre();
				break;
			case 8:
				buscarSecuencia();
				break;
			case 9:
				System.out.println("Saliendo");
			default:
				System.out.println("Seleccione una de las opciones");
			}
		}while(seleccion!=8);
	}
	private static void buscarSecuencia() {
		System.out.println("Introduzca el elemento que quieras buscar en la pila");
		int elemento = entrada.nextInt();
		boolean encontrado = false;
		for(int i = 0; i < pila.length && !encontrado ; i++) {
			if(pila[i]== elemento) {
				System.out.println("El elemento si se encuentra en la pila "+pila[i]);
				encontrado = true;
			}
		}
		if(encontrado==false) {
			System.out.println("El elemento no esta en la pila");
			
		}
		
	}
	
	
	
	private static void ordenDecre() {
		Arrays.sort(cola);
		for(int i = cola.length -1 ; i >=0 ;i--) {
			System.out.println(+cola[i]);
		}
		
		
		
	}
	private static void sumaCola() {
		int suma =0;
		for(int i = 0 ; i < cola.length ; i ++) {
			if(cola[i] > 10 || !(cola[i] % 2 ==0) ) {
				suma += cola[i];
			}
		}
		System.out.println("Suma de los numeros mayores a 10 e impares es de "+suma);
		
	}
	private static void paresPila() {
		int contadorPares = 0;
		for(int i = 0 ; i < pila.length ; i ++) {
			if(pila[i]!= 0) {
				if(pila[i] % 2 ==0) {
				contadorPares++;
			}
			 
		}
	}	
		System.out.println("El numero de pares que hay en la pila es de "+contadorPares+" numeros");
		
	}
	private static void extraerCola() {
		boolean extraido = false;
		for(int i = cola.length -1 ; i >= 0 && !extraido ; i-- ) {
			if(cola[i] != 0) {
				cola[i] = 0;
				contadorCola--;
				extraido = true;
			}
		}
		
		boolean arrayLlena = false;
		for(int j = 0 ; j < cola.length && !arrayLlena ; j++) {
			if(cola[j] !=0) {
				arrayLlena = true;
			}else {
				System.out.println("La cola esta vacia");
				contadorCola = 0;
				break;
			}
		}
		mostrarArrayCola();
	}
	private static void añadirCola() {
		System.out.println("Introduce el numero en la cola");
		int numero = entrada.nextInt();
		if(contadorCola== cola.length) {
			System.out.println("La cola esta llena");
		}
		else {
		for(int i = cola.length -1  ; i > 0; i--) {	
				cola[i] = cola[i-1];// todos los elementos se desplazan a la derecha
				//System.out.println(i+"-"+(i-1) );
			}
			cola[0] = numero;
			contadorCola++;
		System.out.println("Contador "+contadorCola);
		}
		mostrarArrayCola();
		
	} 
	private static void extraerPila() {
		boolean extraido = false ;
		for(int i = 0 ; i < pila.length && !extraido ; i++) {
			if(pila[i] != 0) {
			pila[i] =0;
			contadorPila--;
			System.out.println("Elemento extradido");
			extraido = true;
			mostrarArrayPila();
			}
		}
		// terminar la comprobacion de que si la fila esta vacia mandar un mensaje
		boolean pilaLlena = false;
		for(int j = 0 ; j < pila.length  && !pilaLlena; j++) {
			if(pila[j] != 0) {
				cantidadPila++;
				pilaLlena = true;
			}else {
				cantidadPila = 0;
			}	
		}
		if(cantidadPila==0) {
			System.out.println("LA PILA ESTA VACIA");
			// igualammos el contador de añadir elementos a la pila
			contadorPila=0;
		}
		
	}
	private static void añadirPila() {
		System.out.println("Introduce el numero en la pila");
		int numero = entrada.nextInt();
		if(contadorPila== pila.length) {
			System.out.println("La cola esta llena");
		}
		else {
		for(int i = pila.length -1  ; i > 0; i--) {	
				
				pila[i] = pila[i-1];// todos los elementos se desplazan a la derecha
				System.out.println(i+"-"+(i-1) );
			}
			pila[0] = numero;
			contadorPila++;
			
		System.out.println("Contador "+contadorPila);
		}
		mostrarArrayPila();
		
	}

	private static void mostrarArrayPila() {
		for( int numero1 : pila) {
			System.out.print(numero1+" | ");
		}System.out.println();		
	}
	private static void mostrarArrayCola() {
		for( int numero1 : cola) {
			System.out.print(numero1+" | ");
		}System.out.println();		
	}

}
