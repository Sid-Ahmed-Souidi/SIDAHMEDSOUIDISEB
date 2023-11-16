package unidad5.ejemplos;

import java.util.Arrays;

public class Ejercicio71 {
	static final int TAM = 6;
	 static int [] matriz = {1,2,3,8,5,6,7} ;
	 s//tatic int [] nuevaMatriz = new int[TAM];
	//Escriba un programa Java para revertir una matriz de valores enteros.

	public static void main(String[] args) {
        System.out.println(Arrays.toString(revertirMatriz(nuevaMatriz)));

       //System.out.println(Arrays.toString(revertirMatriz(matriz)));
		//revertirMatriz(matriz);

	}

	public static int [] revertirMatriz(int [] matriz) {
	    int[] nuevaMatriz = new int[matriz.length];

		for(int i = matriz.length -1, j = 0 ; i >= 0 ; i -- , j++) { // El menos uno (matriz.length -1) es para sacar el ultimo elemento de la array
			nuevaMatriz[j] = matriz[i];
		}

		return nuevaMatriz;

	}

}
