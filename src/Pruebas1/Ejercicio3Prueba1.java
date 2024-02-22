package Pruebas1;

import java.util.Scanner;

public class Ejercicio3Prueba1 {
	
	public static final int enero = 31,febrero = 28,marzo= 31, abril=30 , mayo=31, junio=30, julio=31, agosto=31,
			septiembre= 30, octubre =31, noviembre=30,diciembre=31;
	
	public static final int totalDias = 365 ; 
	public static Scanner entrada = new Scanner(System.in);
	public static final int meses = 12;
	public static int[] anyo = new int[meses];
	public static int seleccion ;
	public static void main(String[] args) {
		
	do {
		System.out.println("1.Añadir precipitacion por mes");
		System.out.println("2.Media de precipitaciones por mes");
		seleccion = entrada.nextInt();
		
		switch(seleccion){
		
		case 1:
			añadirPre();
			break;
		case 2:
			mediaMes();
			break;
		case 3 :
			mediaAnual();
		    break;
		case 4 :
			System.out.println("Saliendo ...");
			break;
		}
		
	
	}while(seleccion!=4);
	
	}
	

	private static void mediaAnual() {
		int totalPre = 0;
		for(int i = 0 ; i < meses ; i++) {
			totalPre += anyo[i];	
		}
		System.out.println("Media de anual por el total de dias del año");
	 int mediaAnualDias = totalPre / totalDias ;
	 System.out.println("Media de anual por el total de meses del año");
	 int mediaAnualMeses = totalPre / meses; 
	 
		
	}
	private static void mediaMes() {
		int media ;
		System.out.println("Indica el mes que quieres saber su media");
		int mes = entrada.nextInt();
		int numDias = seleccionarMes(mes);
		mes = mes- 1 ; 
		for(int i = 0 ; i < meses ; i++) {
			if( i == mes) {
				media = anyo[i] / numDias;
				System.out.println("El total de precipitaciones del mes"+(i+1)+" es de "+anyo[i]+" precipitaciones");
				System.out.println("La media de precipitaciones del mes "+(i+1)+" es de "+media+" precipitaciones por dia");
			}
		}
	}
	private static int seleccionarMes(int mes) {
		
		switch(mes) {
		case 1:
			return enero;
		case 2 :
			return febrero;
		case 3:
			return marzo;
		case 4 :
			return abril;
		case 5 :
			return mayo;
		case 6 :
			return junio;
		case 7:
			return julio;
		case 8:
			return agosto;
		case 9:
		return septiembre;
		case 10:
			return octubre;
		case 11:
			return noviembre;
		case 12 :
			return diciembre;
		default :
			System.out.println("error");
			
		}
		return mes;
		
		
	}
	private static void añadirPre() {
		int  mes;
		System.out.println("En que mes quieres introducir precipitaciones (1 -12)");
		mes = entrada.nextInt();
		mes = mes -1;
		boolean añadido = false;
		for(int i = 0 ; i < meses && !añadido; i++) {
			if(i == mes) {
				System.out.println("Introduce las precipitaciones ");
				int precipitacion = entrada.nextInt();
				anyo[i] += precipitacion;
				añadido = true;
			}
		}
		for(int meses : anyo) {
			System.out.print(meses+" | ");
		}
	}
}
