package unidad4.ejemplos;

import java.util.Scanner;

public class Ejercicio27 {
	
	static Scanner entrada = new Scanner(System.in);
	static int numero ;
	static String unidadMedida;
	static double bits ;
	static double bytes ;
	static double kilobytes ;
	static double megabytes ;
	static double gigabytes ;


	
	
	public static void main(String[] args) {
		pedirDato();
		obtenerBits();
		obtenerByte();
		obtenerKB();
		obtenerMG();
		obtenerGB();
		
		
	}

	private static void pedirDato() {
		System.out.println("Introduce el numero entero");
		numero = entrada.nextInt();
		System.out.println("Introduce la unidad de medida");
		unidadMedida = entrada.next();
		
	}

	private static void  obtenerGB() {
		if(unidadMedida.equals("megabyte")) {
			gigabytes = numero / 1024.0 ;
			System.out.println("Gigabytes :"+gigabytes);
		}else if(unidadMedida.equals("kilobyte")) {
			gigabytes = numero / (1024.0 * 1024.0) ; 
			System.out.println("Gigabytes :"+gigabytes);
		}else if(unidadMedida.equals("byte")) {
			gigabytes = numero / (1024.0 * 1024.0 * 1024.0) ; 	
			System.out.println("Gigabytes :"+gigabytes);
		}else if(unidadMedida.equals("bits")) {
			gigabytes = numero / (8 *(1024.0*1024.0*1024.0)) ; 		
			System.out.println("Gigabytes :"+gigabytes);

		}
		
	}

	private static void obtenerMG() {
		if(unidadMedida.equals("gigabyte")) {
			megabytes = numero * 1024.0 ;
			System.out.println("megabytes :"+megabytes);
		}else if(unidadMedida.equals("kilobyte")) {
			megabytes = numero / 1024.0 ; 		
			System.out.println("megabytes :"+megabytes);
		}else if(unidadMedida.equals("byte")) {
			megabytes = numero / (1024.0 * 1024.0) ; 
			System.out.println("megabytes :"+megabytes);
		}else if(unidadMedida.equals("bits")) {
			megabytes = numero / (8 *(1024.0*1024.0)) ; 
			System.out.println("megabytes :"+megabytes);

		}
		
	}

		
	

	private static void obtenerKB() {
		if(unidadMedida.equals("gigabyte")) {
			kilobytes = numero * (1024.0 + 1024.0) ;
			System.out.println("Kilobytes :"+kilobytes);
		}else if(unidadMedida.equals("megabyte")) {
			kilobytes = numero * 1024.0 ; 		
			System.out.println("Kilobytes :"+kilobytes);
		}else if(unidadMedida.equals("byte")) {
			kilobytes = numero / 1024.0 ; 		
			System.out.println("Kilobytes :"+megabytes);
		}else if(unidadMedida.equals("bits")) {
			kilobytes = numero / (8 * 1024.0) ;
			System.out.println("Kilobytes :"+megabytes);
		}
		
	}

	private static void obtenerByte() {
		if(unidadMedida.equals("gigabyte")) {
			bytes = numero * (1024.0 + 1024.0 + 1024.0) ;
			System.out.println("En bytes :"+bytes);
		}else if(unidadMedida.equals("megabyte")) {
			bytes = numero * (1024.0 + 1024.0) ; 		
			System.out.println("En bytes :"+bytes);
		}else if(unidadMedida.equals("kilobyte")) {
			bytes = numero * 1024.0 ; 
			System.out.println("En bytes :"+bytes);
		}else if(unidadMedida.equals("bits")) {
			bytes = numero / 8.0  ; 
			System.out.println("En bytes :"+bytes);

		}		
	}

	private static void obtenerBits() {
		if(unidadMedida.equals("gigabyte")) {
			bits = numero * Math.pow(1024, 3) *8 ;
			System.out.println("En bits :"+bits);
		}else if(unidadMedida.equals("megabyte")) {
			bits = numero * Math.pow(1024, 2) *8 ; 		
			System.out.println("En bits :"+bits);
		}else if(unidadMedida.equals("kilobyte")) {
			bits = numero * ( 1024.0 * 8); 		
			System.out.println("En bits :"+bits);
		}else if(unidadMedida.equals("bits")) {
			bits = numero * 8.0  ; 	
			System.out.println("En bits :"+bits);

		}
		
	}

}
