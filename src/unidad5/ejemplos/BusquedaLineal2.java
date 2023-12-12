package unidad5.ejemplos;

import java.util.Scanner;

public class BusquedaLineal2 {

	static final int  TAM = 7;
	static int [] matriz = new int[TAM];
	static Scanner entrada = new Scanner(System.in);
	static int elemento ;
	public static void main(String[] args) {
	 matriz = new int[]{3,4,56,7,89,3,2};
	 
	 System.out.println("Introduzca el elemento que quiera saber su posicion");
	 elemento = entrada.nextInt();
		int posicion ;
		posicion = buscarPosicion();
		
		if(posicion >  -1) {
			System.out.println("La posicion del elemento es la"+(posicion +1));
		}else {
			System.out.println("El elemento introducido no esta el la matriz");
		}
	}
	private static int  buscarPosicion(){
		boolean noEncontrado = true ; 
		int posicion = -1 ;
		for(int i = 0 ; i < TAM && noEncontrado; i++) {
			if(matriz[i] == elemento) {
				posicion = i; 
				noEncontrado = false;
				
			}
			
			
		}return posicion ; 
		
		
	}

}
