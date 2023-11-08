package unidad4.ejemplos;

import java.util.Scanner;

public class ProgramaNumeros2 {
		static int numero1;
		static int numero2;
	public static void main(String[] args) {
		
		
		pedirDatos();
		mostrarDobleNumero(numero1 , numero2);
		mostrarCincoVecesNumero(numero1 , numero2);
		mostrarCuadradoNumero(numero1 , numero2);

	}
	//Pedir numeros
	
	public static void pedirDatos() {
		Scanner entrada =  new Scanner(System.in);		
		System.out.println("Introduzca el primer numero");
		 numero1 = entrada.nextInt();
		System.out.println("Introduzca el segundo numero");
		 numero2 = entrada.nextInt();
	}
	
	
	// FUNCIONES 
		public static void mostrarDobleNumero(int numero1, int numero2) {
			
			double numeroDoble = numero1 * 2;
			System.out.println("El doble del primer numero es  :"+numeroDoble);
			double numeroDoble2 = numero2 * 2;
			System.out.println("El doble del segundo numero es  :"+numeroDoble2);
		}
		
		public static void mostrarCincoVecesNumero(int numero1 , int numero2) {
			
			double numeroDoble = numero1 * 5;
			System.out.println("Mostrar 5 veces del primer  numero   :"+numeroDoble);
			double numeroDoble2 = numero2 * 5;
			System.out.println("Mostrar 5 veces del segundo numero   :"+numeroDoble2);
			
			
		}
	public static void mostrarCuadradoNumero(int numero1 , int numero2) {
			
			
			double mostrarCuadrado = Math.pow(numero1, 2);
			System.out.println("Mostrar el cuadrado del primer numero   :"+mostrarCuadrado);
			double mostrarCuadrado2 = Math.pow(numero2, 2);
			System.out.println("Mostrar el cuadrado del segundo numero    :"+mostrarCuadrado2);
			
			
		}

}
