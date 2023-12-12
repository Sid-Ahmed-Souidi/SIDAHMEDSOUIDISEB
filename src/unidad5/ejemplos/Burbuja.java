package unidad5.ejemplos;

import java.util.Scanner;

public class Burbuja {

	static Scanner entrada = new Scanner(System.in);
	static int arreglo[];
	static int numeroABuscar;
	
	public static void main(String[] args) {
		
		int resultado;
		
		pedirNumerosArray();
		pedirNumeroABuscar();
		System.out.println("Arreglo original");
		mostrarArreglo(arreglo);
		ordenarPorBurbuja(arreglo);
		System.out.println("\nArreglo ordenado");
		mostrarArreglo(arreglo);
		resultado = buscarBinario(arreglo, numeroABuscar);
		
		if(resultado!=-1) {
			System.out.println("\nElemento encontrado en la posición:"+resultado);
		}else {
			System.out.println("\nElemento no encontrado");
		}
	}
	
	

	private static void pedirNumeroABuscar() {
		System.out.println("Introduzca el número a buscar");
		numeroABuscar = entrada.nextInt();
	}



	private static void pedirNumerosArray() {
		
		System.out.println("Introduzca el número de elementos (máxmo 10)");
		int numElementos = entrada.nextInt();
		int numero;
	
		if(numElementos>10) {
			System.out.println("No puede ser más de 10 elementos");
		}else {
			arreglo = new int[numElementos]; //se establece el tamaño de la array
			for(int i=0;i<numElementos;i++) {
				System.out.println("Introduzca un número:");
				numero=entrada.nextInt();
				arreglo[i]=numero;
			}
		
		}

	}



	private static void ordenarPorBurbuja(int[] arreglo) {
		
		int tam = arreglo.length;
		int tmp;
		for(int i=0;i<tam-1;i++) {
			for(int j=0;j<tam-i-1;j++) {
				if(arreglo[j]>arreglo[j+1]) {
					tmp = arreglo[j];
					arreglo[j]=arreglo[j+1];
					arreglo[j+1]=tmp;
					
				}
			}
		}
		
	}
	
	private static int buscarBinario(int[] arr, int elementoBuscado) {
		
		int posicion=-1;
		int izquierda=0;
		int derecha=arr.length-1;
		int medio=-1;
		boolean noEncontrado=true;
		
		while(izquierda<=derecha && noEncontrado) {
			medio= izquierda+(derecha-izquierda)/2;
			
			if(arr[medio]==elementoBuscado) {
				noEncontrado=false;
				posicion=medio;
			}
			
			if(arr[medio]<elementoBuscado) {
				izquierda=medio+1;
			}else {
				derecha=medio-1;
			}
		}
		
		return posicion;
	}

	private static void mostrarArreglo(int[] arreglo) {
		
		for(int elemento:arreglo) {
			System.out.print(elemento+"|");
		}
		
	}

}