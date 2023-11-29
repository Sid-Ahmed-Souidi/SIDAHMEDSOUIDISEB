package unidad5.ejemplos;

import java.util.Scanner;

public class Mancala {

	
	static final int NUM_FILAS = 2;
	static final int NUM_COLUMNAS = 8;
	static final String usuario1 = "Pepe";
	static final String usuario2 = "Lola";
	static int[][] juego = new int[NUM_FILAS][NUM_COLUMNAS];
	static Scanner entrada = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		
		iniciarTablero();
		imprimirTablero();
		boolean finJuego = false;
		int veces = 0;
		String jugadorSiguiente=usuario1;
	do {
		if(veces< 6) {
			if(jugadorSiguiente==usuario1) {
				pedirJugada(usuario1);
				jugadorSiguiente=usuario2;
				}else {
					pedirJugada(usuario2);
					jugadorSiguiente=usuario1;
				}		
		}else {
			
			finJuego=true;
		}
		veces++;
		
		
	}while(!finJuego);	
		
		
	}

	private static void pedirJugada(String usuario) {
		
		
		
	}

	private static void imprimirTablero() {
		for(int i = 0 ; i < NUM_FILAS ; i++) {
			for(int j = 0 ; i < NUM_COLUMNAS ; j++) {
				System.out.println(" | " + juego[i][j]+" | ");
			
			}
			System.out.println("");
	}
	}
	private static void iniciarTablero() {
		
		for(int i = 0 ; i < NUM_FILAS ; i++) {
			for(int j = 0 ; i < NUM_COLUMNAS -1; j++) {
				juego[i][j] = 4;
				
				
			}
			
		}
		
	}

}
