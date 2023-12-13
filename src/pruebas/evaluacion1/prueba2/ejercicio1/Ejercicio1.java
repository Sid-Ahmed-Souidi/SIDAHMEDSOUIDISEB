package pruebas.evaluacion1.prueba2.ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {
	
	static Scanner entrada= new Scanner(System.in);
	static final int TAM = 5;
	static int [] dorsales = new int[TAM];
	static int [] posiciones = new int[TAM];
	
	static int dorsal;
	public static void main(String[] args) {
		
		introducirDorsales();
		posiciones();
	}
	

	private static void posiciones() {
		for(int i = 0 ; i < TAM ; i++) {
			if(dorsales[i] == dorsales[2]) {
			System.out.println("El Menor esta en la posicion"+(i+1));
			int tmp = dorsales[i+1];
			 dorsales[i+1] =dorsales[i] ;
			 dorsales[i] = tmp;
			
			}
		}
	
	}


	private static void introducirDorsales() {
		for(int i = 0 ; i < TAM ; i++) {
			System.out.println("Introduce los dorsales");
			dorsal = entrada.nextInt();
			dorsales[i] = dorsal;
		}
		
	}
	
}
