package unidad5.ejemplos;

import java.util.Arrays;

public class Ejercicio7 {
	 static int [] matriz = {1,2,3,4,5,6,7} ;

	 static int [] nuevaMatriz ; 
	 
	public static void main(String[] args) {
		//Escriba un programa Java para revertir una matriz de valores enteros.
      //  System.out.println(Arrays.toString(revertirMatriz(matriz)));
		
        System.out.println(Arrays.toString(revertirMatriz(matriz)));

		
	}

	
	public static int [] revertirMatriz(int [] matriz) {
		 int contador = 0;
		 int contador2 = 0;
		 nuevaMatriz = new int[matriz.length];// le damos el numero de las posiciones de la arrat original
	while(contador < matriz.length) { //aqui mientras el contador sea menor que el numero de las posiciones del la matriz original	 
		
		for(int i = 0 ; i < matriz.length; i++) {
			if(matriz[i]==  matriz.length- contador)
				nuevaMatriz[i] = matriz[matriz.length -1 - i];
			
		}contador++;	
	}contador2++;
	return nuevaMatriz;
	
		
		
		
		
	}
	
	
}
