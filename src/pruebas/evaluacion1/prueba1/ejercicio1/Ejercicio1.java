package pruebas.evaluacion1.prueba1.ejercicio1;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio1 {

	static int tamf = 8;
	static int tamc = 8;
	static Scanner entrada = new Scanner(System.in);
	 static int [] fila = new int[tamf];
	 static int [] cola = new int[tamc];
	
	public static void main(String[] args) {
		int seleccion ;
		do {
			System.out.println("1.añadir fila");
			System.out.println("2.Mostrar el contenido de las fila o la cola");
			seleccion = entrada.nextInt();
			
			switch(seleccion) {
			case 1: 
			añadirFila();
				break;
			case 2:
			mostrarFilayCola();
			break;
			
			}
			
			
			
		}while(seleccion != 5);
		
	
		
	}
	
	private static void mostrarFilayCola() {
		int seleccion ;
		System.out.println("Que contenido quieres mostrar (1-fila)  o (2-cola)");
		seleccion = entrada.nextInt();
		if(seleccion == 1) {
		System.out.println(Arrays.toString(fila));		
		}
		else if(seleccion== 2) {
			System.out.println(Arrays.toString(cola));		

			
		}else {
			System.out.println("seleccione alguna opcion entre el 1 o el 2");
		}
		
	}

	static void añadirFila() {
		System.out.println("Introuzca el elemento que quiere introducir en el Fila");
		for(int i = 0 ; i < tamf ; i++) {
			int elemento = entrada.nextInt();
			if(fila[i] == 0) {
				fila[i] = elemento;
				
				break;
				
			}if(fila[i] !=0) {
				break;
				
				
			   
			  
	
			
		}
		
	}

	}
	}
