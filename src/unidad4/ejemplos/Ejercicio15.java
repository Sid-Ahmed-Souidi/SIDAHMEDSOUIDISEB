package unidad4.ejemplos;

import java.util.Scanner;

public class Ejercicio15 {
	static double precio ;
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Calculo de IVA del primer precio");
		pedirNumero();
		System.out.println(precioConIVA(precio));
		System.out.println("Calculo de IVA del segundo precio");
		pedirNumero();
		System.out.println(precioConIVA(precio));
		System.out.println("Calculo de IVA del tercer precio");
		pedirNumero();
		System.out.println(precioConIVA(precio));
		System.out.println("Calculo de IVA del cuarto precio");
		pedirNumero();
		System.out.println(precioConIVA(precio));
		System.out.println("Calculo de IVA del quinto precio");
		pedirNumero();
		System.out.println(precioConIVA(precio));
	}

	//FUNCIONES
	// funcion para pedir numero :
	public static double pedirNumero() {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce el  precio");
		precio = entrada.nextDouble();
		return precio;
	}
	//funcion para calcular el IVA :
	public static double precioConIVA( double precio) {
	double IVA ;
	double precioConIVA ;
		IVA = (precio * 21) / 100 ;
		precioConIVA = precio + IVA ;
		return precioConIVA ;
	}



}
