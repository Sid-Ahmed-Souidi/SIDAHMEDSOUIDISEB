package unidad4.ejemplos;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ejercicio26 {

	static Scanner entrada = new Scanner(System.in);
	static int invitados ;
	static double precioMenu ;
	static int opcion ;
	static double cremaS = 14.89;
	static double pasta = 12.99 ;
	static double bistec = 22.99;
	static double gazpacho = 9.99;
	static double precioCatering;
	static String decision ;
	public static void main(String[] args) {
		
		cantidadInvitados();
		preciosMenu();
		precioEvento();
		
	}

	private static void precioEvento() {
		System.out.println("Si el numero total de invitados es de :"+invitados);
		 DecimalFormat df = new DecimalFormat("#.00");
		System.out.println("Y la suma de los precios de los menus elejidos es de :"+df.format(precioMenu));
		precioCatering = invitados * precioMenu ;
		System.out.println("El precio total del catering es de:"+df.format(precioCatering));
		
	}

	private static double preciosMenu() {
		do {
			System.out.println("---MENUS DISPONIBLES");
			System.out.println("1.Crema de Salmorejo");
			System.out.println("2.Pasta Carbonara");
			System.out.println("3.Bistec de res");
			System.out.println("4.Gazpacho");
			System.out.println("5.Salir");
			opcion = entrada.nextInt();
			switch(opcion) {
			
			case 1:
				System.out.println("Ha seleccionado crema de Salmorejo");
				System.out.println("Con un precio de :"+cremaS);
				precioMenu += cremaS;
				System.out.println("Desea  añadir otro menu");
				decision = entrada.next();
				if(decision.equals("Si") || decision.equals("si")) {
					preciosMenu();
				}if(decision.equals("No") || decision.equals("no")) {
					break;
					}
			case 2:
				System.out.println("Ha seleccionado pasta carbonara");
				System.out.println("Con un precio de :"+pasta);
				precioMenu += pasta;
				System.out.println("Desea  añadir otro menu");
				decision = entrada.next();
				if(decision.equals("Si") || decision.equals("si")) {
					preciosMenu();
				}if(decision.equals("No") || decision.equals("no")) {
					break;
					}
			case 3:
				System.out.println("Ha seleccionado bistec de res");
				System.out.println("Con un precio de :"+bistec);
				precioMenu += bistec;
				System.out.println("¿Desea añadir otro menu?");
				decision = entrada.next();
				if(decision.equals("Si") || decision.equals("si")) {
					preciosMenu();
				}if(decision.equals("No") || decision.equals("no")) {
					break;
					}
				case 4:
				System.out.println("Ha seleccionado gazpacho");
				System.out.println("Con un precio de :"+gazpacho);
				precioMenu += gazpacho;
				System.out.println("¿Desea añadir otro menu?");
				decision = entrada.next();
				if(decision.equals("Si") || decision.equals("si")) {
					preciosMenu();
				}if(decision.equals("No") || decision.equals("no")) {
					break;
					}
				case 5:
				System.out.println("Saliendo del programa...");
				break;
			}return precioMenu;
			
		}while(opcion!=5);
		
		
	}

	private static int cantidadInvitados() {
		System.out.println("Indica el numero de invitados que asisten al evento");
		invitados = entrada.nextInt();
		return invitados ;
		
		
	}

}
