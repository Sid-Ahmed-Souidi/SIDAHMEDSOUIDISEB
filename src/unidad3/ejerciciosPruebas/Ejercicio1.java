package unidad3.ejerciciosPruebas;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		int numeroPositivo ;
		int contador = 0 ;
		/**27) Crear una aplicación que nos permite insertar números hasta que insertemos un -1.
		Calcular el numero de números introducidos. *//


		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduzca el numero");
		numeroPositivo = entrada.nextInt();
		while(numeroPositivo >=0) {
			contador += numeroPositivo;
			System.out.println("Introduzca el numero");
			numeroPositivo = entrada.nextInt();
			//contador += numeroPositivo;
			
			
			
		}
		System.out.println("Total de la suma de los numeros positivos"+contador);
		
		
	}

}
