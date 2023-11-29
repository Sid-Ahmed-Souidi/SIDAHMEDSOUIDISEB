package unidad5.ejemplos;

import java.util.Scanner;

import javax.annotation.processing.SupportedSourceVersion;

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
				imprimirTablero();
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

	
	
	
	
	
	private static void pedirJugada(String jugador) {
		System.out.println(jugador+"- Deme una casilla: ");
		boolean coordenadaCorrecta = false;
		int fila = 0;
		
		fila = pediCoordenada(jugador, fila, fila);
		System.out.println("Fila(1-2):");

		do {
			fila = entrada.nextInt();
			if(fila < 1 || fila >2) {
				System.out.println("Error en la fila .Deme otra coordenada");
			}else {
				coordenadaCorrecta=true;
			}
			
			
		}while(!coordenadaCorrecta);
		
		coordenadaCorrecta = true;
		
		int columna = 0;
		System.out.println("Columna(1-8):");
		do {
			columna = entrada.nextInt();
			if(columna < 1 || columna >8) {
				System.out.println("Error en la fila .Deme otra coordenada(1-8) : ");
			}else {
				coordenadaCorrecta=true;
			}
			
			
		}while(!coordenadaCorrecta);
	
		obtenerContenidoCasilla(fila,columna);
		
		
		
		
	}

	private static int pediCoordenada(String nombre , int limiteInferior , int limiteSuperior) {
		
		int coordenada= 0;
		System.out.println(nombre+"("+limiteInferior+"-"+limiteSuperior+")");
		do{
			
			coordenada = entrada.nextInt();
			if(coordenada < limiteInferior || coordenada>limiteSuperior) {
				System.out.println("Error en la "+nombre+".Deme otra coordenada("+limiteInferior+limiteSuperior);
				
			}
			
			
		}
		
		
	}






	private static void obtenerContenidoCasilla(int fila, int columna) {
		
		
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
