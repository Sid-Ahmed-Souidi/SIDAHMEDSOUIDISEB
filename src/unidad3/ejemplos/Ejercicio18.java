package unidad3.ejemplos;

import java.util.Scanner;

public class Ejercicio18 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int numero1 ;
		int numero2 ;
		int S ;
		int R ;
		int M ;
		int D ;
		char seleccion ;
		System.out.println("Introduce el primer numero ");
		numero1 = entrada.nextInt();
		System.out.println("Introduce el segundo numero ");
		numero2 = entrada.nextInt();
		
		do {
		System.out.println("-----------MENU------------");
		
		S = numero1 + numero2;
		R = numero1 - numero2;
		M = numero1 * numero2;
		D = numero1 / numero2;
		
		System.out.println("Elija una opcion(S/R/M/D) y enter : ");
		seleccion= entrada.next().charAt(0);
		if(seleccion=='S'|| seleccion=='s') {// HAY QUE PONER TAMBIEN PARA MINusculas este y el otro ejecicio 
			System.out.println("La opereracion seleccionada es la suma "+S);
			
		}else if(seleccion=='R'|| seleccion=='r') {
			System.out.println("La opereracion seleccionada es la resta "+R);
			
		}else if(seleccion=='M'|| seleccion=='m') {
			System.out.println("La opereracion seleccionada es la multiplicacion "+M);
		}else if(seleccion=='D'|| seleccion=='d') {
			System.out.println("La opereracion seleccionada es la division "+D);
		
		}else if(seleccion=='X'|| seleccion=='x'){
			System.out.println("Gracias ,hasta la proxima");
			
		}
		
		
		}while(seleccion!='X');
		
		
		
		
		
		
		
				
		
		
		
		
	}

}
