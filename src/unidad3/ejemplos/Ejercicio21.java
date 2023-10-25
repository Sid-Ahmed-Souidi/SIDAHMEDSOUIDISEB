package unidad3.ejemplos;

import java.util.Scanner;

public class Ejercicio21 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String tipoCoche ;
		double kmRecorrer ;
		double precioKR ;
		double tarifa ; 
		double precioTotal ; 
		
			System.out.println("Introduzca el tipo de coche que desea alquilar");
			tipoCoche = entrada.nextLine();
			System.out.println("Introduzca  los kilometros a recorrer");
			kmRecorrer = entrada.nextInt();
			
			if(tipoCoche.equals("pequeño") || tipoCoche.equals("Pequeño")) {// La manera de comparar cadenas son con el .equals
				tarifa = 15;
				precioKR = kmRecorrer * 0.20 ;
				precioTotal = tarifa + precioKR ;
					if(kmRecorrer > 10) {
						precioTotal = precioTotal + (precioTotal * 2.5) / 100 ;
				        precioTotal = Math.round(precioTotal * 100.0) / 100.0;

						System.out.println("El precio total de alquiler diario del coche  pequeño y  con 2.5% mas sobre el monto a pagar es de :"+precioTotal);
	
					}else {
						System.out.println("El precio total de alquiler del coche pequeño es de :"+precioTotal);
					
					}
			
			}else if(tipoCoche.equals("mediano")|| tipoCoche.equals("Mediano")) {
					tarifa = 15;
					precioKR = kmRecorrer * 0.30 ;
					precioTotal = tarifa + precioKR ;
					if(kmRecorrer > 10) {
						precioTotal = precioTotal + (precioTotal * 2.5) / 100 ;
				        precioTotal = Math.round(precioTotal * 100.0) / 100.0;

						System.out.println("El precio total de alquiler diario del coche mediano y  con 2.5% mas sobre el monto a pagar es de :"+precioTotal);
					
					}else {
						System.out.println("El precio total de alquiler diario del coche mediano es de :"+precioTotal);
					
					}
			
			}else if(tipoCoche.equals("grande") || tipoCoche.equals("Grande") ) {
				tarifa = 15;
				precioKR = kmRecorrer * 0.40 ;
				precioTotal = tarifa + precioKR ;
				if(kmRecorrer > 10) {
					precioTotal = precioTotal + (precioTotal * 2.5) / 100 ;
			        precioTotal = Math.round(precioTotal * 100.0) / 100.0;
					System.out.println("El precio total de alquiler diario del coche  grande y  con 2.5% mas sobre el monto a pagar es de :"+precioTotal);
				
				}else {
					System.out.println("El precio total de alquiler diario del coche grande es de :"+precioTotal);
				
				}
		
		}else {
			
			System.out.println("Ha escrito mal el tipo de coche que desea alquilar(pequeño , mediano o grande.)");
		}
		
			
			
			
		
		
		
		
		
		
		
		
		
		
		
	}

}
