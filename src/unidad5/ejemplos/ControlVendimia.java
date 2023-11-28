package unidad5.ejemplos;

import java.util.Arrays;
import java.util.Scanner;


public class ControlVendimia {
	
	static Scanner entrada = new Scanner(System.in);
	static int NUMZONAS = 5;
	static int CANTIDADES = 4;
	static int [][] zonas = new int[NUMZONAS][CANTIDADES];
	static int opcion ;
	static int cantidad ;
	static int contadorporZona = 0;

	public static void main(String[] args) {
		
		do{
			
			imprimirMenu();
			opcion = entrada.nextInt();

			
			switch(opcion) {
		
			case 1:
				añadirCantidadZona();
				for(int i = 0 ; i < NUMZONAS ; i++) {
					System.out.println(Arrays.toString(zonas[i]));
				}

				break;
			case 2 :
				ObtenerPesoTotal();
				
				break;
			case 3 :
				cantidadPorZona();
			
			case 4 :
				pesoMedio();
				
			}
			
			
			
		}while(opcion!=5);
		
		


	}

	

	private static void pesoMedio() {
		System.out.println("Que fona deseas sacar la media de peso");
		int zona = entrada.nextInt();
		zona = zona -1;
		 int contador = 0;
		 int columna =0;
		 int pesoMedio =0;
		for(int i = 0 ; i < NUMZONAS ; i ++) {
			if(zonas[zona]  == zonas[i]) {
		
			while(columna < CANTIDADES && zonas[i][columna] != 0) {
				contador += zonas[i][columna];
				columna++;
		}// columna es el numero que vamos a utilizar para realizar la media
		
		
		}
			pesoMedio = contador / columna ;
		}System.out.println("El peso medio de la columna"+(zona+1)+" es de"+pesoMedio);		
		
	}



	private static void cantidadPorZona() {
		int zona ;
		System.out.println("Selecciona la zona que deseas mostrar su cantidad");
		zona = entrada.nextInt();
		zona = zona -1;
		for(int i = 0 ; i < NUMZONAS ; i ++) {
			if(zonas[zona] == zonas[i]) {
				int columna = 0;
				while(columna < CANTIDADES && zonas[i][columna] != 0) {
					contadorporZona += zonas[i][columna];
					columna++;
				}
			}
		}			
		System.out.println("El total de la zona seleccionada "+(zona+1)+"tiene un total de :"+contadorporZona+" Kilogramos");

		
	}



	private static void ObtenerPesoTotal() {
	int contador = 0;
	for(int i = 0 ; i < NUMZONAS ; i ++) {
		int columna = 0;
		while(columna < CANTIDADES && zonas[i][columna] != 0) {
			contador += zonas[i][columna];
			columna++;
		}
		
		
		
	}
		System.out.println("Esta este es el peso total recolectado en todas las zonas :"+contador);
		
		
	}



	private  static void  añadirCantidadZona() {
		System.out.println("Que zona deseas agregar la cantidad");
		int zona = entrada.nextInt();
		zona = zona -1;
		for(int i = 0 ; i < NUMZONAS ; i++) {
			if(zonas[zona]  == zonas[i]) {
				System.out.println("Introduzca la cantidad");
				cantidad = entrada.nextInt();
				int columna = 0;
				while(columna < CANTIDADES && zonas[i][columna] != 0) { // El bucle avanza la posición de la columna hasta que se encuentre una columna con valor cero o
					columna++;										//hasta que se alcance el límite de columnas (CANTIDADES)
				}
				if(columna < CANTIDADES) {
					zonas[i][columna] = cantidad;
				}else {
					System.out.println("No se puede añadir mas datos a la zona");
					
				}
				
				
					
				}
			}
			

		}
		
		
		
	



	private static void imprimirMenu() {
		System.out.println("1.Añadir cantidad a una zona");
		System.out.println("2.Obtener peso total");
		System.out.println("3.Cantidad por zona");
		System.out.println("4.Media de peso");
		System.out.println("5.Salir");
	}


}
