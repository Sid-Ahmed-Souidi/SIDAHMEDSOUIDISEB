package unidad6.ejemplos.Ejercicio5;

import java.util.Scanner;

public class MiNumero {
	public static Scanner entrada = new Scanner(System.in);
	
	private  int numero ;

	
	
	// constructor sin parametros 
	
	public MiNumero() {
		
		numero =0;
		
	}
	// constructor que asigna el valor al numero
	public MiNumero(int numero) {
		this.numero = numero ;
	}
	
	// metodos 
	
	public  int cambiarNumero(  ) {
		int numero1 ;
		System.out.println("Asigna el numero que quiera cambiar");
		numero1 = entrada.nextInt();
		 numero = numero1;
		return numero;
	}
	
	public  int suma( ) {
		
		 System.out.println("Introduce el valor que quieras sumar");
		 int valor = entrada.nextInt();
		 int suma = numero + valor ;
		 return suma ;
	}
	
	public  int resta( ) {
		
		 System.out.println("Introduce el valor que quieras resta");
		 int valor = entrada.nextInt();
		 int resta = numero - valor ;
		 return resta ;
		
	}



	public int getValor() {
		return numero;
	}


	
	public  int getDoble( ) {
	
		 int doble = numero * 2 ;
		 return doble ;
		
		
	}
	
	
	public  int getTriple( ) {
		
		 int triple = numero * 3 ;
		 return triple ;
		
		
	}
	
	public  int getCuadruple( ) {
		
		 int cuadruple = numero * 4 ;
		 return cuadruple ;
		
		
	}
	
	
	
	
	
	
	
	
	
	
}
