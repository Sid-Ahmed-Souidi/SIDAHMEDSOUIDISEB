package unidad3.ejemplos;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		double tornillo ;
		System.out.println("Introduzca el tamaño del tornillo");
		tornillo = entrada.nextDouble();

		if(tornillo>= 1 && tornillo < 3) {
			System.out.println("PEQUEÑO");
		}else if(tornillo>= 3 && tornillo < 5) {
			System.out.println("MEDIANO");
		}else if(tornillo>= 5 && tornillo < 6.5) {
			System.out.println("GRANDE");
		}else if(tornillo>= 6.5 && tornillo < 8.5) {
			System.out.println("MUY GRANDE");
		}



	}

}
