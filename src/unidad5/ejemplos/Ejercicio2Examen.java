package unidad5.ejemplos;

import java.util.Scanner;

public class Ejercicio2Examen {
	static final int FILAS = 3 ;
	static final int COLUMNAS = 3 ;
	
	static boolean [][] mapa = new boolean[FILAS][COLUMNAS]; 
	static Scanner entrada = new Scanner(System.in);
	 static int origen = 0;
	 static int destino = 0;
	public static void main(String[] args) {
	
		mapa = new boolean[][]{
				
				{true,true,false},
				{true,true,true},
				{false,true,true}
				
		};
	
		
		indicarLugar();
		imprimir();
		realizarTrayecto();
		
		
		
		
		
		
	}

	private static void imprimir() {
		origen = origen -1;
		destino = destino - 1;
		System.out.println(mapa[origen][destino]);
	
	}

	private static void realizarTrayecto() {
		for(int i = 0 ; i < FILAS ; i++) {
			if(mapa[origen][destino] == true) {
				System.out.println("El trayecto se puede realizar directamente");
				break;
				
			}else {
				System.out.println("El trayecto es indirecto");
				break;
			}	
		}
	}

	private static void indicarLugar() {
		System.out.println("Indica lugar X de origen");
		origen = entrada.nextInt();
		System.out.println("Indica lugar y destino");
		destino = entrada.nextInt();
		
	}

}
