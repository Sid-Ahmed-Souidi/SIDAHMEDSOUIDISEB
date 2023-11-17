package unidad5.ejemplos;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio11 {
	
	 static int N = 0;
	 static String M ;
	 static String [] matriz;
	static Scanner entrada = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		pedirN();
		pedirM();		
	     System.out.println(Arrays.toString(tamañoN(matriz , N)));
	     System.out.println(Arrays.toString(escribirM(matriz , M)));
		
	}
	
	
	//FUNCIONES 
	public static int pedirN() {
		System.out.println("Introduzca el tamaño de la array");
		 N = entrada.nextInt();
		return N;
	
	}
	public static String pedirM() {
		System.out.println("Introduzca el que escriba en la array");
		M = entrada.nextLine();
		return M;
	}
	public static String [] tamañoN(String[] matriz , int N) {
		
		matriz = new String[N];
		return matriz;
	}
	
	public static String [] escribirM(String[] matriz , String M) {
		
		for(int i = 0 ; i < matriz.length ; i++) {
			matriz[i] = matriz[i]+M;
			
		}return matriz;
		
	}
	

}
