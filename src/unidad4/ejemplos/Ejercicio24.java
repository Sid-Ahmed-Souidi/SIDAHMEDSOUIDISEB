package unidad4.ejemplos;

import java.util.Scanner;

public class Ejercicio24 {
	
	static int  numPisos ;
	static int numHabitaciones;	
	static int habitaciones;
	static int ocupadas ; 
	static int vacantes ;
	static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("¿Cuantos pisos tiene el hotel ?");
		 numPisos = entrada.nextInt();
		 
		 numPisos( numPisos);
	}
	
	public static void numPisos(int numPisos) {
		
		for(int i = 1; i < numPisos ; i ++) {
			System.out.println("El piso"+i);
			numHabitaciones();
			habitacionesOcupadas();
			
			
		}
	}
	
	public static int numHabitaciones() {
		System.out.println("¿Cuantas habitaciones hay en el piso?");
		 habitaciones = entrada.nextInt();
		 return habitaciones ;
	}
	public static int habitacionesOcupadas() {
		System.out.println("¿Cuantas habitaciones estan ocupadas?");
		 ocupadas = entrada.nextInt();
		 return ocupadas ; 
	}
	public static int habitacionesVacantes() {
		int vacantes = habitaciones - ocupadas ;
		System.out.println("El numero de habitaciones vacantes es :");
		return vacantes;
		
	}

	
	
}
