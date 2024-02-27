package Pruebas1;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Ejercicio4Prueba1 {

	public static String seleccion ; 
	public static Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) {

	do {
		
		menu();
		temperatura();
		humedad();
		hora();
		
		System.out.println("La simulacion terminará cuando cuando pulse la tecla s o S ");
		System.out.println("Si no puede pulsar cualquier otra letra");
		seleccion = entrada.next();
		
		
		
	}while(!(seleccion.equals("S")) || !(seleccion.equals("s")) );
		
		
		
		
		
	}
	private static void menu() {
		System.out.println("------Incubadora------");
		System.out.println("Introduzca la temperatura");
		System.out.println("Introduzca la humedad");
		System.out.println("Introduzca la hora");
		System.out.println("escriba S o s para salir");		
	}
	private static void hora() {
		System.out.println("Introducir la hora");
		int hora = entrada.nextInt();
		if(hora==8) {
			System.out.println("Encender motor para girar huevo");
		}
	}
	private static void humedad() {
		System.out.println("Introduzca la humedad");
		int humedad = entrada.nextInt();
		if(humedad<75) {
			System.out.println("Llenar agua");
		}
		
	}
	private static void temperatura() {
		System.out.println("Introduzca la temperatura");
		int temperatura = entrada.nextInt();
		if(temperatura != 37) {
			if(temperatura <37) {
				System.out.println("Encender Bombilla");
			}else {
				System.out.println("Encender Ventilador");
			}
			
		}
	}
	
	

}
