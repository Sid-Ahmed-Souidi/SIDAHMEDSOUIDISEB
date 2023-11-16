package unidad4.ejemplos;

import java.util.Scanner;

public class Ejercicio18 {

	public static double quintosAEuros(int numero) {
		double euros ;
		euros = numero * 0.20 ;
		return euros ;


	}

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduzca el numero de monedas de 20 centimos");
		int numero = entrada.nextInt();
		System.out.println("este es la equivalencia : "+quintosAEuros(numero)+" euros");




	}

}
