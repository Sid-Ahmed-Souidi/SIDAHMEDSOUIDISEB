package pruebas.evaluacion1.prueba1.ejercicio3;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio3 {
	static Scanner entrada = new Scanner(System.in);
	 static  int MESES = 12;
	static int [] anyo = new int[MESES]; 
	static int mes ;
	 static int seleccion ;
	public static void main(String[] args) {
		
		do {
			System.out.println("1.Añadir precipitaciones");
			System.out.println("2.Mostrar precipitaciones de un mes");
			System.out.println("3.Mostrar precipitaciones de todo el año");
			System.out.println("4.Salir");
			seleccion = entrada.nextInt();
			if(seleccion ==1) {
				pedirDato();
				añadirDato();
				
				
			}else if(seleccion ==2) {
				obtenesMes();

				
			}else if(seleccion == 3) {
				obtenerAnyoCompleto();

			}
			else if(seleccion ==4 ) {
				System.out.println("Salir...");
				
			}
			
			

			
			
			
		}while(seleccion!=4);
		
		
		
		
	}

	

	private static void obtenesMes() {
		System.out.println("En que mes deseas obtener las medidas (mes en tipo numerico)");
		int mes = entrada.nextInt();
		mes = mes -1;
		for(int i = 0 ; i < MESES ; i++) {
			if(anyo[mes] == anyo[i]) {
				System.out.println("El numero de precipitaciones es del mes"+(mes+1)+" es de un total de "+anyo[i]);
			}
			
		}
		
	}

	private static void obtenerAnyoCompleto() {
		int contador = 0 ;
		for(int i = 0 ; i < MESES ; i++) {
			if(anyo[i] !=0) {
				contador += anyo[i];
				
			}
		}System.out.println("El total de precipitaciones del año es de "+contador);
		
	}

	private static void añadirDato() {
		mes = mes - 1;
		for(int i = 0 ;  i < MESES ; i++ ) {
			if(anyo[mes] == anyo[i]) {
				System.out.println("Introduzca la media de precipitaciones del mes "+(mes+1));
				int precipitaciones = entrada.nextInt();
				anyo[i] += precipitaciones ;
				break;
			
				
			}
			
		}System.out.println(Arrays.toString(anyo));
	}

	private static void pedirDato() {
		System.out.println("En que mes deseas introducir las precipitaciones ");
		mes = entrada.nextInt();
		
	}

}
