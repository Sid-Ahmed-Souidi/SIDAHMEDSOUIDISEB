package unidad5.ejemplos;

import java.util.Scanner;

public class Prueba2Ejercicio1 {

		
	public static int NUM_CORREDORES = 10;
	public static int carreras [] =  new int[NUM_CORREDORES];

	public static Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) {
		
		introducirDorsales();
		corredoresMenores();
		corredoresDopados();
		corredoresMorrosos();
		 

	}

	private static void corredoresMorrosos() {
		System.out.println("Introduzca el jugador dopado");
		int moroso = entrada.nextInt();
		boolean corredorEncontrado = false;
		for(int i = 0 ; i < NUM_CORREDORES && !corredorEncontrado; i++) {
			if(carreras[i] == moroso) {
				int vmp = carreras[0];
				carreras[0] = carreras[i];
				
				System.out.println("Corredor eliminado");
				corredorEncontrado = true;
			}
		}for(int dorsales : carreras) {
			System.out.println(dorsales);
		}		
	}

	private static void corredoresDopados() {
		System.out.println("Introduzca el jugador dopado");
		int dopado = entrada.nextInt();
		boolean corredorEncontrado = false;
		for(int i = 0 ; i < NUM_CORREDORES && !corredorEncontrado; i++) {
			if(carreras[i] == dopado) {
				carreras[i] = 0 ;
				System.out.println("Corredor eliminado");
				corredorEncontrado = true;
			}
		}for(int dorsales : carreras) {
			System.out.println(dorsales);
		}
	}
	private static void corredoresMenores() {
		boolean menorAdelantado = false ;
		System.out.println("Introduce el corredor menor");
		int menor = entrada.nextInt();
		for(int i = 0 ; i < NUM_CORREDORES && !menorAdelantado ; i ++) {
			if(carreras[i] == menor) {
				if(i == 9) {
					System.out.println("Es el primero no se puede adelantar");
					menorAdelantado = true ;
				}else  {
					int vmp = carreras[i+1];
					carreras[i+1] = carreras[i];
					carreras[i] = vmp;
					menorAdelantado = true;
				}
			}
		}for(int dorsales : carreras) {
			System.out.println(dorsales);
		}
	}
	private static void introducirDorsales() {
		boolean	carreraFinalizada = false; 
		for(int i = 0 ; i < NUM_CORREDORES && !carreraFinalizada ; i++) {
			System.out.println("introduce el "+(i+1)+"º corredor");
			int dorsal = entrada.nextInt();
			if(dorsal == -1) {
				System.out.println("Carrera finalizada");
				carreraFinalizada = true;
			}else {
			carreras[i] = dorsal;
			}
		}for(int dorsales : carreras) {
			System.out.println(dorsales);
		}
	}
}
