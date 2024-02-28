package pruebas.evaluacion1.recup1;

import java.util.Scanner;

public class Ejercicio2 {

	
	public static final int filas = 2;
	public static final int columnas = 5;

	public static Scanner entrada = new Scanner(System.in);

	public static int[][] deposito1 = new int[filas][columnas];
	public static int[][] deposito2 = new int[filas][columnas];
	public static int[][] deposito3 = new int[filas][columnas];
	
	
	public static void main(String[] args) {
		
		recogerDatos(deposito1);
		mostrarDatos();
		recogerDatos(deposito2);
		recogerDatos(deposito3);	
		

		
		
		
	}


	private static void mostrarDatos() {
		for(int i = 0 ; i < filas ; i++) {
			for(int j = 0 ; j < columnas ; j++ ) {
				System.out.print(deposito1[i][j]+" ");
			}
			System.out.println();
		}
	}


	private static void recogerDatos(int [][] array) {
		System.out.println("Recoger datos de temperatura del deposito 1");
		for(int i = 0 ; i < columnas ; i++) {
		System.out.println("Introduce dato numero "+(i+1)+" de temperatura");
		int dato = entrada.nextInt();
		array[0][i] = dato ;
			
		}
		for(int i = 0 ; i < columnas ; i++) {
			System.out.println("Introduce dato numero "+(i+1)+" de humedad");
			int dato = entrada.nextInt();
			array[1][i] = dato ;
				
			}
		
		
	}

}
