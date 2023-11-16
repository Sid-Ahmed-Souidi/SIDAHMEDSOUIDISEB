package unidad3.ejemplos;

import java.util.Scanner;

public class Ejercicio26 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int cantidadBrochas ;
		String tipoBrocha;
		double precioBrocha ;
		double precioDescuento;
		int formaPago ;
		double descuento7 ;

		System.out.println("Introduzca el tipo de brocha ");
		tipoBrocha = entrada.nextLine();
		System.out.println("Introduzca la cantidad de brochas que deseas comprar");
		cantidadBrochas= entrada.nextInt();
		//corregirlo ya que se debe pedir todas las brochas.
		if(tipoBrocha.equals("cerda")) {

			precioDescuento =  20 - ((20 * 20) / 100);
			System.out.println("Aplicamos al precio a las brochas de cerda (20.00$) un descuento del 20%,(De una unidad)."+precioDescuento);

			precioBrocha = cantidadBrochas * precioDescuento;
			System.out.println("¿Desea realizar la compra de forma al contado (pulse 1) o forma de credito (pulse 2)?");
			formaPago= entrada.nextInt();
			if(formaPago ==1) {
				descuento7 = precioBrocha - (precioBrocha * 7) / 100;
				System.out.println("El forma de pago va a ser al contado por lo tanto se aplica un Descuento del 7%"+descuento7);
			}else if(formaPago == 2) {
				System.out.println("Su forma de pago va a ser a credito por lo tanto no tiene descuento del 7% :"+precioBrocha);


			}

		}else if(tipoBrocha.equals("rodillos")) {

			precioDescuento =  45 - ((45 * 20) / 100);
			System.out.println("Aplicamos al precio de los rodillos (45.00$) un descuento del 20%,(de una unidad) ."+precioDescuento);
			precioBrocha = cantidadBrochas * precioDescuento;
			System.out.println("¿Desea realizar la compra de forma al contado (pulse 1) o forma de credito (pulse 2)?");
			formaPago= entrada.nextInt();
			if(formaPago ==1) {
				descuento7 = precioBrocha - (precioBrocha * 7) / 100;
				System.out.println("El forma de pago va a ser al contado por lo tanto se aplica un Descuento del 7%  :"+descuento7);
			}else if(formaPago == 2) {
				System.out.println("Su forma de pago va a ser a credito por lo tanto no tiene descuento del 7%  :"+precioBrocha);



			}

		}else if(tipoBrocha.equals("sellador")) {
			precioDescuento =  10 - ((10 * 20) / 100);
			System.out.println("Aplicamos al precio del sellador (10.00$) un descuento del 20%,(de una unidad).  "+precioDescuento);
			precioBrocha = cantidadBrochas * precioDescuento;
			System.out.println("¿Desea realizar la compra de forma al contado (pulse 1) o forma de credito (pulse 2)?");
			formaPago= entrada.nextInt();
			if(formaPago ==1) {
				descuento7 = precioBrocha - (precioBrocha * 7) / 100;
				System.out.println("El forma de pago va a ser al contado por lo tanto se aplica un Descuento del 7% :"+descuento7);
			}else if(formaPago == 2) {
				System.out.println("Su forma de pago va a ser a credito por lo tanto no tiene descuento del 7% :"+precioBrocha);


			}

		}



	}

}
