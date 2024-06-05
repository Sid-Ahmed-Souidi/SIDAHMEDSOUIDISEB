package repasoSegundaEva.empresaLogistica;

import java.util.Iterator;
import java.util.Scanner;

public class gestionEmpresaLogistica {

	
	public static Scanner entrada = new Scanner(System.in);
	public static final int TAM_CAMION = 16;
	public static final int FILAS = 6;
	public static final int COLUMNAS = 10;
	public static int seleccion; 
	
	public static Caja[][] almacen = new Caja[FILAS][COLUMNAS];
	public static Caja[] camion = new Caja[TAM_CAMION];
	public static Caja[] camion1 = new Caja[TAM_CAMION];
	public static Caja[] camion2 = new Caja[TAM_CAMION];
	public static Caja[] camion3 = new Caja[TAM_CAMION];

	
	
	public static void main(String[] args) {
		
		menu();
		
	}

	private static void menu() {
		do {
		System.out.println("1.Registrar caja ");
		System.out.println("2.Cambiar caja de estanteria ");
		System.out.println("3.Consultar estado de estanterias ");
		System.out.println("4.Asignar caja a camion");
		System.out.println("5.Quitar caja a camion ");
		System.out.println("6.Salir del programa ");
		seleccion = entrada.nextInt();
		switch(seleccion) {
		case 1:
			crearCaja();
			break;
		case 2:
			cambiarEstanterias();
			break;
			
		case 3:
			mostrarEstanteria();
			break;
		case 4:
			asignarCajaCamion();
			mostrarCamion();
			mostrarEstanteria();
			break;
		case 5:
			quitarCamion();
			break;
		case 6 :
			System.out.println("Saliendo ...");
		}
		
		}while(seleccion!=6);		
	}
	

	private static void quitarCamion() {
		boolean quitado = false;
		System.out.println("Introduce el codigo de la caja que deseas quitar del camion ");
		String codigo = entrada.next();
		for(int i = 0 ; i <camion.length && !quitado;i++) {
			if(camion[i].getCodigo().equals(codigo)) {
				camion[i]=null;
				quitado=true;
			}
		}
	}
		
	

	private static void mostrarCamion() {
		for(int i = 0 ; i <camion.length;i++) {
			System.out.println(camion[i]);
			
		}
	}

	private static void cambiarEstanterias() {
		boolean cambiado = false ;
		mostrarEstanteria();
		System.out.println();
		System.out.println("Introduce el codigo de la caja que deseas cambiar ");
		String codigo = entrada.next();
		for(int i  = 0 ; i < FILAS && !cambiado; i++) {
			for(int j = 0 ; j <COLUMNAS  && !cambiado ; j++) {
				if(almacen[i][j].getCodigo().equals(codigo)) {
					System.out.println("Introduce en que estanteria quieres cambiar la caja (1 al 6)");
					int estanteria = entrada.nextInt();
					System.out.println("Introduce la posicion dentro de la estanteria (1 al 10)");
					int posicion = entrada.nextInt();
					estanteria -=1;
					posicion -=1;
					if(almacen[estanteria][posicion]==null) {
						almacen[estanteria][posicion] = almacen[i][j];
						almacen[i][j]=null;
						cambiado=true;
					}else {
						System.out.println("La posicion elegida ya hay una caja");
					}			
				}
			}
		}
	}
	
	
	private static void asignarCajaCamion() {
		boolean asignado = false ;
		mostrarEstanteria();
		System.out.println();
		System.out.println("Introduce el codigo de la caja que deseas asgninar al camion");
		String codigo = entrada.next();
		for(int i  = 0 ; i < FILAS && !asignado; i++) {
			for(int j = 0 ; j <COLUMNAS  && !asignado ; j++) {
				if(almacen[i][j].getCodigo().equals(codigo)) {
					for(int z = 0; z < camion.length; z++ ) {
						if(camion[i]==null) {
							camion[z]=almacen[i][j];
							almacen[i][j]=null;
							asignado=true;
						}
					}	
				}
			}
		}
	}

	
	private static void mostrarEstanteria() {
		for(int i = 0 ; i < FILAS; i++) {
			for(int j = 0 ; j < COLUMNAS ; j++) {
				System.out.print(almacen[i][j]);
			}System.out.println();
		}
	}
 
	
	private static void crearCaja() {
		
		System.out.println("Introduce el tipo de la caja");
		String tipo = entrada.next();

		if(tipo.equals("N")||tipo.equals("n")) {
			Caja caja = new Caja(tipo);
			estanteriaNormal(caja);
			
		}else if(tipo.equals("U")||tipo.equals("u")) {
			Caja caja = new Caja(tipo);
			estanteriaUrgente(caja);
			
		}else if(tipo.equals("F")||tipo.equals("f")) {
			Caja caja = new Caja(tipo);
			estanteriaFragil(caja);
			
			
		}else{
			System.out.println("Introduce un id correcto");
		} 
	}
	
	
	
	private static void estanteriaFragil(Caja caja) {
		 
		boolean introducido = false;
			for(int i = 4 ; i < 6 && !introducido ; i++) {
				for(int j = 0 ; j < COLUMNAS  && !introducido; j++) {
					if(almacen[i][j]==null) {
						almacen[i][j]=caja;
						introducido=true;
					}
				}	
			}	
	}

	
	private static void estanteriaNormal(Caja caja) {
		boolean introducido = false;
			for(int i = 0 ; i < 2 && !introducido ; i++) {
				for(int j = 0 ; j < COLUMNAS && !introducido ; j++) {
					if(almacen[i][j]==null) {
						almacen[i][j]=caja;
						introducido=true;
					}
				}	
			}	
	}
	
	
	private static void estanteriaUrgente(Caja caja) {
		boolean introducido = false;
			for(int i = 2 ; i < 4 && !introducido ; i++) {
				for(int j = 0 ; j < COLUMNAS && !introducido ; j++) {
					if(almacen[i][j]==null) {
						almacen[i][j]=caja;
						introducido=true;
					}
				}	
			}	
		}
}

