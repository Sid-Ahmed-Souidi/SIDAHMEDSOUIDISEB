package unidad5.ejemplos.ampliacion;

import java.util.Scanner;

public class Ajedrez {

	public static Scanner entrada = new Scanner(System.in);
	public static final int filas = 8;
	public static final int columnas = 8;
	public static int[][] ajedrez ;
	
	public static void main(String[] args) {
		
	ajedrez= new int[filas][columnas];
		
		System.out.println("Introduzca las posiciones");
		System.out.println("Posicion de las filas");
		int filas = entrada.nextInt();
		filas = filas -1;
		System.out.println("Posicion de las filas");
		int columnas = entrada.nextInt();	
		columnas = columnas-1;
	
		
		posicionesPositivo(filas,columnas);
		posicionesNegativo(filas,columnas);
		posicionesNegaPosi(filas,columnas);
		posicionesPosiNega(filas,columnas);
		mostrarArray();

		
	}
	
	private static void posicionesPosiNega(int pos1, int pos2 ) {
		for(int i = pos1 ; i < filas && pos2>=0 ; i++ , pos2--) {
			ajedrez[i][pos2] = 1;	
			
		}
	}

	private static void posicionesNegaPosi(int pos1, int pos2) {
		for(int i = pos1 ; i >= 0 && (pos2< columnas) ; i-- ,pos2++) {
			ajedrez[i][pos2] = 1;
		}
		
	}

	private static void posicionesNegativo(int pos1, int pos2) {
		for(int i = pos1 ; i >= 0 && (pos2>=0) ; i--) {
			ajedrez[i][pos2]=1;
			pos2--;
		}
	}

	private static void posicionesPositivo(int pos1 , int pos2) {

		for(int i = pos1 ; i < filas && (pos2< columnas) ; i++) {
			ajedrez[i][pos2]=1;
			pos2++;
		}
	}
	
	private static void mostrarArray() {
		for(int i = 0 ; i < filas ; i++) {
			for(int j = 0 ; j < columnas ; j++) {
				System.out.print(ajedrez[i][j]+" ");
			} 
			System.out.println();
		}
	}
}
