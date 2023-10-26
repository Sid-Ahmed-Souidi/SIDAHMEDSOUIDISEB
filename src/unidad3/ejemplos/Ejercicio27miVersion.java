package unidad3.ejemplos;

import java.util.Scanner;

public class Ejercicio27miVersion {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int canBilletes ;
		int billete500 = 0 ; 
		int contador500 = 0;
		// los billetes de 500 los puedo poner en valor constantes 
		System.out.println("Introduce la cantidad de billetes :");
		canBilletes = entrada.nextInt();
		
		
		for(int i = 1; i <= canBilletes / 500 ; i++ ) {
			//System.out.println(i);
			contador500++;
			System.out.println(+contador500);
			
			
		}
		
		
		
	}

}
