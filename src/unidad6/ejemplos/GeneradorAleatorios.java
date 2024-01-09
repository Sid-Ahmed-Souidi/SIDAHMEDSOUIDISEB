package unidad6.ejemplos;

import java.util.Random;

public class GeneradorAleatorios {

	public static void main(String[] args) {

		Random random = new Random();
		
		//Generar un numero enteo aleatorio
		int numAleatorio = random.nextInt();
		System.out.println(numAleatorio);
		//Generar numero entre 0  y el 99
		int numAleatorio2 = random.nextInt(100);
		System.out.println(numAleatorio2);
		
	}

}
