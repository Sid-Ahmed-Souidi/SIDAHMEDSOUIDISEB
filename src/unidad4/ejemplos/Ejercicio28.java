package unidad4.ejemplos;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ejercicio28 {
	
	static int nHabitaciones ;
	static double pPinturaKg ;
	static double mCuadrados ; 
	static double totalMCuadrados ; 
	static double cantidadPintura;
	static double costoPintura;
	static double cargosLaborales;
	static double horasNecesarias ; 
	static double costoTotal ; 
	static final int  cobroXhora  = 14;
	
	static DecimalFormat df = new DecimalFormat("0.00##");

	static Scanner entrada = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		pedirDatos();
		System.out.println("Metros cuadrados "+mCuadrados());	
		System.out.println("Horas de trabajo son :"+horasTabajo());
		System.out.println("El costo total de pintura son de"+costoDePintura());
	    System.out.println("Los cargos laborales son de "+cargosLaborales());  
	   System.out.println("El costo total de la pintura es de:"+costoTotal()); 
		
	}

	

	private static double costoTotal() {
		
		costoTotal = costoPintura + cargosLaborales ;
		return costoTotal;
	}



	private static double cargosLaborales() {
		cargosLaborales = horasNecesarias * 14.00;
		df.format(cargosLaborales);
		return cargosLaborales;
	}



	private static double  horasTabajo() {
			
			horasNecesarias =  (totalMCuadrados / 35) * 8;
			df.format(cargosLaborales);
			return horasNecesarias;	
	}
	private static double costoDePintura() {
		costoPintura = cantidadPintura * pPinturaKg;
		df.format(costoPintura);
		return costoPintura;
	}
	private static double cantidadPitura() {
		
		cantidadPintura = (totalMCuadrados / 35) * 3.7 ;
		
		return cantidadPintura ; 
		
	}
	

	private static double  mCuadrados() {
		System.out.println("Introduzca los metros cuadrados por habitacion");
		for(int i = 0 ; i < nHabitaciones ; i ++) {
			System.out.println("la "+(i+1)+ "habitacion");
			mCuadrados = entrada.nextInt();
			totalMCuadrados += mCuadrados ;
		}return totalMCuadrados ;
		
	}

	private static void pedirDatos() {
		System.out.println("Introduce el numero de habitaciones a pintar");
		nHabitaciones = entrada.nextInt();
		System.out.println("Introduce el precio de pintura por Kg");
		pPinturaKg = entrada.nextDouble();

	}
	
	

}
