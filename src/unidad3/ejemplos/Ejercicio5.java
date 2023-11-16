package unidad3.ejemplos;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int numero1;
		int numero2;
		int suma ;
		int producto;

		System.out.println("Introduce el primer numero");
		numero1 = entrada.nextInt();
		System.out.println("Introduce el segundo numero");
		numero2 = entrada.nextInt();

		if(numero1 > numero2) {
			suma = numero1 + numero2;
			System.out.println("Realizamos la suma ya que el primero es mayor, resultado:  "+suma);

		}else if(numero2> numero1){
			producto = numero1 * numero2;
			System.out.println("Realizamos el producto ya que el segundo es mayor ,resultado:  "+producto);		}






	}

}
