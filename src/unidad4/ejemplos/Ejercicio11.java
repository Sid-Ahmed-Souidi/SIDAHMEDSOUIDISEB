package unidad4.ejemplos;

import java.util.Scanner;

public class Ejercicio11 {
	public static double millas_a_kilometros(int millas) {
		double kilometros ;
		
		kilometros = millas * 1.60934 ; 
		
		return kilometros ; 
	}

	public static void main(String[] args) {
		int numKilometros; 
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduzca el numero de millas");
		numKilometros = entrada.nextInt();
		
		
		System.out.println("El equivalente de millas a kilometros es de:"+millas_a_kilometros(numKilometros));
		
		
	}

}
