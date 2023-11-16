package unidad2.ejemplos;

import java.util.Scanner;


public class LectorEscritor {

	public static void main(String[] args) {

		int dato;
		int dato2;
		int bancario;
		String nombre;
		Scanner entrada = new Scanner(System.in);// entrada es un objeto


		System.out.println("Introduzca su nombre: ");

		nombre = entrada.nextLine(); // nextLine permite escribir nombres compuestos con espacio
		//nombre = entrada.next(); solo sirve para una palabra

		System.out.print("Dame un número entero");

		dato = entrada.nextInt();

		System.out.println(nombre+"Ha introducido el numero:"+dato);

		System.out.println("Dame otro"+nombre+":");
		dato2 = entrada.nextInt();
		System.out.println("Y ahora:"+dato2);


		int suma = dato+dato2;

		System.out.println("La suma es:"+suma);
		System.out.println("La suma es:"+dato+dato2);//de esta forma lo que hace es concatenar y no sumar.
		System.out.println("La suma es:"+(dato+dato2));//Para hacer la suma en el print hay que ponerlo entre parentesis.

		entrada.nextLine();//el no poner indicador sirve para vaciar el buffer




		entrada.close();






	}

}
