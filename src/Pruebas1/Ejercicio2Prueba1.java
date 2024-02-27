package Pruebas1;

import java.util.Scanner;

public class Ejercicio2Prueba1 {

	
	public static Scanner entrada = new Scanner(System.in);
	static final int columnas = 3;
	static final int filas = 3;
	public static int x ;
	public static int y ;
	public static boolean[][] mapa ;
	
	public static void main(String[] args) {
		
		 mapa = new boolean[][]{
				 {true,false,true},
				 {false,true,false},
				 {true,true,true}
		 };
		 
		indicarLugares();
		 recorrerMapa();
	  	 
	}

	private static void recorrerMapa() {
		boolean respuesta = false;
		System.out.println("Lugar x "+x);
		System.out.println("Lugar y "+y);
		for(int i = 0 ; i < filas ; i++) {
			for(int j = 0 ; j< columnas && !respuesta; j++) {
			    if(mapa[i][j] == mapa[x][y]) {
			    	if(mapa[i][j] == false) {                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   		 
			    		System.out.println("Desde x "+x+" hasta "+y+" es falso ,  no se puede ir");
			    		respuesta = true;
			    	}else {
			    		System.out.println("Desde x "+x+" hasta "+y+" es verdadero , se puede ir ");
			    		respuesta = true;
			    	}
			    }
			}
		}
	}

	private static void indicarLugares() {
		System.out.println("Indica el lugar x");
		x = entrada.nextInt();
		System.out.println("Indica el lugar y");
		y = entrada.nextInt();
		
	}
	
	
	
	
		
	
	




}


