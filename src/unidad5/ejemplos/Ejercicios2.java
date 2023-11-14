package unidad5.ejemplos;

import java.util.Scanner;

public class Ejercicios2 {
	static int [] matriz = {3,6,8,90};
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduzca el valor para comprobar si esta en la matriz");
		int valorEspecifico = entrada.nextInt();
		comprobar(matriz,valorEspecifico);
		
		
	}
	
	public static void comprobar(int [] matriz , int valorEspecifico) {
		for(int i = 0 ; i < matriz.length ; i++) {
			if(matriz[i] == valorEspecifico) {
				System.out.println("El valor introducido "+valorEspecifico+" esta en la matriz");
			}
			
		}
		
		}
		
}


