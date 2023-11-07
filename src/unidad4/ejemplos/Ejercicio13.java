package unidad4.ejemplos;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double monto ;
		double interes ; 
		int anyo ; 
		
		System.out.println("Ingresar el monto de la inversión :");
		monto = entrada.nextDouble();
		System.out.println("Ingresar la tasa de interes :");
		interes = entrada.nextDouble();
		System.out.println("Ingresar el monto de la inversión :");
		anyo = entrada.nextInt();
		
		inversionFutura(monto,interes,anyo);
		

	}
	//Calcular el valor de la inversion futura.
	public static void inversionFutura(double monto , double interes , int anyo ) {
		double ValorFuturo1 = 0;
		interes = interes / 100 ;
		 int contador = 1;
		System.out.println("Años             Valores Futuros");
		while( anyo > 0) {
		ValorFuturo1 = monto *(Math.pow(1 + interes ,contador));
		 DecimalFormat df = new DecimalFormat("#.00");
		System.out.println(contador+"             "+df.format(ValorFuturo1));
		contador++;
		anyo--;
		}
	

    } 
	
}
