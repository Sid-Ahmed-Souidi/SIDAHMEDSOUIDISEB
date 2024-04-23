package unidad7.ejemplos;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class GenerarNumeroAleatorio {

	public static void main(String[] args) {
		
		Random random = new Random();
		double numero = Math.floor(Math.random()*400 + 1);
		System.out.println(numero);
		
		
	        double numeroAleatorio = random.nextDouble();
	        System.out.println("Número aleatorio entre 0 y 1: " + numeroAleatorio);
		
	        
	        int min = 1;
	        int max = 100;
	        int numeroAleatorio1 = random.nextInt(max - min + 1) + min;
	        System.out.println("Número aleatorio entre " + min + " y " + max + ": " + numeroAleatorio1);

	        
	        boolean valorAleatorio = random.nextBoolean();
	        System.out.println("Valor aleatorio booleano: " + valorAleatorio);
	        
	        
	        
	        Integer[] arreglo = {1, 2, 3, 4, 5};
	        List<Integer> lista = Arrays.asList(arreglo);
	        Collections.shuffle(lista, random);
	        
	        System.out.println("Arreglo barajado: " + lista);
	}

}
