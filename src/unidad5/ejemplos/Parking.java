package unidad5.ejemplos;

import java.util.Arrays;
import java.util.Scanner;

public class Parking {

	
	static Scanner entrada = new Scanner(System.in);
	static final char FILAS = 5 ;
	static final char COLUMNAS = 8;
	static char [][] parking = new char[FILAS][COLUMNAS];
	static char [][] tipoParking = new char[FILAS][COLUMNAS];
	static int opcion;
	public static void main(String[] args) {

	
		
		iniciarParking();
		System.out.println("Tipos de Parking");
		iniciarTipoParking();

		
do{
			System.out.println("1.Mostrar Parking");
			System.out.println("2.Ocupar Parking");
			System.out.println("3.Liberar Parking");
		 	opcion = entrada.nextInt();

			
			switch(opcion) {
		
			case 1:
				mostrarParking();
				mostrarTipoParking();

				break;
			case 2 :
				ocuparPlaza();
				
				break;
			case 3 :	
				liberarPlaza();

				break;
			case 4 :
				System.out.println("Saliendo...");
			}
			
			
			
		}while(opcion!=4);
	}
	private static void iniciarTipoParking() {
		for(int i = 0 ; i < FILAS ; i++) {
			for(int j = 0 ; j < COLUMNAS ; j++) {
				tipoParking[i][j]= 'N';
			}
		}
		tipoParking[0][0] = 'D';
		tipoParking[0][1] = 'D';
		tipoParking[1][0] = 'D';
		tipoParking[1][1] = 'D';
		tipoParking[2][0] = 'F';
		tipoParking[2][1] = 'F';	
		tipoParking[3][0] = 'E';
		tipoParking[3][1] = 'E';
		
		
	}
	private static void liberarPlaza() {
		boolean noEncontrado = true;
		System.out.println("Indica la plaza que quieras liberar");
		System.out.println("Indica la fila");
		int fila = entrada.nextInt();
		System.out.println("Indica la columna");
		int columna = entrada.nextInt();
		for(int i = 0 ; i < FILAS && noEncontrado ; i++) {
			for(int j = 0 ; j < COLUMNAS && noEncontrado ; j++) {
				if(parking[i][j] == parking[fila-1][columna-1]) {
					parking[i][j] = 'L';
					noEncontrado = false;
				}
			}
		}
				
	}
	private static void ocuparPlaza() {
		boolean noEncontrado = true;
		System.out.println("Indica la plaza que quieras ocupar");
		System.out.println("Indica la fila");
		int fila = entrada.nextInt();
		System.out.println("Indica la columna");
		int columna = entrada.nextInt();
		for(int i = 0 ; i < FILAS && noEncontrado ; i++) {
			for(int j = 0 ; j < COLUMNAS && noEncontrado ; j++) {
				if(parking[i][j] == parking[fila-1][columna-1]) {
					parking[i][j] = 'O';
					noEncontrado = false;
				}
			}
		}
		
		
	}
	private static void mostrarParking() {
		for(int i = 0 ; i < FILAS ; i++) {
			for(int j = 0 ; j < COLUMNAS ; j++) {
				System.out.print(parking[i][j] + " ");
				
			}
			
			System.out.println(" ");
		}			


	}
	private static void iniciarParking() {
		
		for(int i = 0 ; i < FILAS ; i++) {
			for(int j = 0 ; j < COLUMNAS ; j++) {
					parking[i][j]= 'L';
			}
		}
	}
	private static void mostrarTipoParking() {
		for(int i = 0 ; i < FILAS ; i++) {
			for(int j = 0 ; j < COLUMNAS ; j++) {
				System.out.print(tipoParking[i][j] + " ");
				
			}
			
			System.out.println(" ");
		}			


	}
	


}

