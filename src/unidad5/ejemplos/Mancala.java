package unidad5.ejemplos;

import java.util.Scanner;

public class Mancala {

	
	static final String usuario1 = "Pepe";
	static final String usuario2 = "Lola";
	static final int NC=8;
	static final int NF=2;
	static int[][] tablero =  new int[NF][NC];
	static Scanner entrada = new Scanner(System.in);
	
	public static void main(String[] args) {
	
		inicializarTablero();
		imprimirTablero();
		boolean finJuego = false;
		int veces = 0;
		String jugadorSiguiente=usuario1;
		do {
			if(veces<6) {
				if(jugadorSiguiente==usuario1) {
					pedirJugada(usuario1);
					jugadorSiguiente=usuario2;
					imprimirTablero();
				}else {
					pedirJugada(usuario2);
					jugadorSiguiente=usuario1;
					imprimirTablero();
				}
			}else {
				finJuego=true;
			}
			veces++;
			
		}while(!finJuego);

	}

	private static void pedirJugada(String jugador) {
		
		
		System.out.println(jugador+"- Deme una casilla:");
		
		int fila=0;
		int columna=0;
		
		fila = pedirCoordenada("fila",1,NF);
		columna = pedirCoordenada("columna", 1, NC);
		
		obtenerContenidoCasilla(fila,columna);
		
		
	}

	private static int pedirCoordenada(String nombre, int limiteInferior, int limiteSuperior) {
		
		int coordenada=0;
		boolean coordenadaCorrecta=false;
		System.out.println(nombre+"("+limiteInferior+"-"+limiteSuperior+")");
		do {
			coordenada =  entrada.nextInt();
			if(coordenada<limiteInferior||coordenada>limiteSuperior) {
				System.out.println("Error en la "+nombre+". Deme otra coordenada("+limiteInferior+"-"+limiteSuperior+"):");
				
		}else {
				coordenadaCorrecta=true;
			}
		}while(!coordenadaCorrecta);
		return coordenada;
	}

	private static void obtenerContenidoCasilla(int fila, int columna) {
		
		System.out.println("Contenido:"+tablero[fila-1][columna-1]);
		tablero[fila-1][columna-1]=0;
		
	}

	private static void imprimirTablero() {
		for(int i=0;i<NF;i++) {
			for(int j=0;j<NC;j++) {
				if((i==1&&j==0) || (i==0&&j==NC-1)) {
					System.out.print(" |");
				}else {
					System.out.print(tablero[i][j]+"|");
				}
				
			}
			System.out.println("");
		}
		
	}

	private static void inicializarTablero() {
		
		for(int i=0;i<NF;i++) {
			for(int j=1;j<NC-1;j++) {
				tablero[i][j]=4;
			}
		}
		
	}

}
