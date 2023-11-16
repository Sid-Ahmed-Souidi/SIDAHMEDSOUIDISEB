package unidad5.ejemplos;

import java.util.Arrays;

public class Ejercicio7 {
	 static int [] matriz = {1,2,3,4,5,6,7} ;
	 
	public static void main(String[] args) {
		//Escriba un programa Java para revertir una matriz de valores enteros.
      //  System.out.println(Arrays.toString(revertirMatriz(matriz)));
		
		revertirMatriz(matriz);
		
	}

	
	public static void  revertirMatriz(int [] matriz) {
		
		for(int i = matriz.length -1 ; i >= 0 ; i -- ) { //// El menos uno (matriz.length -1) es para sacar el ultimo elemento de la array
			System.out.println(matriz[i]);
			
		}
		
		
		
		
		
		
	}
	
	
}
