package unidad5.ejemplos;

import java.util.Scanner;

public class eliminarElemento {
	
	public static Scanner entrada = new Scanner(System.in);
	
	public static int[] matriz = {2,4,6,7,8,9,45,4,23};
	
	public static void main(String[] args) {
		
		
	eleminarElemento();	
		
	}

	private static void eleminarElemento() {
		System.out.println("Introduzca el elemento que quiera eliminar");
		int elemento = entrada.nextInt();
		
		
	}

}
