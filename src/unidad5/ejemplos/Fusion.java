package unidad5.ejemplos;

import java.util.Scanner;

public class Fusion {

	public static final int tam = 6;
	public static int[] matriz = new int[tam];
	public static int[] matriz2 = new int[tam];
	public static int[] matrizOrdenada = new int[tam];
	public static int[] matrizOrdenada2 = new int[tam];
	public static int[] matriz3 = new int[tam];
	public static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {
		
		numeros1tabla();
	//	numeros2tabla();
		ordenartabla1();
		mostrarMatriz(matrizOrdenada);
	
	}
	
	private static void mostrarMatriz(int[] matriz4) {
		for(int i = 0 ; i < matriz4.length ; i++) {
			for(int j =0 ; j <matriz4.length ; j++ ) {
				System.out.print(matriz4[i]+" ");	
			}
			System.out.println();
		}		
	}

	private static void ordenartabla1() {
		for(int i = 0 ; i < tam ; i++) {
			int tmp = matriz[i];
			if(matriz[i] > matriz[i+1]) {
				  matrizOrdenada[i]= matriz[i];
			}else {
				tmp = matriz[i+1];
				 matrizOrdenada[i] = matriz[i+1] ;
			}
		}
	}
	

	private static void numeros2tabla() {
		System.out.println("Introducir numero en la segunda tabla");
		for(int i = 0 ; i < tam ; i++) {
			System.out.println("Introduce el numero "+(i+1)+" de la segunda tabla");
			int numero = entrada.nextInt();
			matriz[i] = numero;
		}
	}
	private static void numeros1tabla() {
		System.out.println("Introducir numero en la primera tabla");
		for(int i = 0 ; i < tam ; i++) {
			System.out.println("Introduce el numero "+(i+1)+" de la primera tabla");
			int numero = entrada.nextInt();
			matriz[i] = numero;
		}
		
	}
}
