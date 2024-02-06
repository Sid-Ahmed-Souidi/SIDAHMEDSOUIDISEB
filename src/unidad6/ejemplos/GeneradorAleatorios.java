package unidad6.ejemplos;

import java.util.Random;

public class GeneradorAleatorios {

	public static void main(String[] args) {

		Random random = new Random();
		
		//Generar un numero enteo aleatorio
		int numAleatorio = random.nextInt();
		System.out.println(numAleatorio);
		//Generar numero entre 0  y el 99
		System.out.println("tabonj");
		int numAleatorio2 = random.nextInt(12+1);
		System.out.println(numAleatorio2);
		
        long numeroAleatorio = Math.abs(random.nextLong() % 10000000000000000L);
        System.out.println(numeroAleatorio);
        
        
        //valor entre 24 al 35 ambos incluidos
		 int valorEntero = (int) (Math.floor(Math.random()*(35-24+1)+24)); 
		 System.out.println(valorEntero);

		
	}

}
