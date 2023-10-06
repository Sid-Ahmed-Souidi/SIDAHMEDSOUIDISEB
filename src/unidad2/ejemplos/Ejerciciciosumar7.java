package unidad2.ejemplos;

import java.util.Scanner;

public class Ejerciciciosumar7 {

	public static void main(String[] args) {
		int dato ;
		int dato2 ; 
		
		Scanner entrada = new Scanner(System.in);// entrada es un objeto 

		
		System.out.println("Introduce el primer dato a sumar");
		dato = entrada.nextInt() ;
		
		System.out.println("Introduce el primer dato a sumar");
		dato2 = entrada.nextInt() ;
		
		int suma = dato + dato2;

		System.out.println("La suma de los siguientes numeros"+suma);
		
		
		
		
	}

}
