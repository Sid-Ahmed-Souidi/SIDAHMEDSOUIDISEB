package pruebas.evaluacion1.prueba2.ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

	static Scanner entrada = new Scanner(System.in);
	static final int  TAM = 6;
	static int [] apuesta = new int[TAM];
	static int [] combinacionGanadora = new int[TAM];
	static int numero ;
	static int combinacion;
	static int  premioTotal = 1000;
	static int porcentaje ;
	static int aciertos = 0;
	public static void main(String[] args) {
			System.out.println("Introducir Apuesta");
			introducirApuesta();
			//combinacion ganadora
			System.out.println("Introducir combinacion ganadora");
			introducirCombinacion();
			System.out.println("Con el total del premio que son"+premioTotal);
			porcentaje = (premioTotal * 55) / 100;
			System.out.println("Se realiza el 55% de "+premioTotal+" y es un total de"+porcentaje);
			numeroAciertos();
			numeroAcertados();
			premios();

			
			
		
	}
	private static void premios() {
	 int premioRecibido = 0 ;
		if(aciertos ==3) {
		 premioRecibido = (porcentaje * 5) / 100;
		 System.out.println("Premio Recibido con 3 aciertos es de "+premioRecibido);
	 }else if(aciertos ==4) {
		 premioRecibido = (porcentaje * 15) / 100;
		 System.out.println("Premio Recibido con 4 aciertos es de"+premioRecibido);

	 }else if(aciertos ==5) {
		 premioRecibido = (porcentaje * 25) / 100;
		 System.out.println("Premio Recibido con 5 aciertos es de "+premioRecibido);
	 }
	 else if(aciertos ==6) {
		 premioRecibido = (porcentaje * 50) / 100;
		 System.out.println("Premio Recibido con 6 aciertos es de "+premioRecibido);

	 }else {
		 System.out.println("No acertado lo suficiente");
	 }
		
	}
	private static void numeroAcertados() {
		
		for(int i = 0 ; i < TAM ; i++) {
			for(int j = 0 ; j < TAM ; j++) {
			if(apuesta[i] == combinacionGanadora[j]) {
				aciertos +=1;
			}
			}
		}System.out.println("Este es el total de aciertos"+aciertos);		
	}
	private static void numeroAciertos() {
		for(int i = 0 ; i < TAM ; i++) {
			for(int j = 0 ; j < TAM ; j++) {
			if(apuesta[i] == combinacionGanadora[j]) {
				System.out.println("Estos son los numeros acertados"+apuesta[i]);
			}
			}
		}
		
	}
	private static void introducirCombinacion() {
		for(int i = 0 ; i < TAM ; i++) {
			System.out.println("Introduce la "+(i+1)+ "ª combinacion ganadora");
			combinacion = entrada.nextInt();
			combinacionGanadora[i] = combinacion;
		}
		for(int numeros : combinacionGanadora) {
			System.out.println(numeros);
		}
	}
	
	
	private static void introducirApuesta() {
		for(int i = 0 ; i < TAM ; i++) {
			System.out.println("Introduce la "+(i+1)+ "ª combinacion");
			numero = entrada.nextInt();
			apuesta[i] = numero;
		}
		for(int numeros : apuesta) {
			System.out.println(numeros);
		}
		
	}

}
