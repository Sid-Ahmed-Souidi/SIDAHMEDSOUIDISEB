package unidad5.ejemplos;
import java.util.Scanner;

public class UltimaPosicion {

	public static void main(String[] args) {
	
		 Scanner scanner = new Scanner(System.in);

	        // Tamaño del array
	        int tamano = 4;
	        int[] miArray = new int[tamano];

	        // Variable para almacenar el elemento introducido por el usuario
	        int elemento;

	        // Bucle para añadir elementos hasta que se alcance el límite
	        for (int i = 0; i < tamano; i++) {
	            // Mostrar el estado actual del array
	            System.out.print("Estado actual del array: ");
	            mostrarArray(miArray);

	            // Pedir al usuario que introduzca un elemento
	            System.out.print("Introduce un número: ");
	            elemento = scanner.nextInt();

	            // Añadir el elemento a la última posición del array
	            añadirElemento(miArray, elemento);
	        }

	        System.out.println("Programa finalizado.");
	    }

	    // Método para añadir un elemento a la última posición del array
	    private static void añadirElemento(int[] array, int elemento) {
	        // Desplazar todos los elementos una posición a la derecha
	        for (int i = array.length - 1; i > 0; i--) {
	            array[i] = array[i - 1];
	        }

	        // Colocar el nuevo elemento en la primera posición
	        array[0] = elemento;
	    }

	    // Método para mostrar el contenido del array
	    private static void mostrarArray(int[] array) {
	        for (int elemento : array) {
	            System.out.print(elemento + " ");
	        }
	        System.out.println();
		    }
		
	}


