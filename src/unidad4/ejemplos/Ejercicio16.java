package unidad4.ejemplos;

import java.util.Scanner;

public class Ejercicio16 {
	public static double  CalcularPorcentaje(double SinDescuento , double ConDescuento) {
		double calculo ;
		calculo =  (ConDescuento / SinDescuento) * 100;
		calculo = 100 - calculo; 
		return calculo ;
				
				

		
		
		
	}
		
	public static void main(String[] args) {
		/**Realiza un programa que calcule el porcentaje de descuento que nos han hecho 
		al comprar algo. Se debe solicitar la cantidad sin descuento y la cantidad 
		con el descuento aplicado. Se debe crear una función a la que le pasemos ambos valores 
		y nos devuelva el descuento. */
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce el precio sin descuento");
		double SinDescuento = entrada.nextDouble(); 
		System.out.println("Introduce el precio con descuento");
		double  ConDescuento = entrada.nextDouble();

	   System.out.println("El porcentaje de descuento es :"+CalcularPorcentaje(SinDescuento , ConDescuento)+"%");
	}

}
