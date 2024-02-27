package Pruebas2;

import java.util.Scanner;

public class Ejercicio2Prueba2 {

	public static Scanner entrada = new Scanner(System.in);
	
	public static final int tam = 6;
	public static int[] combinacion = new int[tam]; 
	public static int[] combiGanadora = new int[tam];
	public static int contadorAciertos;
	public static double premio;
	
	public static void main(String[] args) {

		
		introApuesta();
		mostramosCombinacion(combinacion);
		introducirGanadora();
		mostramosCombinacion(combiGanadora);
		numAciertos();
		premios();
		
	}

	private static void premios() {
		premio = 0 ;
		System.out.println("Introduce la recaudacion del sorteo");
		premio = entrada.nextDouble();
		if(contadorAciertos > 2) {
			System.out.println();
			System.out.println("Aplicamos el 55% de lo recaudado");
			porciento55();
			System.out.println();
			System.out.println("Se queda el premio con un total de "+premio+" euros");
			if(contadorAciertos==3) {
				aplicamos5();
			}else if(contadorAciertos==4) {
				aplicamos15();
			}else if(contadorAciertos==5) {
				aplicamos25();
			}else if(contadorAciertos==6) {
				aplicamos50();
			}
		}		
	}

	private static void aplicamos50() {
		System.out.println("Con un total de aciertos es de 6 se aplica un 50%");
		premio = (premio * 50) / 100;
		System.out.println("El premio que recibira es de "+premio+" euros");
					
	}

	private static void aplicamos25() {
		System.out.println("Con un total de aciertos es de 5 se aplica un 25%");
		premio = (premio * 25) / 100;
		System.out.println("El premio que recibira es de "+premio+" euros");
				
	}

	private static void aplicamos15() {
		System.out.println("Con un total de aciertos es de 4 se aplica un 15%");
		premio = (premio * 15) / 100;
		System.out.println("El premio que recibira es de "+premio+" euros");
		
	}

	private static void aplicamos5() {
		System.out.println("Con un total de aciertos es de 3 se aplica un 5%");
		premio = (premio * 5) / 100;
		System.out.println("El premio que recibira es de "+premio+" euros");
	}

	private static double porciento55() {
		premio = (premio * 55) / 100;
		return premio;
		
		
	}

	private static void numAciertos() {
		 contadorAciertos = 0;
		
		for(int i =0 ; i < tam ; i++) {
			if(combinacion[i] == combiGanadora[i]) {
				System.out.print("numeros acertados "+combinacion[i]+" | ");
				contadorAciertos++;
			}
		}System.out.println("Numero de aciertos es de "+contadorAciertos+" numeros");		
		
	}

	private static void introducirGanadora() {
		System.out.println("Introduce combinacion Ganadora");
		System.out.println();
		for(int i = 0 ; i < tam ; i++) {
			System.out.println("Introduce el numero de la posicion "+(i+1));
			int posicion = entrada.nextInt();
			combiGanadora[i] = posicion;
		}
				
	}

	private static void mostramosCombinacion(int[] apuesta) {
		for(int numeros : apuesta) {
			System.out.print(numeros+" | ");
		}System.out.println();
	}

	private static void introApuesta() {
		System.out.println("Introduce la apuesta de la primitiva");
		System.out.println();
		for(int i = 0 ; i < tam ; i++) {
			System.out.println("Introduce el numero de la posicion "+(i+1));
			int posicion = entrada.nextInt();
			combinacion[i] = posicion;
		}
		
		
	}

}
