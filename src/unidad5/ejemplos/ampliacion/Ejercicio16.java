package unidad5.ejemplos.ampliacion;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio16 {

	public static Random random = new Random();
	public static Scanner entrada = new Scanner(System.in);
	public static int[] numeros = new int[20];
	public static void main(String[] args) {
	
		
		rellenar();
		mostrar();
		System.out.println("1. Multiplo de 5 // 2. Multiplo de 7 ");
		int seleccion = entrada.nextInt();
		if(seleccion==1) {
			mostrarMultiplo(5);
		}else if(seleccion==2) {
			mostrarMultiplo(7);
		}
	}
	private static void mostrarMultiplo(int numero) {
		for(int i = 0 ; i < numeros.length ; i++) {
			if(numeros[i] % numero ==0) {
				System.out.print("["+numeros[i]+"]"+" ");
				
			}
			else {
				System.out.print(numeros[i]+" ");
			}
		}		
	}		
	private static void mostrar() {
		for(int numero :numeros) {
			System.out.print(numero+" ");
		}System.out.println();
	}
	private static void rellenar() {
		
		for(int i = 0; i < numeros.length ; i ++) {
			int numero = random.nextInt(401);
			numeros[i] = numero;
		}
	}

}
