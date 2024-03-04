package unidad5.ejemplos;

import java.util.Scanner;

public class Fusion {

	public static final int tam = 6;
	public static final int tam12 = 12;
	public static int[] matriz = new int[tam];
	public static int[] matriz2 = new int[tam];
	public static int[] matriz3 = new int[tam12];
	public static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {
		
		introducirNumeros(matriz);
		introducirNumeros(matriz2);
		ordenarTabla(matriz);
		ordenarTabla(matriz2);
		introducirTabla3();
		ordenarTabla3(matriz3);
		mostrarMatriz(matriz);
		mostrarMatriz(matriz2);
		mostrarMatriz(matriz3);

		
	}
	
	private static void introducirTabla3() {
		int contador = 0 ;
		for(int i = 0 ; i < tam ; i++) {
			matriz3[i] = matriz[i];
		}
		for(int i = tam ; i < tam12 && contador<6 ; i++) {
			if(matriz3[i]==0) {
			matriz3[i] = matriz2[contador];
			contador++;
			}
		}
	}

	private static void mostrarMatriz(int[] matriz4) {
		for(int i = 0 ; i < matriz4.length ; i++) {
			System.out.print(matriz4[i]+" ");	
		}
        System.out.println();
	}

	private static void ordenarTabla(int [] matriz32) {
		for(int i = 0 ; i < tam-1 ; i++) {
			if(matriz32[i] > matriz32[i+1]) { //comprobamos si el numero que esta ahora mismo pasando por el bucle es mayor que el siguiente de ahi el mas i+1
				int vmp=matriz32[i]; // si es mayor en ese caso 
				matriz32[i] = matriz32[i+1];
				matriz32[i+1]= vmp;
			}	
		}
	}
	private static void ordenarTabla3(int [] matriz32) {
		  for (int i = tam; i < tam12 - 1; i++) {
		        for (int j = tam; j < tam12 - 1; j++) {
		            if (matriz32[j] > matriz32[j + 1]) {
		                int temp = matriz32[j];
		                matriz32[j] = matriz32[j + 1];
		                matriz32[j + 1] = temp;
		            }
		        }
		    }
	}

	private static void introducirNumeros(int[] matriz45) {
		System.out.println("Introducir numero en la  tabla");
		for(int i = 0 ; i < tam ; i++) {
			System.out.println("Introduce el numero "+(i+1)+" de la  tabla");
			int numero = entrada.nextInt();
			matriz45[i] = numero;
		}
	}
}
