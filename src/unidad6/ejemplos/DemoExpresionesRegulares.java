package unidad6.ejemplos;

import java.util.Scanner;

public class DemoExpresionesRegulares {

	public static void main(String[] args) {


		Scanner entrada = new Scanner(System.in);
		
		
		System.out.println("Dame un dato :" );
		String dato = entrada.nextLine();
		
		// . = cualquier caracter
		// * = el numero de caracteres que quieres poner
		// + = coincide con 1 o mas repeticiones
		//  \\d
		//  {n} minimo de veces
		// {n,m} minimo de veces y maximo de veces
		// [A-Z,a-z]
		//
		String  expresionRegular = "\\d{3}";
		
		Boolean resultado = dato.matches(expresionRegular);
		
		
		if(resultado) {
			System.out.println("Dato valido");
			
		}else {
			System.out.println("Dato inválido");
		}
	
	    entrada.close();
	
	}
	
	
	
	

}
