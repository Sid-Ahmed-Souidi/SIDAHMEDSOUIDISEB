package unidad5.ejemplos;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class EmpresaLogistica {
	static final int ESTANTERIAS = 2;
	static final  int COLUMNAS = 10;
	static String [][] CAJAS_NORMALES = new String[ESTANTERIAS][COLUMNAS];
	static String [][] CAJAS_FRAJILES = new String[ESTANTERIAS][COLUMNAS];
	static String [][] CAJAS_URGENTES = new String[ESTANTERIAS][COLUMNAS];
	static Random aleatorio = new Random(System.currentTimeMillis());
	static int opcion;
	static Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) {
		
		do{
			
			menu();
			
			 opcion = entrada.nextInt();
			
			if(opcion ==1) {
				pedirCaja();
				
			
			}else if(opcion==2) {
				consultarCaja();
				
			}else if(opcion==3) {
				cambiarEstanterias();
				
			}
			
			
			
			else if (opcion==4) {
				System.out.println("Saliendo ...");
				
			}
			
			
		}while(opcion!=4);
		
	
	}
	private static void cambiarEstanterias(){
		
		System.out.println("Que caja quieres cambiar");
		System.out.println("------------------------");
		consultarCaja();
		System.out.println("A que introduce el tipo caja donde quieras cambiar ");
		String tipoCajaC = entrada.next();
		System.out.println("Introduce el nombre  de la caja");
		String cambiarCaja = entrada.next();
		for(int i = 0 ; i < ESTANTERIAS ; i++) {
			for(int j = 0 ; j < COLUMNAS ; j++) {
			//	if(cambiar==tipoCajaC) {}
			}
		}
		
	}
	private static void consultarCaja() {
		
		System.out.println("Cajas Normales");
		System.out.println("---------------");
		for(String[] estanterias : CAJAS_NORMALES) {
				System.out.println(Arrays.toString(estanterias));
		}
		System.out.println("Cajas Frajiles");
		System.out.println("---------------");
		for(String[] estanterias : CAJAS_FRAJILES) {
			System.out.println(Arrays.toString(estanterias));
	}
		System.out.println("Cajas Urgentes");
		System.out.println("---------------");
		for(String[] estanterias : CAJAS_URGENTES) {
			System.out.println(Arrays.toString(estanterias));
	}
			
	}
	private static void menu() {
		System.out.println("1.Almacenar Caja");
		System.out.println("2.Consultar estanterias");
		System.out.println("3.Cambiar estanterias");
		System.out.println("4.Salir");
	}
	private static void pedirCaja() {
		String  caja ;
		int num ;
		String codigo;

		System.out.println("Introducir tipo de caja (N-NORMAL ; U-URGENTE ; F-FRAJIL)");
		caja = entrada.next();
		int numero = aleatorio.nextInt(1000);
		
		codigo = caja;
		
		caja += numero;
		
		alamacenarCaja(caja,codigo);
		
	}
	private static void alamacenarCaja(String caja, String codigo) {
		boolean datoNoAlmacenado = true;
		int contadorN =0;
		int contadorU =0;
		int contadorF =0;
		if(codigo.equals("N") || codigo.equals("n")) {
			for(int i = 0; i< ESTANTERIAS && datoNoAlmacenado; i++) {
				for(int j = 0 ; j < COLUMNAS && datoNoAlmacenado; j++) {
					System.out.println("¿En que estanteria de cajas Normales quieres alamacenar?");
					int estanteria = entrada.nextInt();
					estanteria = estanteria -1;
					if(CAJAS_NORMALES[estanteria][j] == null) {
					CAJAS_NORMALES[estanteria][j] = caja;
					contadorN +=1;
					datoNoAlmacenado= false;
					}
				}
			}
			
		}else if(codigo.equals("U") || codigo.equals("u")) {
			for(int i = 0; i< ESTANTERIAS && datoNoAlmacenado; i++) {
				for(int j = 0 ; j < COLUMNAS && datoNoAlmacenado; j++) {
					System.out.println("¿En que estanteria de cajas Normales quieres alamacenar?");
					int estanteria = entrada.nextInt();
					estanteria = estanteria -1;
					if(CAJAS_URGENTES[estanteria][j] == null) {
						CAJAS_URGENTES[estanteria][j] = caja;
						contadorU +=1;
					datoNoAlmacenado= false;
					}
				}
			}
			
		}if(codigo.equals("F") || codigo.equals("f")) {
			for(int i = 0; i< ESTANTERIAS && datoNoAlmacenado; i++) {
				for(int j = 0 ; j < COLUMNAS && datoNoAlmacenado; j++) {
					System.out.println("¿En que estanteria de cajas Normales quieres alamacenar?");
					int estanteria = entrada.nextInt();
					if(CAJAS_FRAJILES[estanteria][j] == null) {
						CAJAS_FRAJILES[estanteria][j] = caja;
						contadorF +=1;
					datoNoAlmacenado= false;
					}
				}
			}
			
		}
	}

	

}
