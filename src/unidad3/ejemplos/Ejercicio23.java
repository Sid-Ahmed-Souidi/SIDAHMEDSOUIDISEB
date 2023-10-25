package unidad3.ejemplos;

import java.util.Scanner;

public class Ejercicio23 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double precioArticulo ;
		double cantidadArticulo ; 
		double precioConIVA ;
		double precioTotal;
		System.out.println("Introduce el precio del articulo");
		precioArticulo = entrada.nextDouble();
		System.out.println("Introduce la cantidad del articulo");
		cantidadArticulo = entrada.nextDouble();
		
		precioConIVA = precioArticulo + (precioArticulo * 21) / 100;
		precioTotal = (precioConIVA) * cantidadArticulo; //multiplico el precio del articulo mas el IVA con el numero de cantidades que se pide por teclado.
		
		if(precioTotal<=30) {
			precioTotal = precioTotal - ((precioTotal * 10) / 100);// aplicamos el descuento de un 10 %
	        precioTotal = Math.round(precioTotal * 100.0) / 100.0;
			System.out.println("En este caso el monto total no supera los 30 euros por lo tanto se aplica un 10 % de descuento"+precioTotal);
			
		}else if(precioTotal>30 && precioTotal < 70) {
			precioTotal = precioTotal - ((precioTotal * 25) / 100);// aplicamos el descuento de un 10 %
	        precioTotal = Math.round(precioTotal * 100.0) / 100.0;
			System.out.println("En este caso el monto total esta entre los 30 y 70 euros por lo tanto se aplica un 25 de descuento"+precioTotal);
			
		}else if(precioTotal > 70) {
			precioTotal = precioTotal - ((precioTotal * 35) / 100);// aplicamos el descuento de un 10 %
	        precioTotal = Math.round(precioTotal * 100.0) / 100.0;
			System.out.println("En este caso el monto total supera los 70 euros por lo tanto se aplica un 35 de descuento"+precioTotal);
			
		}
		
		
		
		
	}

}
