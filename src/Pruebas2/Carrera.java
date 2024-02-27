package Pruebas2;

import java.util.Scanner;

public class Carrera {

		
	public static Scanner entrada = new Scanner(System.in);	
	public static final int tam = 8;
	public static int[] carrera = new int[tam];
	public static int posicion ;
	public static void main(String[] args) {
		
		introducirDorsales();
		mostrarCarrera();
		menoresEdad();
		mostrarCarrera();
		dopados();
		mostrarCarrera();
		morosos();
		mostrarCarrera();

	}

	private static void morosos() {
		boolean ultimaPosicion = false;
		System.out.println("Introduzca el moroso");
		int moroso = entrada.nextInt();
		for(int i = 0 ; i < tam && !ultimaPosicion; i++) {
			if(carrera[i]==moroso){
				posicion = i;
				int vmp = carrera[i];
				desplazamos(i);
				carrera[carrera.length-1] = vmp;
				ultimaPosicion= true;
			}
		}
		if(ultimaPosicion==false) {
			System.out.println("No hay ese corredor moroso");
		}
		
	}

	private static void desplazamos(int pos) {
		for(int j = pos; j < carrera.length-1; j++) {
			carrera[j] = carrera[j+1];
		  }
		}
	
	private static void dopados() {
		boolean expulsados = false;
		System.out.println("Introduzca el dopado");
		int dopado = entrada.nextInt();
		for(int i = 0 ; i < tam && !expulsados; i++) {
			if(carrera[i]==dopado){
				carrera[i]=0;
				expulsados= true;
			}
		}
		if(expulsados==false) {
			System.out.println("No hay ese corredor dopado");
		}
		
	}
	
	private static void menoresEdad() {	
		boolean menorIntroducido = false;
		System.out.println("Introduce el menor de edad");
		int menor = entrada.nextInt();
		for(int i = 0 ; i < tam ; i++) {
			if(carrera[i]==menor) {
				if(carrera[i]==carrera[0]) {
					System.out.println("El menor ya esta en la 1 ª posicion");
					menorIntroducido  = true;
				}else {
					int vmp = carrera[i];
					carrera[i] = carrera[i-1];
					carrera[i-1] = vmp;
					menorIntroducido  = true ;
				}
			}
		}
	}

	private static void mostrarCarrera() {
		for(int corredores : carrera) {
			System.out.print(corredores+" | ");
		}System.out.println();
		
	}
	private static void introducirDorsales() {
		boolean finalizada = false;
		for(int i = 0  ; i < tam && !finalizada ;i++) {
			System.out.println("Introduce el "+(i+1)+" en llegar");
			 int corredor = entrada.nextInt();
			 if(corredor==-1) {
				 finalizada= true;
			 }else {
			 carrera[i] = corredor;
			 }
		}
	}

}
