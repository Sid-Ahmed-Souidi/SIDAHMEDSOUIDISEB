package unidad4.ejemplos;

import java.util.Scanner;

public class Funciones {

	public static void sumarEnteros(int num1, int num2) {
		int suma = num1+num2;
		imprimirResultado(suma, "suma enteros");
	}

	public static void sumarDobles(double num1, double num2) {
		double suma = num1+num2;
		imprimirResultado(suma, "suma doubles");
	}

	public static void sumar(int num1, int num2) {
		int suma = num1+num2;
		imprimirResultado(suma, "suma");
	}

	public static void sumar(double num1, double num2) {
		double suma = num1+num2;
		imprimirResultado(suma, "suma");
	}

	public static void sumar(int num1, int num2,double num3, double num4) {
		double suma = num1+num2+num3+num4;
		imprimirResultado(suma, "suma");
	}

	public static void restar(int num1, int num2) {
		int resta = num1-num2;
		imprimirResultado(resta, "resta");
	}

	public static void imprimirResultado(int resultado,String operacion) {
		System.out.println("________ La "+operacion+" es :"+resultado);
	}

	public static void imprimirResultado(double resultado,String operacion) {
		System.out.println("________ La "+operacion+" es :"+resultado);
	}

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduzca un número:");
		int num1 = entrada.nextInt();
		System.out.println("Introduzca otro número:");
		int num2 = entrada.nextInt();

		sumar(num1,num2);

		System.out.println("Introduzca un número:");
		double num3 = entrada.nextDouble();
		System.out.println("Introduzca otro número:");
		double num4 = entrada.nextDouble();

		sumar(num3,num4);


		sumar(num1,num2,num3,num4);

		//restar(num1,num2);


	}

}
