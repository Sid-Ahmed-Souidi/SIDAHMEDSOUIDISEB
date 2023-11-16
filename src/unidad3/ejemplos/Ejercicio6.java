package unidad3.ejemplos;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);

	int numero ;

	System.out.println("Escribe un numero  ");
	numero = entrada.nextInt();

	if(numero > 9) {
		System.out.println("El numero que ha escrito es de dos digitos ");

	}else if(numero <= 9) {
		System.out.println("El numero que ha escrito es de un dijito");


	}




	}

}
