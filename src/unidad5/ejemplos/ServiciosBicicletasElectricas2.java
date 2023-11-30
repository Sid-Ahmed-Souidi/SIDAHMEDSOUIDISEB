package unidad5.ejemplos;

import java.util.Arrays;
import java.util.Scanner;

public class ServiciosBicicletasElectricas2 {
	static Scanner entrada = new Scanner(System.in);
	
	static final int  TAM = 6;
	static int [] estacionA	 =  new int[TAM]; 
	static int [] estacionB	 =  new int[TAM];
	static int [] estacionC	 =  new int[TAM];
	static int horas ;
	static String bono ; 
	static String reserva;
	static final int conBono = 2; 
	static final int sinBono = 4;
	static  double costoTotal ;
	static String entrega ;
	static String recogida ;	
	static int bicicletaRecoger; 
	public static void main(String[] args) {
	
		estacionC[0] = 10; 
		estacionA[2] = 20;
		estacionA[3] = 30;
		estacionB[0] = 40;
		estacionB[1] = 50;
		estacionB[2] = 60;
		estacionB[3] = 70;
		estacionC[1] = 80;
		estacionC[2] = 90;
		estacionC[3] = 100;
		estacionC[4] = 110;
		estacionC[5] = 120;
		
	//	mostrarBicis(estacionA);		
	//	mostrarBicis(estacionB);
	//	mostrarBicis(estacionC);
		int seleccion ;
		do {
			imprimirMenu();
			seleccion = entrada.nextInt();
			switch(seleccion) {
			
			case 1:
				reservarBici();
				comprobarBono();
				confirmarReserva();
				break;
			
			
			case 2:
				System.out.println("Saliendo del programa ...");
			
			}
			 
				
			
			
			
			
		}while(seleccion != 2);

	}

	private static void reservarBici() {
		System.out.println("El numero de duracion de horas de su reserva");
		horas = entrada.nextInt();

		
		
	}
 
	private static int [] indicarEstacion() {
		System.out.println("estacionA pulse A"); 
		System.out.println("estacionA pulse B");
		System.out.println("estacionA pulse C");
		String indicacion = entrada.next();
		if(indicacion.equals("a") || indicacion.equals("A")) {
			return estacionA;
		}else if(indicacion.equals("b") || indicacion.equals("B")){
			return estacionB;
			
		}else if(indicacion.equals("c") || indicacion.equals("C")){
			return estacionC;
		
		}return null;
	}

	private static void confirmarReserva() {
		System.out.println("¿Quiere realizar la reserva ?");
		reserva = entrada.next();
		if(reserva.equals("Si") || reserva.equals("si")) {
			System.out.println("Ha realizado la reserva");
			System.out.println("Y su reserva tiene un costo de "+costoTotal+" euros");
			System.out.println("Indica en que estacion desea recoger la bicicleta.");
			realizarRecogida(indicarEstacion());
			System.out.println("Indica en que estacion desea entregar la bicicleta.");
			realizarEntrega(indicarEstacion());
			
		}else if(reserva.equals("No") || reserva.equals("no")) {
				System.out.println("Ha decidido no realizar la reserva");
		}else {
			System.out.println("Ha indicado un valor erroneo.Vuelve ha realizar la reserva. ");
		}	
		
	}
	private static void realizarEntrega(int[] estacion) {
		System.out.println(Arrays.toString(estacion));
		int contadorBicis = 0 ; 
		for(int i = 0 ; i < estacion.length ; i++) {
			if(estacion[i] == 0) {
				estacion[i] = bicicletaRecoger;
				break;
			}else if(estacion[i] !=0) {
				contadorBicis ++;
			}
			if(contadorBicis == estacion.length) {
				System.out.println("La estacion esta llena debe seleccionar otra estacion");
				realizarEntrega(indicarEstacion()); // recursividad .
			}
		}	

		

		
	}

	private static void realizarRecogida(int[] estacion) {
		System.out.println("Indique que bicicleta de la estacion quiere recoger.");
		System.out.println(Arrays.toString(estacion));
		int bicicleta = entrada.nextInt();
		for(int i = 0 ; i < estacion.length ; i ++) {
			if(estacion[i] == bicicleta) {
				System.out.println("Recogemos la bicicleta");
				bicicletaRecoger = bicicleta;
				estacion[i] =  0;
				break;
			}
			
		}
		System.out.println(Arrays.toString(estacion));
		
	}

	private static void comprobarBono() {
		System.out.println("¿Tiene el bono de descuento?");
		bono = entrada.next();
		if(bono.equals("Si") || bono.equals("si")) {
			costoTotal = conBono * horas;
			System.out.println("El precio con bono de descuento"+costoTotal);
			
		}else if(bono.equals("No") || bono.equals("no")) {
			costoTotal = sinBono * horas;
			System.out.println("El precio sin bono de descuento"+costoTotal);
		}else {
			System.out.println("Ha indicado un valor erroneo.Vuelve ha realizar la reserva. ");
		}
		
		
	}

	private static void imprimirMenu() {
		System.out.println("1.Reservar Bicicleta");
		System.out.println("3.Salir");
	}

	private static void mostrarBicis(int [] matriz) {
			System.out.println(Arrays.toString(matriz));
		
	}
		
	}


