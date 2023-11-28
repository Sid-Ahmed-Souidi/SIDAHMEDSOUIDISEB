package unidad5.ejemplos;

import java.util.Scanner;

public class PanelesSolares2 {

	static Scanner entrada = new Scanner(System.in);

	
	static int NUMFILAS ;
	static int NUMCOLUMNAS = 6 ;
	static String identificador;
	static String coordenadaX;
	static String coordenadaY;
	static String energíaGenerada; //KWh
	static String activo; // true false
	static String orientacion ;
	
		
	static String [][] placas = new String[NUMFILAS][NUMCOLUMNAS];
	
	public static void main(String[] args) {
		

		int opcion=0;
		int numDias=0;
		
		do {
			//MENU
			imprimirMenu();
			
			opcion = entrada.nextInt();
			
			switch(opcion) {
			
				case 1:
					System.out.println("Cuantas placas vas a registrar");
					NUMFILAS = entrada.nextInt();
					añadirDatos();
					
				break;
				case 2:
					
					
					System.out.println("----- Datos placa ----");
					
				//	if(identificador!=0) {
					
						System.out.println("Identificación:"+identificador);
						System.out.println("CoordenadaX:"+coordenadaX);
						System.out.println("CoordenadaY:"+coordenadaY);
						System.out.println("Energía generada:"+energíaGenerada+" KWh");
				//		if(activo) {
							System.out.println("Estado:activo");
					//	}else{
							System.out.println("Estado:inacivo");
					//	}
			//		}else {
						System.out.println("No existen datos");
				//	}
					
					
						
					break;
				case 3:
					System.out.println("Cambiar estado placa");
				//	activo = !activo;
					
					System.out.println("Estado cambiado correctamente");
					break;
				case 4:
					System.out.println("Calcular energía");
					System.out.println("Introduzca el número de días:");
					numDias = entrada.nextInt();
			//		System.out.println("Energía generada en "+numDias+" días es"+(numDias*energíaGenerada)+" KWh");
					break;
				case 5:
					System.out.println("Cerrando programa...");
					entrada.close();
					break;
			    default:
			    	System.out.println("Opción no permitida");
			    	
			        break;
				
			
			}
			
			
			
		}while(opcion!=5);
		
		
	}
	
	

	
	private static void añadirDatos() {
		for(int i = 0 ; i < placas.length ; i++ ) {
			for(int j = 0 ; j < placas[i].length; j++) {
				System.out.println("----- Nueva placa ------");
				System.out.println("Identificación:");
				identificador = entrada.next();
				placas[i][j] = identificador ;
				System.out.println("CoordenadaX:");
				coordenadaX = entrada.next();
				placas[i][j] =coordenadaX;
				System.out.println("CoordenadaY:");
				coordenadaY = entrada.next();
				placas[i][j] = coordenadaY;
				System.out.println("Energía generada:");
				energíaGenerada = entrada.next();
				placas[i][j] = energíaGenerada;
				System.out.println("estado actual : activo(1) , inactivo(0)");
				activo = entrada.next();
				placas[i][j] = activo;
				System.out.println("La placa registrada correctamente");
			
				
			}
			
		}
	}




	public static void imprimirMenu() {
		System.out.println("---PLACAS SOLARES");
		System.out.println("1. Nueva placa solar");
		System.out.println("2. Obtener datos placa solar");
		System.out.println("3. Cambiar estado");
		System.out.println("4. Calcular energía generada");
		System.out.println("5. Salir");
	}

}
