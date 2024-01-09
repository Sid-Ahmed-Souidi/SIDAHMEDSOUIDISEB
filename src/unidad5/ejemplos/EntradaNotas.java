package unidad5.ejemplos;

import java.util.Arrays;
import java.util.Scanner;

public class EntradaNotas {
	
	public static final int FILAS = 5;
	public static final int COLUMNAS = 10;
	public static char [][] calificaciones = new char[FILAS][COLUMNAS];
	public static Scanner entrada = new Scanner(System.in);
	public static int seleccion ;
	public static void main(String[] args) {
		iniciarCalificaciones();
		
	do {	
		System.out.println("1.Ingresar calificacion");
		System.out.println("2.Salir");
		seleccion = entrada.nextInt();
		if(seleccion == 1) {
		
			ingresarCalificaciones();
		}
		else if(seleccion == 2) {
			System.out.println("Saliendo");
		}
		
	}while(seleccion!= 2);

}

	private static void iniciarCalificaciones() {
		for(int i = 0 ; i < FILAS ; i++) {
			for(int j = 0 ; j < COLUMNAS ; j++) {
				calificaciones[i][j] = '-';
			}
			
		}
	}

	private static void mostrarCalificaciones() {
		for(int i = 0 ; i < FILAS ; i++) {
			for(int j = 0 ; j < COLUMNAS ; j++) {
				System.out.print(calificaciones[i][j] + " ");
			}
			System.out.println(" ");
		}	
	}

	private static void ingresarCalificaciones() {
		System.out.println("Ingresa el id de la clase");
		int clase = entrada.nextInt();
		clase = clase -1 ;
		System.out.println("Ingresa el id del alumno");
		int numero = entrada.nextInt();
		numero = numero -1;
		boolean noEncontrado = true;
		for(int i = 0 ; i < FILAS && noEncontrado ; i++) {
			for(int j = 0 ; j < COLUMNAS && noEncontrado ; j++) {
				if(i == clase && j == numero){
					noEncontrado = false ;
					System.out.println("Introduzca la calificacion del alumno");
				
					char calificacion = entrada.next().charAt(0);
					if(calificacion == 'A' || calificacion == 'B' ||calificacion == 'C' || calificacion == 'D'
							||calificacion == 'E' ||calificacion == 'F') {
					 	     calificaciones[i][j] = calificacion ;
						
					}else {
						System.out.println("Introduzca una calificacion que sea una de estas (A,B,C,D,E o F)");

					}
				}

			}

		}
		System.out.println("-------Alumnos------");
		System.out.println("1 2 3 4 5 6 7 8 9 10");
		mostrarCalificaciones();
		
	}

}
