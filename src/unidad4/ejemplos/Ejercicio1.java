package unidad4.ejemplos;

import java.util.Scanner;

public class Ejercicio1 {

	public static int numeroPequeño(int num1 , int num2 , int num3) {
		if(num1< num2 && num1 < num3) {
			return num1;
		}else if(num2 < num1 && num2 < num3) {
			return num2;
			
		}else if(num3 < num1 && num3 < num2) {
			return num3;
		}else {
			System.out.println("Los numeros son iguales");
			return num1;
		}
	}
	public static void main(String[] args) {
		
	Scanner entrada = new Scanner(System.in);
	System.out.println("Introduce el primer numero");
	int num1 = entrada.nextInt();
	System.out.println("Introduce el segundo numero");
	int num2 = entrada.nextInt();
	System.out.println("Introduce el tercer numero");
	int num3 = entrada.nextInt();
	
	System.out.println("El numero mas pequeño de los tres introducidos es"+numeroPequeño(num1,num2,num3));
	
	
		
		
		
		
		
	}

}
