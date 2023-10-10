package unidad2.ejemplos;

import java.util.Scanner;

public class Ejercicio16 {

	public static void main(String[] args) {
	/**	Realice un programa en Java que nos ayude a convertir divisas Euros/Libras y viceversa.
		Consulte a cuanto está el cambio en el momento de realizar el ejercicio. 
		1 euro esta a 0,86 libras*/
		
		
	double euro ;
	double libras ; 
	double pasarEaL ;
	double pasarLaE;
	double sacarPordeLibra; 
	
	Scanner entrada = new Scanner(System.in);

	System.out.println("Introduce el euro que deseas convertir a libra ");
	euro = entrada.nextInt();
	
	pasarEaL = (euro * 86) / 100;
	
	
	pasarEaL = (libra * 14) / 100;
	
	
		


	}

}
