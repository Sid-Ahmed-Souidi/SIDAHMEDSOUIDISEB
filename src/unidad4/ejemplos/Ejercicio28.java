package unidad4.ejemplos;

import java.util.Scanner;

public class Ejercicio28 {
	
	static int nHabitaciones ;
	static int pPinturaKg ;
	static int mCuadrados ; 
	static int totalMCuadrados ; 
	static double cantidadPintura;
	static int horasNecesarias ; 
	static final int  cobroXhora  = 14;
	static Scanner entrada = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		pedirDatos();
		System.out.println(mCuadrados());	
		System.out.println(cantidadPitura()); 
		System.out.println(horasTabajo()); 
		
		
		
		
	}

	private static int  horasTabajo() {
		for(int i = 35 ;   i <= totalMCuadrados ; i ++) {
			horasNecesarias += 8 ;
			
		}return horasNecesarias;
		
	}

	private static double cantidadPitura() {
		
		cantidadPintura = totalMCuadrados / 35 ;
		return cantidadPintura ; 
		
	}

	private static int  mCuadrados() {
		System.out.println("Introduzca los metros cuadrados por habitacion");
		for(int i = 0 ; i < nHabitaciones ; i ++) {
			System.out.println("la "+i+1+ "habitacion");
			mCuadrados = entrada.nextInt();
			totalMCuadrados += mCuadrados ;
		}return totalMCuadrados ;
		
	}

	private static void pedirDatos() {
		System.out.println("Introduce el numero de habitaciones a pintar");
		nHabitaciones = entrada.nextInt();
		System.out.println("Introduce el precio de pintura por Kg");
		pPinturaKg = entrada.nextInt();

	}
	
	

}
