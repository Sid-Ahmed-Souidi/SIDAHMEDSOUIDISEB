package unidad2.ejemplos;

import java.util.Scanner;

public class Ejercicio17 {

	public static void main(String[] args) {
		/**Desarrollar un programa Java que realice la conversión de grados Fahrenheit
			a Celsius y viceversa, teniendo en cuenta que la fórmula para pasar de Fahrenheit
			a Celsius es (°F - 32) x 5/9 =°C
		   y para pasar de Celsius a Fahrenheit (°C x 9/5) + 32 =°F. */


	int Fahrenheit ;
	int Celsius ;
	int PasarCaF ;
	int PasarFaC;

	Scanner entrada = new Scanner(System.in);

	System.out.println("Introducir el valor Farenheit");
	Fahrenheit = entrada.nextInt();


	System.out.println("Introducir el valor Celsius");
	Celsius = entrada.nextInt();


	PasarFaC = (Fahrenheit - 32) * 5/9 ;
	PasarCaF = (Celsius * 9/5) + 32 ;

	System.out.println("De fahrenheit a Celsius"+PasarFaC);
	System.out.println("De Celsius a fahrenheit"+PasarCaF);










	}

}
