package unidad5.ejemplos;

import java.util.Arrays;
import java.util.Scanner;

public class ControlMaceracion {

	static Scanner entrada= new Scanner(System.in);
	static final int FILAS= 3;
	static final int COLUMNAS = 2;
	static double [][] vinos = new double[FILAS][COLUMNAS];
	
	static int tipoVino;
	static int seleccion ;
	static double litros; 
	public static void main(String[] args) {
		int seleccion ;
		
		do {
			imprimirMenu();
			seleccion = entrada.nextInt();
			
			
			
			switch(seleccion) {
			
			case 1:
				almacenarVino();	
				break;
			case 2:
				consultarVino();
				break;
			case 3 :	
				depositoMAX();
			case 4:
				mediaVino();
				break;
			case 5 :
				tipoArrobas();
			}
		}while(seleccion!=6);
		
	}

	private static void depositoMAX() {
		// TODO Auto-generated method stub
		
	}

	private static void tipoArrobas() {
		System.out.println("Que vino quieres obtener sus arrobas 1.tempranillo ,2.garnacha o 3.verdejo.");
		int vino = entrada.nextInt();
		vino = vino -1;
		double contador = 0 ;
		double arrobas =0 ;
			for(int j = 0 ; j < COLUMNAS ; j++) {
				contador += vinos[vino][j];
			}
			arrobas = contador / 16.33;
			System.out.println("El numero de arrobas que tiene el vino que has seleccionado es de"+arrobas);
}

	private static void mediaVino() {
		int contador = 0;
		for(int i = 0 ; i < FILAS ; i++) {
			for(int j =0 ; j < COLUMNAS ; j++) {
				contador += vinos[i][j];
			}
		}
			int media = contador / 6 ; // 6 son el total de depositos que hay 
			System.out.println(media);
		
		
	}

	private static void consultarVino() {
		for(int i = 0 ; i < FILAS ; i ++) {
			System.out.println("Que tipo de uva quieres consultar su vino");
			int tipoVino = entrada.nextInt();
			tipoVino = tipoVino -1;
			if(vinos[i] == vinos[tipoVino]) {
				System.out.println("Estos son el numero de litros de tipo tempranillo");
				System.out.println(Arrays.toString(vinos[i]));
			}else if(vinos[i] == vinos[tipoVino]) {
				System.out.println("Estos son el numero de litros de tipo garnacha");
				System.out.println(Arrays.toString(vinos[i]));
			}else if(vinos[i] == vinos[tipoVino]) {
				System.out.println("Estos son el numero de litros de tipo verdejo");
				System.out.println(Arrays.toString(vinos[i]));
			}else {
				System.out.println("El valor que ha introducido no es valido.");
			}
			
		}
		
		
	
	}

	private static void almacenarVino() {
		System.out.println("Introduzca el numero segun el vino que desea seleccionar");
		System.out.println("---------------------------------------------------------");
		System.out.println("1.tempranillo");
		System.out.println("2.garnacha");
		System.out.println("3.verdejo");
		seleccion = entrada.nextInt();
		if(seleccion ==1) {
			for(int i = 0 ; i< FILAS ; i ++) {
				if(vinos[i]== vinos[0]) {
					System.out.println("En que deposito deseas almacenar los litros");
					int tipoDeposito = entrada.nextInt();
					tipoDeposito = tipoDeposito -1; 
					if(vinos[i][tipoDeposito] == vinos[i][0]) {
						System.out.println("Introduzca el numero de litros que quieres almacenar de tipo tempranillo");
						litros = entrada.nextDouble();
						vinos[i][tipoDeposito] += litros;
						break;
					}else if(vinos[i][tipoDeposito]==vinos[i][1]) {
						System.out.println("Introduzca el numero de litros que quieres almacenar de tipo tempranillo");
						litros = entrada.nextDouble();
						vinos[i][tipoDeposito] += litros;
						break;
					}else {
						System.out.println("El valor que ha introducido no es valido.");
						break;
					}
				}
			}
		}else if(seleccion ==2) {
			for(int i = 0 ; i< FILAS ; i ++) {
				if(vinos[i]== vinos[1]) {
					System.out.println("En que deposito deseas almacenar los litros");
					int tipoDeposito = entrada.nextInt();
					tipoDeposito = tipoDeposito -1; 
					if(vinos[i][tipoDeposito] == vinos[i][0]) {
						System.out.println("Introduzca el numero de litros que quieres almacenar de tipo garnacha");
						litros = entrada.nextDouble();
						vinos[i][tipoDeposito] += litros;
						break;
					}else if(vinos[i][tipoDeposito]==vinos[i][1]) {
						System.out.println("Introduzca el numero de litros que quieres almacenar de tipo garnacha");
						litros = entrada.nextDouble();
						vinos[i][tipoDeposito] += litros;
						break;
					}else {
						System.out.println("El valor que ha introducido no es valido.");
						break;
					}
				}
			}
			}else if(seleccion ==3) {
				for(int i = 0 ; i< FILAS ; i ++) {
					if(vinos[i]== vinos[2]) {
						System.out.println("En que deposito deseas almacenar los litros");
						int tipoDeposito = entrada.nextInt();
						tipoDeposito = tipoDeposito -1; 
						if(vinos[i][tipoDeposito] == vinos[i][0]) {
							System.out.println("Introduzca el numero de litros que quieres almacenar de tipo verdejo");
							litros = entrada.nextDouble();
							vinos[i][tipoDeposito] += litros;
							break;
						}else if(vinos[i][tipoDeposito]==vinos[i][1]) {
							System.out.println("Introduzca el numero de litros que quieres almacenar de tipo verdejo");
							litros = entrada.nextDouble();
							vinos[i][tipoDeposito] += litros;
							break;
						}else {
							System.out.println("El valor que ha introducido no es valido.");
							break;
						}
					}
				}
			}else {
				System.out.println("El valor que ha introducido no es valido.");
			}
			for(double [] doubles : vinos) {
				System.out.println(Arrays.toString(doubles));
			}
	
	
	}


	

	private static void imprimirMenu() {
		System.out.println("-----------Menu----------");
		System.out.println("1.Almacenar litro de vino..");
		System.out.println("2.Mostrar cuantos litros.");
		System.out.println("3.Mostrar el deposito con mas vinos.");
		System.out.println("4. Mostrar media de litros almacenados.");
		System.out.println("5.Mostrar el numero de arrobas");
		System.out.println("6.Salir");


		
	}

}
