package unidad5.ejemplos;

import java.util.Scanner;

public class MetodosArray {
	static int  [] matriz = {1,2,3,4,5,6,7,8};
	static Scanner entrada = new Scanner(System.in);
	static int argumento ; 
	static int promedio ;
	public static void main(String[] args) {
		int opcion ;
		
		do {
			System.out.println("SELECCIONA LA OPERACIÓN QUE DESEA REALIZAR");
			System.out.println("------------------------------------------");
			System.out.println("1.Mostrar todos los valores enteros.");
			System.out.println("2.Mostrar todos los enteros en orden inverso.");
			System.out.println("3.Mostrar la suma de los enteros.");
			System.out.println("4.Mostrar todos los valores menores que un argumento limitante.");
			System.out.println("5.Mostrar todos los valores que son más altos que el valor promedio calculado.");
			System.out.println("6.Salir del programa.");
			opcion = entrada.nextInt();
			
			switch(opcion) {
			
			case 1:
				mostrarNumeros();
				break;
				
			case 2: 
				mostrarOrdenInverso();
				break;
				
			case 3:
				mostrarSumaNumeros();
				break;
			case 4: 
				pedirArgumento();
				mostrarValoresMenores();
				break;
			case 5 :
				calcularPromedio();
				mostrarAltoPromedio();
				break;
			
			case 6 :
				System.out.println("Saliendo del programa...");
				
				
							
			}
			
			
			
		}while(opcion!=6);
		
		
	}
	
	private static int  calcularPromedio() {
		int sumatorio = 0 ;
		for(int i = 0 ; i < matriz.length ; i ++) {
			sumatorio += matriz[i];
		}promedio = sumatorio / matriz.length;
		
		return promedio; 
	}

	private static void mostrarAltoPromedio() {
		System.out.println("Con el promedio calculado de la array es de :"+promedio);
		System.out.println("-----------------------------------------------");
		for(int i = 0 ; i < matriz.length ; i++) {
			if(matriz[i]> promedio) {
				System.out.println("El valor "+matriz[i]+" es mas alto que el promedio de "+promedio);
			}
			
		}
		
	}
	
	public static int pedirArgumento() {
		System.out.println("Indica el argumento limitante");
		argumento = entrada.nextInt();
		return argumento;
		
	}
	private static void mostrarValoresMenores() {
		for(int i = 0 ; i < matriz.length ; i ++) {
			if(matriz[i] < argumento) {
				System.out.println("El valor "+matriz[i]+"  es menor al argumento  "+argumento);
			}
			
		}
		
	}
	
	
	private static void mostrarSumaNumeros() {
		int contador = 0;
		for(int i = 0 ; i< matriz.length;i++) {
			contador += matriz[i];
			
		}System.out.println("La suma total de los enteros es de: "+contador);
	}
	private static void mostrarOrdenInverso() {
		for(int i = matriz.length -1 ; i >= 0 ; i--) {
			System.out.println(matriz[i]);
			
			
		}
		
	}
	private static void mostrarNumeros() {
		for(int i = 0; i< matriz.length ; i ++) {
			System.out.println(matriz[i]);
			
		}
		
	}

}
