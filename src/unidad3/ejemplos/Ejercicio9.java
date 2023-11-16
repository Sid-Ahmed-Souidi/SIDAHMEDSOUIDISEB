package unidad3.ejemplos;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		double nota1 ;
		double nota2 ;
		double nota3 ;
		double promedio ;
		System.out.println("Introduzca la primera nota");
		nota1 = entrada.nextDouble();
		System.out.println("Introduzca la segunda nota");
		nota2 = entrada.nextDouble();
		System.out.println("Introduzca la tercera nota");
		nota3 = entrada.nextDouble();

		promedio = (nota1 + nota2 + nota3) / 3;

		if(promedio >= 7) {
			System.out.println("Promociona con la nota   :"+promedio);

		}else {
			System.out.println("No promociona");
		}







	}

}
