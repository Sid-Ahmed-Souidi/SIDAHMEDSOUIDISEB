package unidad5.ejemplos;

import java.util.Arrays;
import java.util.Scanner;

public class ControlMaceracion {

	static Scanner entrada= new Scanner(System.in);
	static final int TAM= 5;
	static double [] tempranillo = new double[TAM];
	static double [] tempranillo2 = new double[TAM];
	static double [] garnacha = new double[TAM]; 
	static double [] garnacha2 = new double[TAM]; ;
	static double [] verdejo = new double[TAM];;
	static double [] verdejo2 = new double[TAM];;
	static int tipoVino;
	static int seleccion ;
	static double litros; 
	public static void main(String[] args) {
		int seleccion ;
		
		do {
			imprimirMenu();
			seleccion = entrada.nextInt();
			
			
			
			switch(seleccion) {
			
			case 1:
				almacenarVino();	
				break;
			case 2:
				consultarVino();
				break;
			case 3 :
				mediaVino();
			}
		}while(seleccion!=6);
		
	}

	private static void mediaVino() {
		int contador = 0;
		
		for(int i = 0 ; i < TAM ; i++) {
			contador += tempranillo[i];
			contador += tempranillo[i];
			
			
			
		}System.out.println(contador);
	
		
		
	}

	private static void consultarVino() {
		System.out.println("Que vino quieres mostrar su total de litros");
		System.out.println("-------------------------------------------");
		System.out.println("1.tempranillo");
		System.out.println("2.garnacha");
		System.out.println("3.verdejo");
		int seleccion = entrada.nextInt();
		if(seleccion == 1) {
			for(int i = 0 ; i < tempranillo.length; i++) {
				System.out.println(tempranillo[i]);
			}
		}else if(seleccion == 2) {
			for(int i = 0 ; i < garnacha.length; i++) {
				System.out.println(garnacha[i]);
			}
		}else if(seleccion == 3) {
			for(int i = 0 ; i < verdejo.length; i++) {
				System.out.println(garnacha[i]);
			}
		}
	}

	private static void almacenarVino() {
		System.out.println("Introduzca el numero segun el vino que desea seleccionar");
		System.out.println("---------------------------------------------------------");
		System.out.println("1.tempranillo");
		System.out.println("2.garnacha");
		System.out.println("3.verdejo");
		seleccion = entrada.nextInt();
		if(seleccion ==1) {
			System.out.println("Introduzca los litros que desea almacenar");
			litros = entrada.nextDouble();
			for(int i = 0 ; i < TAM ; i++) {
				if(tempranillo[i] ==0) {
					tempranillo[i] += litros;
					if(tempranillo[i] > 1000) {
						tempranillo2[i] = tempranillo[i] - 1000 ;
					}
					break;
				}else {
					System.out.println("No hay espacio");	
				}
			}	System.out.println(Arrays.toString(tempranillo));
			
		}else if(seleccion ==2) {
			System.out.println("Introduzca los litros que desea almacenar de tipo garnacha");
			litros = entrada.nextDouble();
			for(int i = 0 ; i < TAM ; i++) {
				if(garnacha[i] ==0) {
					garnacha[i] = litros;
					break;
				}else {
					System.out.println("No hay espacio");	
				}	
			}System.out.println(Arrays.toString(garnacha));
		}else if(seleccion ==3) {
			System.out.println("Introduzca los litros que desea almacenar de tipo verdejo");
			litros = entrada.nextDouble();
			for(int i = 0 ; i < TAM ; i++) {
				if(verdejo[i] ==0) {
					verdejo[i] = litros;
					break;
				}else {
					System.out.println("No hay espacio");	
				}	
			}System.out.println(Arrays.toString(verdejo));
			
			
		}
	}


	

	private static void imprimirMenu() {
		System.out.println("-----------Menu----------");
		System.out.println("1.Almacenar litro de vino..");
		System.out.println("2.Mostrar cuantos litros.");
		System.out.println("3.Mostrar el deposito con mas vinos.");
		System.out.println("4. Mostrar media de litros almacenados.");
		System.out.println("5.Mostrar el numero de arrobas");
		System.out.println("6.Salir");


		
	}

}
