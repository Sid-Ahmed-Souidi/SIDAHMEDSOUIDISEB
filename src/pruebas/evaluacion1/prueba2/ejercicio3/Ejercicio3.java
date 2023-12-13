package pruebas.evaluacion1.prueba2.ejercicio3;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio3 {

	static final int FILAS = 2;
	static final int COLUMNAS =5;
	static final int setFILAS = 2;
	static final int setCOLUMNAS =3;
	static int [][] sets = new int[setFILAS][setCOLUMNAS];
	static int [][] juego = new int[FILAS][COLUMNAS];
	static Scanner entrada = new Scanner(System.in);

	 static int jugador ;
	public static void main(String[] args) {
		
		
		puntoSJuego();
		
		
		

	}
	private static void puntoSJuego() {
		int contadorJuego = 0;
		int[] tmp ;
		int tmp2;
		while(contadorJuego < 6) {
			boolean puntoJugado = true;
			boolean puntoSet = true;
			punto();
			if(jugador==1) {
				for(int j = 0 ; j < COLUMNAS && puntoJugado ; j++) {
					if(juego[0][j]==30) {
						juego[0][j] += 10;
						puntoJugado = false;

					}else if(juego[0][j]!=30) {
						juego[0][j] += 15;
						puntoJugado = false;
						}
					}
			}if(jugador==2) {
				for(int j = 0 ; j < COLUMNAS && puntoJugado ; j++) {
					if(juego[1][j]==30) {
						juego[1][j] += 10;
						puntoJugado = false;

					}else if(juego[1][j]!=30) {
						juego[1][j] += 15;
						puntoJugado = false;
						}
				}
				 
				
			}
			 for(int j = 0 ; j < COLUMNAS  ; j++) {
				 if(juego[0][j]==40 && juego[1][j] < 40) {
					 System.out.println("Punto de set para jugador 1");
					 for(int i = 0 ; i < setCOLUMNAS && puntoSet; i++) {
						 sets[0][j]+=1;
						 mostrarSets();
						 puntoSet = false;
						 
					 }
				 }else if(juego[0][j]<40 && juego[1][j] == 40) {
					 System.out.println("Punto de set para jugador 2");
					 for(int i = 0 ; i < setCOLUMNAS && puntoSet; i++) {
						 sets[1][j]+=1;
						 mostrarSets();
						 puntoSet = false;

					 }
					 
				 }
				
				
				 
			 }
			
			contadorJuego++;
			for(int [] jugadores : juego) {
				System.out.println(Arrays.toString(jugadores));
			}
		}

		
		
	}
	private static void mostrarSets() {
		for(int [] set : sets) {
			System.out.println(Arrays.toString(set));
		}
	}
	private static int punto() {
		System.out.println("Quien ha ganado el punto");
		System.out.println("1. jugador1");
		System.out.println("2. jugador2");
		 jugador = entrada.nextInt();
		return jugador;

		
	}

}
