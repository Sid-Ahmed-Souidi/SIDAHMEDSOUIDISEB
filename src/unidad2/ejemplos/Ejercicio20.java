package unidad2.ejemplos;

import java.util.Scanner;

public class Ejercicio20 {

	public static void main(String[] args) {
		/**Escribe una aplicación que introduzca del usuario el radio de un círculo como un número entero 
		e imprima el diámetro, la circunferencia y el área del círculo utilizando el valor en coma flotante 3.14159 para π.
		Utiliza las siguientes fórmulas (r es el radio):

		diámetro = 2r 

		circunferencia = 2πr 

		área = πr2 */
		
		Scanner entrada = new Scanner(System.in); 
		
		double PI 
		int numeroRadio ; 
		double diametro;
		double circunferencia ;
		double area ; 
		
		System.out.println("Introduzca el radio");
		
		numeroRadio = entrada.nextInt();
		
		diametro = 2 * numeroRadio;
		System.out.println("El calculo diametro"+numeroRadio);
		circunferencia = 2 * numeroRadio;
		System.out.println("El calculo diametro"+numeroRadio);
		
		

		
		

		
		
		
		
	}

}
