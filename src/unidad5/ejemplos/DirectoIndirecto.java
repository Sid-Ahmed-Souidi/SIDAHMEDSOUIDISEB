package unidad5.ejemplos;

import java.util.Scanner;

public class DirectoIndirecto {

	static 	Scanner entrada = new Scanner(System.in);
	static final int  NUM_PUNTOS = 4; 
	static boolean[][] mapa = {
				{true,true,false,false},
				{true ,true,true,false},
				{false , true , true,false},
				{false ,false , false , true}
	};
	
	public static void main(String[] args) {
		int origen;
		int destino;
		boolean hayRuta;
		System.out.println("Introduzca el origen");
		origen = entrada.nextInt();
		System.out.println("Introduzca el destino");
		destino = entrada.nextInt();
		
		hayRuta = comprobarRuta(origen ,destino);
		if(hayRuta) {
			System.out.println("Estan unidos");
		}else {
			System.out.println("No estan unidos");
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

	private static boolean comprobarRuta(int origen, int destino) {
		
		boolean visitados [] = new boolean[NUM_PUNTOS];
		boolean encontrado;
		encontrado = buscar(origen,destino,visitados);
		
		
		return encontrado;
	}

	private static boolean buscar(int origen, int destino, boolean[] visitados) {
		boolean encontrado = false;
		if(origen==destino) {
			encontrado = true;
		}else {
			visitados[origen]=true;
		}
		for(int i = 0; i < NUM_PUNTOS;i++) {
			if(mapa[origen][i] && !visitados[i]) {
				if(buscar(i,destino,visitados)) {
					encontrado=true;
				}
			}
		}
		return encontrado;
	}

}
