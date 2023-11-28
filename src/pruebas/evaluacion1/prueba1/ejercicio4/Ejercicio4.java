package pruebas.evaluacion1.prueba1.ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

	static Scanner entrada = new Scanner(System.in);
	static String seleccion ;
	static int temperatura;
	static int humedad;
	static int hora ;
	public static void main(String[] args) {
		
		
	do {

		System.out.println("Realizar funcionamiento de incubadora");
		introducirDatos();
		temperatura();
		humedad();
		hora();
		System.out.println("S. Salir");
		seleccion= entrada.next();
	
		
	}while(!seleccion.equals("S") && !seleccion.equals("s"));
		
	}
	
	
	
	
	
	private static void hora() {
		if(hora == 8) {
			System.out.println("Encender motor para girar huevo");
			
		}
	}
	private static void humedad() {
		if(humedad < 75) {
			System.out.println("Llenar agua");
		}
		
	}
	private static void temperatura() {
		if(temperatura != 37) {
			if(temperatura < 37) {
				System.out.println("Encender bombilla");
			}else {
				System.out.println("Encender ventilador");
			}
			
		}else {
			System.out.println("La temperatura es 37ª");
		}
		
	}

	
	private static void introducirDatos() {
			System.out.println("Introduce la temperatura");
			temperatura = entrada.nextInt();
			System.out.println("Introduce la humedad");
			humedad = entrada.nextInt();
			System.out.println("Introduce la hora");
			hora = entrada.nextInt();
	}
	
	

}
