package pruebas.evaluacion1.recup1;

import java.util.Scanner;

public class Ejercicio3 {

	public static Scanner entrada = new Scanner(System.in);
	public static  int numVehiculos ;

	public static final int tam = 5; 
	public static String[] coches = new String[tam];
	public static String[] motos = new String[tam];
	public static String[] patinetes = new String[tam];

	
	public static void main(String[] args) {

		
		solicitarRango();
		
	}

	private static void solicitarRango() {
	
	
	while(!(numVehiculos<=12 && numVehiculos>=8)) {
		System.out.println("Cuantos vehiculos deseas introducir debe ser entre 8 y 12 vehiculos");
		numVehiculos = entrada.nextInt();
	}
		ingresarVehiculos(numVehiculos);

	
	
	//*if(numVehiculos<=12 && numVehiculos>=8) {
	//	ingresarVehiculos(numVehiculos);
		
	//}
		
	}

	private static void ingresarVehiculos(int numVehiculos2) {
		String tipoVehiculo ;

		for(int i = 0 ; i < numVehiculos2 ; i++){
			System.out.println("Que tipo de vehiculo quieres ingresar ('C','M','P')");
			tipoVehiculo = entrada.next();
			if(tipoVehiculo.equals("C") || (tipoVehiculo.equals("c"))) {
				boolean introducidoCoche = false;
				for(int j =0; j < tam && !introducidoCoche; j++ ) {
					if(coches[j]==null) {
					coches[j] = tipoVehiculo;
					introducidoCoche= true;
					}

				}
				System.out.println("Cantidad restante de coche");
				cantidadRestante(coches);
			}else if(tipoVehiculo.equals("M")|| (tipoVehiculo.equals("m"))) {
				boolean introducidoMoto = false;
				for(int j =0; j < tam && !introducidoMoto; j++ ) {
					if(motos[j]==null) {
					motos[j] = tipoVehiculo;
					introducidoMoto= true;
					}
				}
				System.out.println("Cantidad restante de moto");
				cantidadRestante(motos);
			}else if(tipoVehiculo.equals("P") || (tipoVehiculo.equals("p"))) {
				boolean introducidoPatinete = false;
				for(int j =0; j < tam && !introducidoPatinete ; j++ ) {
					if(patinetes[j]==null) {
					patinetes[j] = tipoVehiculo;
					introducidoPatinete= true;
					}
				}
				System.out.println("Cantidad restante de moto");
				cantidadRestante(patinetes);
			}
		}
		
		cantidadVehiculos(coches , motos , patinetes);
		
	}

	private static void cantidadRestante(String[] vehiculo) {
		int cantidadRestante = 0;
		for(int i = 0 ; i < tam ; i++) {
			if(vehiculo[i]==null) {
				cantidadRestante++;
			}
		}
		System.out.println("La cantidad restante es de "+cantidadRestante);
	
	}

	private static void cantidadVehiculos(String[] coches2, String[] motos2, String[] patinetes2) {
		System.out.println("---COCHES---------");
		int cantidad=0;
		int cantidad2=0;
		int cantidad3=0;

		for(int i = 0 ; i < coches2.length ; i++) {
			if(coches2[i]!= null) {
				cantidad++;
			}
		}System.out.println("La cantidad de coches registrados es de "+cantidad);
		
		System.out.println("---MOTOS-------");
		for(int i = 0 ; i < motos2.length ; i++) {
			if(motos2[i]!= null) {
				cantidad2++;
			}
			}
		System.out.println("Cantidad de motos registrados es de "+cantidad2);
		
		System.out.println("---PATINETES-------");
		for(int i = 0 ; i < patinetes2.length ; i++) {
			if(patinetes2[i]!= null) {
				cantidad3++;
			}
		}System.out.println("Cantidad de patinetes registrados es de "+cantidad3);
		
		
		if(cantidad>cantidad2 && cantidad>cantidad3) {
			System.out.println("El vehiculo con mas cantidad de vehiculos es el COCHE ");
		}else if(cantidad2>cantidad && cantidad2>cantidad3) {
			System.out.println("El vehiculo con mas cantidad de vehiculos es el MOTOS ");
		
		}else if(cantidad3>cantidad && cantidad3>cantidad2) {
			System.out.println("El vehiculo con mas cantidad de vehiculos es el PATINETES ");
		}
		else if(cantidad==cantidad2 && cantidad>cantidad3) {
			System.out.println("coche tiene la misma cantidad que motos pero ambos tienen mas que patinetes");
		}
		
		

	}

}
