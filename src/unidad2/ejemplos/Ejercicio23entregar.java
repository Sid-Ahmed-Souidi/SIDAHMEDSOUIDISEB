package unidad2.ejemplos;

import java.util.Scanner;

public class Ejercicio23entregar {

	public static void main(String[] args) {
	/**	Nos piden realizar un programa que a partir del peso expresado 
		en gramos nos muestre su equivalencia en kilogramos,
		libras y onzas. Hay que tener en cuenta que:

			1 libra (lb) = 16 onzas (oz) = 0,454 kilogramos (kg)

			1 kilogramo = 2,2 libras

			1 oz = 28,35 gramos (g)

			1 gramo = 0,035 oz*/
		
		double gramosAlibras ;
		double gramos;
		double gramosAonzas;
		double gramosAkilogramos;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduze los gramos que quieras pasar a libras ");
		gramos = entrada.nextDouble();
		
		gramosAlibras = gramos / 454 ; 
		System.out.println("Este es el resultado de pasar  gramos a libras"+gramosAlibras);
		
		
		gramosAkilogramos = gramos / 1000 ; 
		System.out.println("Este es el resultado de pasar gramos a kilogramos"+gramosAkilogramos);
		
		
		gramosAonzas = gramos / 28.5 ; 
		System.out.println("Este es el resultado de pasar gramos a onzas"+gramosAonzas);
		
		
	}

}
