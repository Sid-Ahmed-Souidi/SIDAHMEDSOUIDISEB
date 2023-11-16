package unidad3.ejemplos;

import java.util.Scanner;

public class Sorteo {

	public static void main(String[] args) {

		int sorteo = 6 ;
		Scanner entrada = new Scanner(System.in);
		int eleccion;

		System.out.println("Dame un numero entre 1 al 10");
		eleccion = entrada.nextInt();

		while(sorteo!=eleccion) { // mientras sorteo sea distinto a eleccion
			System.out.println("Intentelo de nuevo,Dame otro numero");
			eleccion=entrada.nextInt();	// pedimos otra vez
			}
		System.out.println("Has acertado");

	}

}
