package unidad2.ejemplos;

import java.util.Scanner;

public class Ejercicio14 {
	
	
	
	
	public static void main(String[] args) {
		        
	int numero = 5;
	int factorial = 4; // Inicializa el resultado del factorial a 1
	int resultado;
	int contador = 0 ;
	for (int i = 0; i <= numero && i <= factorial ;numero = numero -1 ,factorial = factorial = factorial -1 ) {
		        
		System.out.println(numero);
		System.out.println(factorial);
		resultado = numero * factorial ;
		contador = ++resultado 
		//System.out.println(resultado);

	}
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Que numero quieres factorizar ");
	int factorialNumero = sc.nextInt() ;
	for( int i = 1 ; i >= numero ; i++) {
		System.out.println(factorialNumero *  i);
	}
	

		//System.out.println("El factorial de " + numero + " es: " + resultado);
		    }
	}


