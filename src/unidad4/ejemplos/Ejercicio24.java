package unidad4.ejemplos;

import java.util.Scanner;

public class Ejercicio24 {

	static int  numPisos ;
	static int habitaciones;
	static int ocupadas ;
	static int vacantes ;
	static int numHabitacionesTotal = 0 ;
	static int habitacionesOcupadasT = 0;
	static int habitacionesVacantesT = 0;
	static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("¿Cuantos pisos tiene el hotel ?");
		 numPisos = entrada.nextInt();
		 numPisos( numPisos);
	}

	public static void numPisos(int numPisos) {
		numPisos = numPisos + 1;
		for(int i = 1; i < numPisos ; i ++) {
			System.out.println("-----El piso-----"+i);
			numHabitaciones();
			habitacionesOcupadas();
			habitacionesVacantes();
			mostrarTotalHabitaciones();

		}
	}
	public static int numHabitaciones() {
		System.out.println("¿Cuantas habitaciones hay en el piso?");
		 habitaciones = entrada.nextInt();
		 numHabitacionesTotal += habitaciones ;
		 return habitaciones ;
	}
	public static int habitacionesOcupadas() {
		System.out.println("¿Cuantas habitaciones estan ocupadas?");
		 ocupadas = entrada.nextInt();
		 habitacionesOcupadasT += ocupadas ;
		 return ocupadas ;
	}
	public static int habitacionesVacantes() {
		int vacantes = habitaciones - ocupadas ;
		System.out.println("El numero de habitaciones vacantes del piso es :"+vacantes);
		habitacionesVacantesT += vacantes;
		return vacantes;

	}
	public static void mostrarTotalHabitaciones(){

		System.out.println("El numero total de habitaciones del Hotel es de: " +numHabitacionesTotal);
		System.out.println("El habitaciones totales ocupadas del hotel es de : "+habitacionesOcupadasT);
		System.out.println("El habitaciones totales vacantes del hotel es de : "+habitacionesVacantesT);
		System.out.println("La tasa de opucacion es de : "+tasaOcupacion(habitacionesOcupadasT,habitacionesVacantesT));


	}
	public static int tasaOcupacion(int habitacionesOcupadasT, int habitacionesVacantesT) {

		int tasa = habitacionesOcupadasT / habitacionesVacantesT;
		return tasa;
	}



}
