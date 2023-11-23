package unidad4.ejemplos;

import java.util.Scanner;

public class Ejercicio29 {

	static Scanner entrada = new Scanner(System.in);
	static double cantidadTotal ;
	static double pagoEmpresa;
	static double pagoBanco;
	static double pagoFabricante;
	static double interesesFabricante ;
	public static void main(String[] args) {

	pedirCantidad();	
	compraDePiezas();
	
	
	}
	private static void compraDePiezas() {
		if(cantidadTotal > 50000.00) {
			masDe50000();
			
		}else {
			menosDe50000();
		}
		
	}
	private static void pedirCantidad() {
		System.out.println("Introduce la cantidad de la compra");
		cantidadTotal = entrada.nextDouble();
	}
	
	private static void masDe50000( ) {
		
		pagoEmpresa = (cantidadTotal * 55) / 100 ; 
		System.out.println("En este caso como excede los 50.000 la empresa debe pagar 55% que son :"+pagoEmpresa+" euros.");
		pagoBanco = (cantidadTotal * 30) / 100 ; 
		System.out.println("El banco debe pagar el 30 % que son"+pagoBanco+" euros");
		pagoFabricante =  cantidadTotal  - (pagoEmpresa + pagoBanco)  ; 
		System.out.println("El banco debe pagar :"+pagoFabricante+" euros");
		
		interesesFabricante = (pagoFabricante * 20 ) / 100 ;
		System.out.println("Los intereses que va a cobrar el fabricante son de :"+interesesFabricante);
		
		
		
	}
	private static void menosDe50000() {
		
		pagoEmpresa = (cantidadTotal * 70) / 100 ; 
		System.out.println("En este caso NO como excede los 50.000 la empresa debe pagar 70% que son :"+pagoEmpresa+" euros.");
		pagoFabricante = (cantidadTotal * 30) / 100 ; 
		System.out.println("El Fabricante debe pagar el 30 % que son"+pagoFabricante+" euros");
		interesesFabricante = (pagoFabricante * 20 ) / 100 ;
		System.out.println("Los intereses que va a cobrar el fabricante son de :"+interesesFabricante);
		
	}

	
}
