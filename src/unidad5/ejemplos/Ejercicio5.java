package unidad5.ejemplos;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio5 {
	 static int [] matriz = {1,2,3,4,5,6} ;
	 static int [] nuevaMatriz ;
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce el elemento que desea eliminar de la matriz");
		int elemento = entrada.nextInt();
		System.out.println(Arrays.toString(añadirElemento(matriz, elemento)));
	}

	public static int [] añadirElemento(int [] matriz , int elemento) {
		int N = matriz.length;  // aqui creamos una variable con el numero de posiciones que tiene el array
		nuevaMatriz = Arrays.copyOf(matriz , N + 1); // creamos la nueva matriz con los elementos de la matriz original mas la posicion que queremos para el elemento que vamos a añadir 
        //System.out.println(Arrays.toString(nuevaMatriz));
		nuevaMatriz[N] = elemento; // Y aqui damos a la nueva posicion el valor del elemento pasado por teclado 
		return nuevaMatriz;
		
	}
	
}

