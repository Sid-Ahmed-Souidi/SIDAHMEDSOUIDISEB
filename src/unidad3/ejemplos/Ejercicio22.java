package unidad3.ejemplos;

import java.util.Scanner;

public class Ejercicio22 {

	public static void main(String[] args) {
		int horas ;
		int horasExtras;
		int cobroDoble;
		int cobroTriple;
		
		Scanner entrada = new Scanner(System.in);
		horas = entrada.nextInt();
		
		if(horas >=40) {
			horasExtras = horas - 40 ;
			if(horasExtras <= 8);{	
				cobroDoble = horasExtras * 25 ;
				
			}else if(horasExtras> 8); {
				cobroTriple = (int) (horasExtras * 37.5);
				
			}
				
			
			
			
			
		}
	}

}
