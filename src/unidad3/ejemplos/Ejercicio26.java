package unidad3.ejemplos;

import java.util.Scanner;

public class Ejercicio26 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int cantidadBrochas ; 
		String tipoBrocha;
		double precioBrocha ;
		
		System.out.println("Introduzca el tipo de brocha ");
		tipoBrocha = entrada.nextLine();
		System.out.println("Introduzca la cantidad de brochas que deseas comoprar");
		cantidadBrochas= entrada.nextInt();
		
		if(tipoBrocha.equals("cerda")) {
			
			precioBrocha = cantidadBrochas * 20.00
			
			
		}
		
		
		
	}

}
