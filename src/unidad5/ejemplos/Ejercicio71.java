package unidad5.ejemplos;

import java.util.Arrays;

public class Ejercicio71 {
	 static int [] matriz = {1,2,3,4,5,6,7} ;
	 static int [] nuevaMatriz ;
	//Escriba un programa Java para revertir una matriz de valores enteros.

	public static void main(String[] args) {
		
        System.out.println(Arrays.toString(revertirMatriz(matriz)));

		

	}
	
	public static int [] revertirMatriz(int [] matriz) {

		nuevaMatriz =  new int[matriz.length];
		
		for(int i = 0 ; i < matriz.length; i++) {
			nuevaMatriz[i] = matriz[matriz.length -i];
			  
		}return nuevaMatriz ; 
		
		
		
		
	}

}
