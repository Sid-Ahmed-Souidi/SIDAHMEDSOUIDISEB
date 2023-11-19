package unidad5.ejemplos;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio11 {
	
	 static int N = 0;
	 static String M ;
	 static String [] matriz = {};
	static Scanner entrada = new Scanner(System.in);
	
	public static void main(String[] args) {
		pedirN();
		pedirM();
		tamañoN();
        escribirM();
		
	}
	
	
	//FUNCIONES 
	public static int pedirN() {
		System.out.println("Introduzca el tamaño de la array");
		 N = entrada.nextInt();
		return N;
	
	}
	public static String pedirM() {
		System.out.println("Introduzca el caracter que se escriba en la array");
		M = entrada.next();
		
		return M;
	}
	public static void tamañoN() {
		matriz = new String[N];
		
	}
	
	public static void escribirM() {
		for(int i = 0 ; i < matriz.length ; i++) {
			matriz[i] = M;
			System.out.println(matriz[i]);
			
		}
		
	}
	

}
