package unidad7.ejemplos;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio2 {

	public static Random random = new Random();
	public static Scanner entrada = new Scanner(System.in);
	public static int numero1;
	public static int numero2;
	public static void main(String[] args) {

		
		pedirNumeros();
		comprobarNumeros();
		

		
		
	}

	private static void comprobarNumeros() {
		if((numero1 > 0 && numero1 <100) && (numero2 > 0 && numero2 < 100) ) {
			
				generarNumero(numero1 , numero2);
		}else {
			System.out.println("los numeros no son validos");
		}
		
		
	}



	private static void generarNumero(int numeroPrimero, int numeroSegundo) {
		
		 int numeroAleatorio = random.nextInt(numeroSegundo - numeroPrimero + 1) + numeroPrimero ;  
		 System.out.println("numero Aleatorio entre "+numeroPrimero +" y "+numeroSegundo+" : "+numeroAleatorio);
		
		
	}

	private static void pedirNumeros() {
		System.out.println("Introduce el primer numero");
		 numero1 = entrada.nextInt();
		System.out.println("Introduce el segundo numero");
		 numero2 = entrada.nextInt();
	}

}
