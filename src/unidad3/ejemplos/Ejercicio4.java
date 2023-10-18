package unidad3.ejemplos;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int numero1;
		int numero2;
		
		System.out.println("Introduce el primer numero");
		numero1 = entrada.nextInt();
		System.out.println("Introduce el segundo numero");
		numero2 = entrada.nextInt();
		
		if(numero1>numero2) {
			System.out.println("El primer numero es mayor que el segundo");
			System.out.println(+numero1);
		}
		else if(numero2>numero1) {
			System.out.println("El segundo numero es mayor que el primero");
			System.out.println(+numero2);
		}
		else if(numero2==numero1) {
			System.out.println("Los numeros son iguales ");
		}
	}

}
