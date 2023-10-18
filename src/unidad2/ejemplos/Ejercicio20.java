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
		
		double PI = 3.14 ;
		int numeroRadio ; 
		double diametro;
		double circunferencia ;
		double area ; 
		
		System.out.println("Introduzca el radio");
		
		numeroRadio = entrada.nextInt();
		
	/**	diametro = 2 * numeroRadio;
		System.out.println("El calculo diametro"+numeroRadio);
		area =  PI * Math.pow(numeroRadio,2);
		System.out.println("El calculo diametro"+numeroRadio);*/
		
		/**
		 System.out.printf("Suma: %d + %d = %d%n", num1, num2, (num1 + num2));
	        System.out.printf("Resta: %d - %d = %d%n", num1, num2, (num1 - num2));
	        System.out.printf("Multiplicación: %d * %d = %d%n", num1, num2, (num1 * num2));
	        System.out.printf("División: %d / %d = %.2f%n", num1, num2, ((double) num1 / num2));*/
		
		
        System.out.printf("Diametro: %d * %d = %d%n", 2, numeroRadio, (2 * numeroRadio));

        System.out.printf("El area del círculo con radio %.2f es %.2f%n", numeroRadio, PI * Math.pow(numeroRadio, 2));

        System.out.printf("Circunferencia: %d * %d * %d = %d%n", 2, PI, numeroRadio, (2 * PI * numeroRadio));

		
		
	}

}
