package pruebas.evaluacion1.recup1;

import java.util.Scanner;

public class Ejercicio2 {

	
	public static final int filas = 2;
	public static final int columnas = 5;

	public static Scanner entrada = new Scanner(System.in);

	public static int[][] deposito1 = new int[filas][columnas];
	public static int[][] deposito2 = new int[filas][columnas];
	public static int[][] deposito3 = new int[filas][columnas];
	
	
	public static void main(String[] args) {
		int contador =0;
		while(contador<=3)  {
			System.out.println("-----RECOGER DEPOSITO 1----");
			recogerDatos(deposito1);
			System.out.println("-----DEPOSITO 1----");
			mostrarDatos(deposito1);
			System.out.println("--RESULTADOS DEL DEPOSITO 1---");
			mostrarMedia(deposito1);
			System.out.println("######################################");
			System.out.println("-----RECOGER DEPOSITO 2----");
			recogerDatos(deposito2);
			System.out.println("-----DEPOSITO 2----");
			mostrarDatos(deposito2);
			System.out.println("--RESULTADOS DEL DEPOSITO 2---");
			mostrarMedia(deposito2);
			System.out.println("######################################");
			System.out.println("-----RECOGER DEPOSITO 3----");
			recogerDatos(deposito3);
			System.out.println("-----DEPOSITO 3----");
			mostrarDatos(deposito3);
			System.out.println("--RESULTADOS DEL DEPOSITO 3---");
			mostrarMedia(deposito3);
			contador++;
		}
		
	}


	private static void mostrarMedia(int[][] array) {
		int temperatura_Depo1 = 0;
		int humedad_Depo1 = 0;
		for(int i = 0 ; i < columnas ; i ++) {
		  temperatura_Depo1 += array[0][i];			
		}
		 int mediaTem = temperatura_Depo1 / 5 ;
		 System.out.println("La media de la temperatura del deposito  es de" +mediaTem);
		for(int i = 0 ; i < columnas ; i ++) {
			humedad_Depo1 += array[1][i];
		}
		int mediaHum = humedad_Depo1  / 5 ;
		System.out.println("La media de la humedad del deposito  es de "+mediaHum);
		System.out.println();
		int mediaTotalDeposito = (temperatura_Depo1 + humedad_Depo1) / 10;
		System.out.println("Media total del deposito  es de "+mediaTotalDeposito);
		
	}


	private static void mostrarDatos(int[][] array) {
			for(int i = 0 ; i < filas ; i++) {
				for(int j = 0 ; j < columnas ; j++ ) {
					System.out.print(array[i][j]+" ");
				}
				System.out.println();
			}
	}


	private static void recogerDatos(int [][] array) {
		System.out.println("Recoger datos de temperatura del deposito");
		for(int i = 0 ; i < columnas ; i++) {
		System.out.println("Introduce dato numero "+(i+1)+" de temperatura");
		int dato = entrada.nextInt();
		array[0][i] = dato ;
			
		}
		for(int i = 0 ; i < columnas ; i++) {
			System.out.println("Introduce dato numero "+(i+1)+" de humedad");
			int dato = entrada.nextInt();
			array[1][i] = dato ;
				
			}
		
		
	}

}
