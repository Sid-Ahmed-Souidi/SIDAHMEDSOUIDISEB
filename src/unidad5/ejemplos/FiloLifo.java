package unidad5.ejemplos;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class FiloLifo {

	static final int TAM = 5 ;
	static int [] lifo = new int[TAM];
	static int [] fifo = new int[TAM];

	
	static Scanner entrada = new Scanner(System.in);
	
	public static void main(String[] args) {
		int seleccion ;

		do {
		imprimirMenu();
		 seleccion = entrada.nextInt();
		switch(seleccion){
		case 1 : 
			System.out.println("1.añadir elemento en pila");
			System.out.println("2.Añadir elemento en cola");
			System.out.println("3.Extraer elemento en pila");
			System.out.println("4.Extraer elemento en cola");
			int operacion = entrada.nextInt();
			if(operacion==1) {
				añadirElemento(lifo);
			}else if(operacion==2) {
				añadirElemento(fifo);
			}else if(operacion==3) {
				extraerPila();
			}else if(operacion==4) {
				extraerCola();
			}
			break;
			
		case 2:
			System.out.println("Elementos de la pila");
			consultarPila();
			System.out.println("Elementos de la cola");
			consultarCola();
			break;
		case 3:
			numParesPila();
		case 4 :
			numImparesMas10();
			
		case 5 :
			ordenDecreciente();
			break;
		case 7:
			break;
			
		}
		 
		}while(seleccion != 7);
	
	}
	
	private static void ordenDecreciente() {
		// Ordenar en orden ascendente
		Arrays.sort(fifo);		
		for(int numeros : fifo) {
			System.out.println(numeros);
		}
	}


	private static void numImparesMas10() {
		int contador = 0 ;
		for(int i = 0 ; i < fifo.length ; i++) {
			if(fifo[i] > 10 && !(fifo[i] % 2 == 0)) {
				contador += fifo[i];
			}
		}
		System.out.println("La suma total de los impares y mayores a 10 es de"+contador);
	}



	private static void numParesPila() {
		int contador = 0 ;
		for(int i = 0 ; i < lifo.length ; i++) {
		 if(lifo[i] != 0) {	
			if(lifo[i] % 2 == 0) {
				contador ++;
			}
		 }
		}System.out.println("El numero de pares que hay en la pila es de "+contador);
		
	}

	private static void consultarCola() {
		for(int numeros : fifo) {
			System.out.println(numeros);
			
		}		
	}
	private static void consultarPila() {
		for(int numeros : lifo) {
			System.out.println(numeros);
			
		}		
	}

	private static void extraerCola() {
		for(int i = fifo.length -1 ; i > 0 ; i--) {
			if(fifo[i] != 0) {
				System.out.println("Sacamos el valor que esta en la cima"+fifo[i]);
				fifo[i] = 0;
				break;
			}
			
		}System.out.println(Arrays.toString(fifo));
				
	}

	private static void extraerPila() {

		for(int i = 0 ; i < lifo.length ; i++) {
			if(lifo[i] != 0) {
				System.out.println("Sacamos el valor que esta en la cima"+lifo[i]);
				lifo[i] = 0;
				break;
			}
		}System.out.println(Arrays.toString(lifo));
	
	}
	
	private static void añadirElemento(int[] matriz) {
		System.out.println("Introduzca el elemento que desea añadir en fila");
		int elemento = entrada.nextInt();
		int contador =0  ;
		if(contador == matriz.length) {
			System.out.println("La pila esta llena");
			
		}else {
			for(int i = matriz.length -1 ; i > 0  ; i-- ) {// todos los elementos se desplazan a la derecha en el bucle 7 no se incluye la posicion 0
				matriz[i] = matriz[i-1]; 
		}
			matriz[0] = elemento;// y en la posicion cero se añade el nuevo elemento
			contador++;
		}
		
		System.out.println(Arrays.toString(matriz));

		
		
	}

	private static void imprimirMenu() {
		System.out.println("-----------Menu----------");
		System.out.println("1.Añadir o extraer elementos.");
		System.out.println("2.Permitir consultar el contenido de la pila y de la cola.");
		System.out.println("3.Consultar cuantos numeros pares hay en la pila.");
		System.out.println("4.Obtener la suma de los numeros mayores a 10 e impares en la cola.");
		System.out.println("5.Permitir ordenar en orden decreciente los elementos de la cola");
		System.out.println("6.buscar una secuencia de elementos tanto en la pila ");
		System.out.println("7.Salir");
		
	}

}
