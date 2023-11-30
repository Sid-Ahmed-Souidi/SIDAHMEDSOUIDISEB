package unidad5.ejemplos;

import java.util.Arrays;

public class Mancala2 {
	
	static final int FILAS = 2;
	static final int COLUMNAS = 8;
	static final String usuario1 = "Pepe";
	static final String usuario2 = "Lola";
	static int [][] mancala = new int[FILAS][COLUMNAS];
	public static void main(String[] args) {
		
		establecerPiezas();
		
		imprimirTablero();
		inicioJuego();
		
	}
	private static void inicioJuego() {
		while((mancala[0][1] !=0 && mancala[0][2] !=0&& mancala[0][3] !=0&&mancala[0][4] !=0 && mancala[0][5] !=0 && mancala[0][6] !=0) || (mancala[1][1] !=0 && mancala[1][2] !=0&& mancala[1][3] !=0&&mancala[1][4] !=0 && mancala[1][5] !=0 && mancala[1][6] !=0)) {
				
					System.out.println("La fila 1 es para Pepe");
					System.out.println("La fila 2 es para Lola");
							
					for(int i = 0 ; i < FILAS ; i++) {
						for(int j = 0 ; j <COLUMNAS ; j++) {
						
						}
					
					
					
					}
		}
	}
	private static void mostrarTablero() {
		for(int[] ints : mancala) {
			System.out.println(Arrays.toString(ints));
			
		}
	}
	private static void establecerPiezas() {
		for(int i = 0 ; i < FILAS ; i ++) {
			for(int j = 0 ; j < COLUMNAS ; j++) {
				if(i==0 && j==0  || i==1 && j==COLUMNAS-1) {
					mancala[i][j] = 0;
				}
				else {
					mancala[i][j] = 4;
				}
			}
		}
	}
	
	private static void imprimirTablero() {
		for(int i=0;i<FILAS;i++) {
			for(int j=0;j<COLUMNAS;j++) {
				if((i==1&&j==0) || (i==0&&j==COLUMNAS-1)) { // accedo a la fila 1 con en la columna 0 y pongo un espacio y tambien a la fila 0 en la ultima columna y agrego tambien el espacio  
					System.out.print(" |");
				}else {
					System.out.print(mancala[i][j]+"|");
				}		
			}
			System.out.println("");
		}	
	}
}

























