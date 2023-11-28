package unidad5.ejemplos;

import java.util.Arrays;
import java.util.Scanner;

public class PlacasSolares3 {

	
	static Scanner entrada = new Scanner(System.in);

	static int  NUMFILAS ;
	static int NUMCOLUMNAS = 6 ;
	static String identificador;
	static String coordenadaX;
	static String coordenadaY;
	static String energíaGenerada; //KWh
	static String activo; // true false
	static String orientacion ;
	static String consultarIDE ; 
	static String [][] placas ;
	static int numDias=0;
	static int energiaTotal ; 
	
	public static void main(String[] args) {

		int opcion=0;
		
		do {
			//MENU
			imprimirMenu();
			
			opcion = entrada.nextInt();
			
			switch(opcion) {
			
				case 1:
					System.out.println("Cuantas placas vas a registrar");
					NUMFILAS = entrada.nextInt();
					placas = new String[NUMFILAS][NUMCOLUMNAS];
					añadirDatos();
					break;
				case 2:
					for (String[] Strings : placas) {
						System.out.println(Arrays.toString(Strings));
					}
					System.out.println("Que panel desea consultar su informacion");
					consultarIDE = entrada.next();
					 consultarPanel();
	
					break;
				
				case 3:
					System.out.println("Que panel desea cambiar su estado");
					consultarIDE = entrada.next();
					cambiarEstado();
					
					break;
				case 4:
					System.out.println("Calcular la energia generada diaria total");
					numDias = entrada.nextInt();
					calcularEnergia();
			
					break;
				
				case 5 :
					System.out.println("Obtener el listado de todas las placas");
					obtenerListado();
					break;
				
				case 6:
					cambiarOrientacion();
					break;
				case 7:
					System.out.println("Cerrando programa...");
					entrada.close();
					break;
			    default:
			    	System.out.println("Opción no permitida");
			        break;
				
			}
			
		}while(opcion!=7);
		
	}

	private static void cambiarOrientacion() {
		String cambiar;
		
		System.out.println("Introduce la orientacion que deseas cambiar");
		cambiar = entrada.next();
		for(int i = 0 ; i < NUMFILAS ; i ++) {
			if(placas[i][5].equals(cambiar)) {
			System.out.println("La orientacion que desea cambiar es la misma que esta por defecto");	
			}
			else {
				placas[i][5] = cambiar;
			}
			System.out.println(Arrays.toString(placas[i]));
		}
	}

	private static void obtenerListado() {
		for(String [] i : placas ) {
			System.out.println(Arrays.toString(i));
		}
	}

	private static void calcularEnergia() {
		int contadorE = 0;
		for(int i = 0 ; i < NUMFILAS ; i++) {
			int energia = Integer.parseInt(placas[i][3]);
			contadorE += energia;
		}
		energiaTotal = contadorE * numDias;
		System.out.println("Esta es la generacion diaria total de energia"+energiaTotal);
		
	}

	private static void cambiarEstado() {
		for(int i = 0 ; i < NUMFILAS ;i++) {
			if(placas[i][0].equals(consultarIDE)) {
				System.out.println("Antes de cambiarlo");
				System.out.println(Arrays.toString(placas[i]));
				if(placas[i][4].equals("1")) {
					placas[i][4]= "0";
				}
				else{
					placas[i][4]="1";
				}
				System.out.println("Despues de cambiarlo");
				System.out.println(Arrays.toString(placas[i]));
			}		
		}	
	}
	
	private static void consultarPanel() {
		for(int i = 0 ; i < NUMFILAS ; i++) {
			if(placas[i][0].equals(consultarIDE) ) {
				System.out.println(Arrays.toString(placas[i]));		 // esta funcion me valdria para imprimir cualquier tipo de dato string int etc			
			}		
		}
	}

	private static void añadirDatos() {
		for(int i = 0 ; i < NUMFILAS; i++ ) {// este bucl recorre el numero de filas // se ejecuta una vez por cada fila // 
			// for(int j = 0 ; j < NUMCOLUMNAS; j++) // si pongo este bucle interno se ejecuta todo (ide ,coor etc ) por cada celda // en el caso que pongamos 2 placas se ejecutaria 2 * 5 = 10  ;
				System.out.println("----- Nueva placa ------");
				System.out.println("Identificación:");
				identificador = entrada.next();
				placas[i][0] = identificador ;
				System.out.println("CoordenadaX:");
				coordenadaX = entrada.next();
				placas[i][1] =coordenadaX;
				System.out.println("CoordenadaY:");
				coordenadaY = entrada.next();
				placas[i][2] = coordenadaY;
				System.out.println("Energía generada:");
				energíaGenerada = entrada.next();
				placas[i][3] = energíaGenerada;
				System.out.println("estado actual : activo(1) , inactivo(0)");
				activo = entrada.next();
				if(!activo.equals("1") && !activo.equals("0")) {
					System.out.println("los valores que ha introducido no estan permitidos");
				}
				placas[i][4] = activo;
				System.out.println("Introduzca la orientacion que tiene la placa");
				orientacion = entrada.next();
				if(!orientacion.equals("este") && !orientacion.equals("oeste") && !orientacion.equals("este-oeste") && !orientacion.equals("sur")) {
					System.out.println("El dato que ha introducido como orientacion es erroneo");
				}
				placas[i][5] = orientacion ; 
				System.out.println("La placa registrada correctamente");
		}
			
	}

	public static void imprimirMenu() {
		System.out.println("---PLACAS SOLARES");
		System.out.println("1. Nueva placa solar");
		System.out.println("2. Obtener datos placa solar");
		System.out.println("3. Cambiar estado");
		System.out.println("4. Calcular energía generada");
		System.out.println("5. Obtener listado de todas las placas");
		System.out.println("6. Cambiar orientación");
		System.out.println("7. Salir");
	}
}
