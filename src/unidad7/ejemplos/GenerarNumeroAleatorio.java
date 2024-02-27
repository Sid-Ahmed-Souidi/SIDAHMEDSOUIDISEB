package unidad7.ejemplos;

import java.util.Random;

public class GenerarNumeroAleatorio {

	public static void main(String[] args) {
		
		Random random = new Random();
		
		double numero = Math.floor(Math.random()*400 + 1);
		
		System.out.println(numero);
		
		

		
	}

}
