package unidad5.ejemplos;

import java.util.Scanner;

public class MediaMediana {
	
	public static final int tam = 9 ;
	public static int [] numeros = new int[tam];
	public static Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) {
		
		ingresarNumeros();
		media();
		mediana();
	}

	private static void mediana() {
		int mediana = (numeros.length -1) / 2;
		
		System.out.println("La mediana es la posicion " +(mediana+1)+ " con el valor de "+numeros[mediana]);
		
		
	}

	private static void media() {
		int contador = 0;
		for(int i = 0 ; i < numeros.length ; i++) {
			contador += numeros[i];
			
			
		}
		int media = contador / numeros.length;
		System.out.println("La media de los numeros ingresados es de "+media);
		
		
	}

	private static void ingresarNumeros() {
		for(int i = 0 ; i < numeros.length ; i ++) {
			System.out.println("Ingresa  9 numeros");
			System.out.println("Numero "+(i+1));
			int numero = entrada.nextInt();
			numeros[i] = numero;
			
			
		}
		
	}

}
