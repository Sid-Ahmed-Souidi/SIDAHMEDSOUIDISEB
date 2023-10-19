package unidad3.ejemplos;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
	
		double numeroKilos ;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduzca el numero de Kilos");
		numeroKilos = entrada.nextDouble();
		
		if(numeroKilos > 30) {
			System.out.println("DEMASIADO PESO");
			
		}else if(numeroKilos >= 22) {
			System.out.println("NIVEL MAXIMO");
			
		}else if(numeroKilos >= 15) {
		
			System.out.println("NIVEL ALTO");
		}else if(numeroKilos >= 8) {			
			
			System.out.println("NIVEL MEDIO");
		
		}else if(numeroKilos < 8) {
			System.out.println("NIVEL MINIMO");
		
		}
		
			
			

		
		
		
		
		
		
		
		
		
		
	 
		
		
		
		
		
	}

}
