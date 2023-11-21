package unidad4.ejemplos;

import java.util.Scanner;

public class Ejercicio25 {

	static Scanner entrada = new Scanner(System.in);
	static int edad;
	static int anioActual;
	static int anioNacimiento;
	static int decadaEdad;
	static int cuantiaPrima; 
	
	public static void main(String[] args) {
		
		
		
		System.out.println("La cuantia Prima es de :"+cuantiaPrima());
		
	}
		


	public static int cuantiaPrima() {
		System.out.println("Introduce el año actual");
		anioActual = entrada.nextInt();
		System.out.println("Introduce el año de nacimiento");
		anioNacimiento = entrada.nextInt();
		
		edad = anioActual - anioNacimiento;
		decadaEdad =  edad / 10 ; 
		
		cuantiaPrima = (decadaEdad +15) * 20 ; 
	
		return cuantiaPrima;

	}

}
