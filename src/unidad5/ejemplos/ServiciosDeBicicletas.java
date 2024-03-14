package unidad5.ejemplos;

import java.util.Scanner;

public class ServiciosDeBicicletas {
	 
	static int tam = 4;
	static int seleccion ; 
	static int numHoras ; 
	static String  bono; 
	static double precioBici;
	static String  reservaSN  ;
	static int numBicis;
	static double precioTotalBici = 0;
	
	static int [] bicis =  {10,20,30,40,50,60,70,80,90,100,110,120};
	
	static int [] estacionA = new int[tam];
	static int [] estacionB = new int[tam];
	static int [] estacionC = new int[tam];
	static Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) {
		
		estacionA[0] = 10;
		estacionA[1] = 20;
		estacionA[2] = 30;
		estacionA[3] = 40;
		estacionB[0] = 50;
		estacionB[1] = 60;
		estacionB[2] = 70;
		estacionB[3] = 80;
		estacionC[0] = 90;
		estacionC[1] = 100;
		estacionC[2] = 110;
		estacionC[3] = 120;


	
		
	do {
		
		
	
		menu();
		
		if(seleccion ==1) {
			
			
			numBicis();
			tipoEstacion();
			
			//1aplicarBono();
			
			
		}else if(seleccion ==2) {
			mostrarCosto();
			
		}else if(seleccion ==5) {
		 System.out.println("Ha decidido salir");
		 
		}else if(seleccion ==4 ) {
			estacionRecogida();
			
			
		}
		
	}while(seleccion!= 5);
		
	}
	private static void tipoEstacion() {

	}
	private static void estacionRecogida() {
		
	}
	private static double numBicis() {
		System.out.println("Cuantas reservas de bicis deseas realizar");
		numBicis = entrada.nextInt();
		
		for(int i = 0 ; i < numBicis; i++) {
			System.out.println("Realiza la reserva de la bici numero"+(i+1));
			precioTotalBici += aplicarBono();
			
		
			
		}return precioTotalBici;
	}
	private static void mostrarCosto() {
		
	if(precioBici==0)	{
		System.out.println("Usted ha decidido no realizar la reserva");
		}
	else {
		System.out.println("El precio de la reserva es de"+precioBici);
	}
		
		
	}
	private static double  aplicarBono() {
		System.out.println("Introduzca la duracion de la reserva en horas :");
		numHoras = entrada.nextInt();
		System.out.println("Tiene el bono de descuento disponible (Si/No)");
		bono = entrada.next();		

		if(bono.equals("Si") || bono.equals("si")) {
			precioBici = numHoras * 2;
			System.out.println("El precio de su reserva dado con la aplicacion de descuento del bono "+precioBici);
			System.out.println("¿Desea realizar la confirmacion de la reserva?");
			reservaSN = entrada.next();
				if(reservaSN.equals("Si") || reservaSN.equals("si")) {
					System.out.println("Ha realizado la reserva .Muchas Gracias por contar con nosotros.");
				}else if (reservaSN.equals("No") || reservaSN.equals("no")) {
					System.out.println("No ha realizado la reserva . Gracias Por su tiempo.");
					precioBici = 0;
				}
	
		}if(bono.equals("No") || bono.equals("no")) {
				precioBici = numHoras * 4 ;
				System.out.println("El precio de reserva sin descuento de bono "+precioBici);}
				System.out.println("¿Desea realizar la confirmacion de la reserva?");
				reservaSN = entrada.next();
			if(reservaSN.equals("Si") || reservaSN.equals("si")) {
				System.out.println("Ha realizado la reserva .Muchas Gracias por contar con nosotros.");
			}else if (reservaSN.equals("No") || reservaSN.equals("no")) {
					System.out.println("No ha realizado la reserva . Gracias Por su tiempo.");
			}

			return precioBici;
		
	}
	
	private static int menu() {
		System.out.println("------MENU RESERVAS DE BICICLETAS--------");
		System.out.println("1.Reservar Bicicleta");
		System.out.println("2.Mostrar Costo");
		System.out.println("3.");
		System.out.println("4.Salir");
		seleccion = entrada.nextInt();
		
		return seleccion;
		
		
		
				
	}

}
