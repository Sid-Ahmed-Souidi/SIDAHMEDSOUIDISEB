package unidad7.ejemplos;

import java.util.Scanner;

public class Ejercicio10 {

	
	public static Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) {

		System.out.println("Introduce el nivel de presión Atmosferica");
		String presion = entrada.nextLine();
		System.out.println("Introduce el nivel de humedad");
		String humedad = entrada.nextLine();		
		
		System.out.println();
		System.out.println("---------------------------------");
		System.out.println("Probabilidad de lluvia");
		System.out.println(probabilidadLluvia(presion, humedad));
		System.out.println("Probabilidad de que haga sol");
		System.out.println(probabilidadSol(presion , humedad));
		System.out.println("Probabilidad de que haga Frio");
		System.out.println(probabilidadFrio(presion , humedad));
		
	}
	
	
	// funciones 
	
	
	public static String probabilidadLluvia(String presion , String humedad) {
		
		if(presion.equals("baja") && humedad.equals("alta")) {
			
			return "muy alta";
		}else if(presion.equals("baja") && humedad.equals("media")) {
			
			return " alta";
		}else if(presion.equals("baja") && humedad.equals("baja")) {
			
			return "media";
		}else if(presion.equals("media") && humedad.equals("media")) {
			
			return "media";
		}else {
			
			return "baja";
		}
	}
	
	
	public static String probabilidadSol(String presion , String humedad) {
		
		if(presion.equals("baja") && humedad.equals("alta")) {
			
			return "baja";
		}else if(presion.equals("baja") && humedad.equals("media")) {
			
			return " media";
		}else if(presion.equals("baja") && humedad.equals("baja")) {
			
			return "media";
		}else if(presion.equals("media") && humedad.equals("media")) {
			
			return "media";
		}else {
			
			return "alta";
		}
	}
	
public static String probabilidadFrio(String presion , String humedad) {
		
		if(presion.equals("baja") && humedad.equals("alta")) {
			
			return "alta";
		}else if(presion.equals("baja") && humedad.equals("media")) {
			
			return " alta";
		}else if(presion.equals("media") && humedad.equals("baja")) {
			
			return "alta";
		}else if(presion.equals("media") && humedad.equals("media")) {
			
			return "media";
		}else {
			
			return "baja";
		}
	}
	
	
}
