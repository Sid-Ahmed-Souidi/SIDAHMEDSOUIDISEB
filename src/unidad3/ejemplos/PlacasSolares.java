package unidad3.ejemplos;

import java.util.Scanner;

public class PlacasSolares {

	public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	double energiaGenerada = 0 ;
	String ide = null ;
	double latitud = 0 , longitud = 0; 
	boolean estado = true;
	int seleccion ; 
	double calcularDia ; 
	int dias ; 
	
	//mirar lo de si esta activo o inactivo ya que me sale solo si esta falso o verdadero.
	// poner los kw horas en la parte del calculo de energia por dia 
	// crear una opcion donde diga que no esta permitida alguna  opcion que no sea del 1 al 5 
	do {
		System.out.println("1.Registrar un panel solar ");
		System.out.println("2.Consultar informacion del panel solar");
		System.out.println("3.Cambiar el estado de un panel solar ");
		System.out.println("4.Calcular la generacion diaria total de energia");
		System.out.println("5.Salir del programa");
		seleccion = entrada.nextInt();
		
		if(seleccion == 1 ) {
			System.out.println("Ingresa la cantidad de energia generada");
			energiaGenerada = entrada.nextDouble();
			System.out.println("Ingrese la ubicacion de la latitud");
			latitud = entrada.nextDouble();
			System.out.println("Ingrese la ubicacion de la longitud");
			longitud = entrada.nextDouble();
			System.out.println("Ingrese la identificacion");
			ide = entrada.next();

			
		}else if(seleccion == 2) {
			
			if(energiaGenerada==0 && ide==null && latitud==0 &&longitud ==0 ) {
				System.out.println("Debe ingresar datos en la seleccion 1");}
			else {	
				System.out.println("informacion de la energia generada"+energiaGenerada);
				System.out.println("informacion de la latitud"+latitud);
				System.out.println("informacion de la longitud"+longitud);
				System.out.println("informacion de la identificacion"+ide);
				System.out.println("Informacion del estado"+estado);}
			

			
		}else if(seleccion == 3) {
			System.out.println("Estado actual activo"+estado);
			System.out.println("Ha seleccionado cambiar el estado a inactivo");
			estado = false;
			System.out.println("Estado inactivo "+estado);
			
			
			
			
		}else if(seleccion ==4) {
		System.out.println("Calcular energia segun el numero de dias");
		dias = entrada.nextInt();
		calcularDia = dias * energiaGenerada ; 
		System.out.println("Este es la generacion de energia total de estos dias"+calcularDia);
		
			
		}else if(seleccion ==5) {
			System.out.println("Su opcion seleccionada es salir del programa.Hasta la proxima");
			
		}
		
			
			
			
			
		
		


		
		
		
		
		
	}while(seleccion!=5);
	
		
		
	}

	
}
