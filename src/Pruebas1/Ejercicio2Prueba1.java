package Pruebas1;

import java.util.Scanner;

public class Ejercicio2Prueba1 {

	
	public static Scanner entrada = new Scanner(System.in);
	
	static final int columnas = 3;
	static final int filas = 3;
	public static int[][] mapa ;
	
	
	
	public static void main(String[] args) {

		 mapa = new int[][]{
				 {1,2,3},
				 {4,5,6},
				 {7,8,9}
		 };
		 
		 indicarLugares();

		 
	  	 
	}

	private static void indicarLugares() {
		System.out.println("Indica el lugar x");
		int lugarX = entrada.nextInt();
		System.out.println("Indica el lugar y");
		int lugarY = entrada.nextInt();
		
	}
	
	
	
	
		
	
	




}


