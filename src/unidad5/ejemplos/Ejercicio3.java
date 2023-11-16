package unidad5.ejemplos;

import java.util.Scanner;

public class Ejercicio3 {

	 static int [] matriz = {3,7,5,4,32,23} ;

	public static void main(String[] args) {
/**		Escriba un programa Java para encontrar el índice de un elemento de matriz.*/
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce el elemento que desea saber su indice");
		int elemento = entrada.nextInt();
		buscarIndice(matriz,elemento);

	}

	public static void buscarIndice(int [] matriz , int elemento) {
		for(int indice = 0 ; indice < matriz.length ; indice++) {
			if(matriz[indice]== elemento) {
				System.out.println("El indice del elemento "+elemento+" es :"+indice);
			}


		}




	}

}
