package unidad2.ejemplos;

import java.util.Scanner;

public class Ejercicio18 {

	public static void main(String[] args) {
	/**	Realice un programa en Java que nos ayude a convertir divisas Euros/Libras y viceversa.
		Consulte a cuanto está el cambio en el momento de realizar el ejercicio. 
		1 euro esta a 0,86 libras*/
		
		
	double euro ;
	double libra ; 
	double pasarEaL ;
	double pasarLaE;
	double sacarPordeLibra; 
	
	Scanner entrada = new Scanner(System.in);

	System.out.println("Introduce el euro que deseas convertir a libra ");
	libra = entrada.nextInt();
	System.out.println("Introduce la libra que deseas convertir a euro ");
	euro = entrada.nextInt();
	
	pasarEaL = (euro * 86) / 100;
		
	pasarLaE = libra + (libra * 14) / 100;
	
	System.out.println("Este es el resultado de pasar Euro a libra"+pasarEaL);
	System.out.println("Este es el resultado de pasar libra a Euro"+pasarLaE);
	
	
	
	
		


	}

}
