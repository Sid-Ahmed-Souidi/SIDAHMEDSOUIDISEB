package unidad5.ejemplos;

import java.util.Scanner;

public class Carreras {

	static Scanner entrada = new Scanner(System.in);
	static final int TAM = 10;
	static int [] carrera = new int[TAM];
	static int [] menores = new int[TAM];
	static int [] positivos = new int[TAM];
	static int [] morosos = new int[TAM];
			
	
	public static void main(String[] args) {
		
		leerDorsales();
		leerMenores();
		leerPositivos();
		leerMorosos();
		mostrarClasificacion();
		gestionarMenores();
	}


	private static void gestionarMenores() {
		int dorsalMenor = 0;
		int tmp ; 
		for(int i = 0 ; i < menores.length; i++) {
			dorsalMenor = menores[i];
			if(dorsalMenor!=0) {
				for(int j = 0; j< carrera.length;j++) {
					if(dorsalMenor==carrera[j] && j!=0) {
						tmp = carrera[j];
						carrera[j] = carrera[j-1];
						
					}
				}
			}
		}
	}


	private static void mostrarClasificacion() {
		int posicion = 1;
		for(int i = 0 ; i< carrera.length; i++) {
			if(carrera[i]!=0) {
			System.out.println("Posicion"+posicion+"Dorsal"+carrera[i]);
			}
		
		}
	}


	private static void leerMorosos() {
		int dorsal=0;
		int contadorMorosos = 0;
		do {
			System.out.println("Introduzca un dorsal morosos ()-1 para fin");
			dorsal = entrada.nextInt();
			if(dorsal!=-1) {
				carrera[contadorMorosos] = dorsal;
				contadorMorosos++;
			}
		}while(dorsal != -1);				
	}


	private static void leerPositivos() {
		int dorsal=0;
		int contadorPositivos = 0;
		do {
			System.out.println("Introduzca un dorsal positivos ()-1 para fin");
			dorsal = entrada.nextInt();
			if(dorsal!=-1) {
				carrera[contadorPositivos] = dorsal;
				contadorPositivos++;
			}
		}while(dorsal != -1);				
	}


	private static void leerMenores() {
		int dorsal=0;
		int contadorMenores = 0;
		do {
			System.out.println("Introduzca un dorsal Menores ()-1 para fin");
			dorsal = entrada.nextInt();
			if(dorsal!=-1) {
				carrera[contadorMenores] = dorsal;
				contadorMenores++;
			}
		}while(dorsal != -1);		
	}


	private static void leerDorsales() {
		
		int dorsal=0;
		int contadorEntrada = 0;
		do {
			System.out.println("Introduzca un dorsal ()-1 para fin");
			dorsal = entrada.nextInt();
			if(dorsal!=-1) {
				carrera[contadorEntrada] = dorsal;
				contadorEntrada++;
			}
		}while(dorsal != -1);
		
		
	}

}
