package unidad2.ejemplos;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		
		 /**Escribe una aplicación que, usando números, 
		imprima la suma, producto, diferencia y cociente (división) de los números.*/
		int numero1;
		int numero2; 
		int suma ;
		float div;
		int mul ; 
		int resta;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduzca el primer numero");
		numero1 = entrada.nextInt();
		System.out.println("Introduzca el segundo numero");
		numero2 = entrada.nextInt();
		
		suma = numero1 + numero2 ;
		System.out.println("La suma de los numeros introducidos es:"+suma);
		
		div = numero1 / numero2;
		System.out.println("La division de los numeros introducidos es:"+div);
		
		mul = numero1 * numero2;
		System.out.println("La multiplicacion de los numeros introducidos es:"+mul);
		
		resta = numero1 - numero2;
		System.out.println("La diferencia de los numeros introducidos es:"+resta);
		
		
		

		
		
		
	}

}
