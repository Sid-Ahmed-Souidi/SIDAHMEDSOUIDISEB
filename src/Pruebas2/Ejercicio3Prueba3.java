package Pruebas2;

import java.util.Scanner;

public class Ejercicio3Prueba3 {
	
	public static Scanner entrada = new Scanner(System.in);
	public static final int fila = 2;
	public static final int columnaJuego = 5;
	public static final int columnaSet = 3;
	public static int[][] juegos = new int[fila][columnaJuego];
	public static int[][] sets = new int[fila][columnaSet];
	public static int seleccion;
	public static int contador =0;
	public static int contador2 =0;

	public static void main(String[] args) {
		
	do {
		System.out.println("1.Jugar");
		seleccion= entrada.nextInt();
			
		switch(seleccion) {
		case 1:
			juego();
			mostrarContador();
			break;
			
		}
		
	}while(seleccion!=4);	
		
		
}

	private static void mostrarContador() {
		System.out.println("Samuel/Diego");
		System.out.println("Sara/Miguel");
		System.out.println(" ");
		for(int i = 0 ; i < fila ; i++) {
			for(int j = 0 ; j < columnaSet ;j++) {
				System.out.print(sets[i][j]+" ");
			}
			System.out.print(" | ");
			for(int j = 0 ; j < columnaJuego;j++) {
				System.out.print(juegos[i][j]+" ");
			}
			System.out.println();		
		}
	
	}
	private static void juego() {
		boolean puntuado = false;
		System.out.println("¿Que pareja ha puntuado? Samuel/Diego introduzca 1 o Sara/Miguel introduzca 2");
		int quienPuntuacion = entrada.nextInt();
		quienPuntuacion = quienPuntuacion -1;
		if(quienPuntuacion==0) {
			for(int i = 0 ; i< columnaJuego && !puntuado ; i++) {
				if(juegos[0][i]==30) {
					juegos[0][i]+=10;
					puntuado = true;
				}else if(juegos[0][i]==40) {
					juegos[0][i]=0;
					setPareja1();
					puntuado=true;
				}
				else {
					juegos[0][i]+=15;
					puntuado = true;
				}
			}
		}if(quienPuntuacion==1) {
			for(int i = 0 ; i< columnaJuego && !puntuado; i++) {
				if(juegos[1][i]==30) {
					juegos[1][i]+=10;
					puntuado = true;
				}else if(juegos[1][i]==40) {
					juegos[0][i]=0;
					setPareja2();
					puntuado=true;
				}else {
					juegos[1][i]+=15;
					puntuado = true;
				}
			}
		}
	}
	private static void setPareja2() {
		boolean puntuado = false;
		for(int i = 0 ; i < columnaSet && !puntuado ; i++) {
			sets[1][i] += 1;
			if(sets[1][i]==6) {
				sets[1][i] = 0;
				contador++;
				//desplazar(i);
			}
			puntuado=true;
			if(contador2==2) {
				System.out.println("Ha ganado la pareja 2");
			}
		}		
	}
	private static void desplazar(int pos) {
		for(int i = pos ; i < sets.length-1 ;i++) {
			sets[1][i] = sets[1][i+1];
		} 
	}
	
	private static void setPareja1() {		
		boolean puntuado = false;
		for(int i = 0 ; i < columnaSet && !puntuado ; i++) {
			sets[0][i] += 1;
			if(sets[0][i]==6) {
				sets[0][i]=0;
				contador++;
			}
			puntuado=true;
		}
		if(contador==2) {
			System.out.println("HA GANADO LA PAREJA 1");
		}					
	}	
	
}
	


