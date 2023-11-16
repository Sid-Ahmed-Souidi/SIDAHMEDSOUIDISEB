package unidad5.ejemplos;

import java.util.Arrays;
import java.util.Scanner;

public class NuevoEnteros {
	static final int  TAM = 8;
	static int [] array = new int[TAM];
	static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {
		//EJERCICIO10
 //Escriba una aplicación que almacene nueve enteros en un array. Muestre el primer y último entero
 //y luego visualice los enteros del último al primero. Guarde el archivo como NuevoEnteros.java


		visualizarPrimerNumero(almacenarNumeros());// voy visualizando la array
		visualizarUltimoNumero(array);
		visualzarUltimoAlPrimero(array);

	}

	public static int pedirNumeros() {

		int numero = entrada.nextInt(); // aqui pedimos un numero donde lo vamos a introducir en la funcion de almacenar numeros
		return numero;


	}


	public static int []  almacenarNumeros() {
		int contador = 1;                       // inicio un contador donde ire visualizando el numero de veces que se a introducido el numero
		for(int i = 0 ; i < array.length ; i ++) { // aqui recorremos la array vacia con sus posiciones definidas que son 9
			System.out.println("Introduce el "+contador+"ª numero"); // visualizamos cuantos numeros van almacenados
			array[i] = array[i]+pedirNumeros(); // el numero que nos da la funcion pedirNumeros lo almacenamos en las distintas posiciones del array
			System.out.println(Arrays.toString(array)); // voy visualizando la array
			contador++;

		}
		return array;

	}

	public static void visualizarPrimerNumero(int []  array) {

		for(int i = 0 ; i < array.length ;) {
			System.out.println("El primer numero de la array es :" +array[i]);
			break;
		}
	}

	public static void visualizarUltimoNumero(int []  array) {

		for(int i = array.length -1 ; i > 0 ; i--) {
			System.out.println("El ultimo numero de la array es :" +array[i]);
			break;
		}
	}

	public static void visualzarUltimoAlPrimero(int [] array) {
		System.out.println("---VISUALIZACIÓN DEL ULTIMO AL PRIMER NUMERO---");
		for(int i = array.length -1 ; i >= 0 ; i--) {
			System.out.println(array[i]);


		}


	}


}
