package unidad3.ejemplos;

import java.util.Scanner;

public class Ejercicio24 {

	public static void main(String[] args) {
		Scanner entrada  = new Scanner(System.in);
		String letra ;
		double calificacion ;

		System.out.println("Introduzca la calificación");
		calificacion = entrada.nextDouble();
		if(calificacion >= 9 && calificacion<=10) {
			System.out.println("Su calificación es A");

		}else if(calificacion >= 8 && calificacion<=8.9) {
			System.out.println("Su calificación es B");

		}else if(calificacion >= 7 && calificacion<=7.9) {
			System.out.println("Su calificación es C");

		}else if(calificacion >= 6 && calificacion<=6.9) {
			System.out.println("Su calificación es D");
		}else if(calificacion <= 6) {
			System.out.println("Su calificación es F");

		}else {
			System.out.println("Introduzca una nota entre los valores 1 al 10");

		}


	}

}
