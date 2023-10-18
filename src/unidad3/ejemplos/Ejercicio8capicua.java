package unidad3.ejemplos;

import java.util.Scanner;

public class Ejercicio8capicua {

	public static void main(String[] args) {
		
	Scanner entrada = new Scanner(System.in);
		
		int numero ;
		int modulo;
		
		System.out.println("Introduzca un numero del 0 al 99.999");
		numero = entrada.nextInt();
		
		if(numero <= 9) {
		System.out.println("El numero es capicúa");
		
			
		}else if(numero >= 10 && numero <= 99) {
			System.out.println("El numero que ha introducido es de dos cifras");
			modulo = numero / 10
		}else if(numero >= 100 && numero <= 999) {
			System.out.println("El numero que ha introducido es de tres cifras");		
			
		}else if(numero >= 1000 && numero <= 9999) {
			System.out.println("El numero que ha introducido es de cuatro cifras");		
			
		}else if(numero >= 10000 && numero <= 99999) {
			System.out.println("El numero que ha introducido es de cinco cifras");		
			
		}
		

	}

}
