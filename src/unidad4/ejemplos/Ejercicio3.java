package unidad4.ejemplos;

import java.util.Scanner;

public class Ejercicio3 {
	public static int multiplicacion(int num1 , int num2) {

		int mul = num1 * num2;
		return mul ;
	}

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Introduce el primer numero");
		int num1 = entrada.nextInt();
		System.out.println("Introduce el segundo numero");
		int num2 = entrada.nextInt();

		System.out.println("Este es el resultado de la multiplicacion de estos numeros"+multiplicacion(num1 , num2));



	}

}
