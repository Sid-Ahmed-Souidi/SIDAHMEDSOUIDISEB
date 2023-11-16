package unidad4.ejemplos;

import java.util.Scanner;

public class Ejercicio2 {

	public static  double media(double num1 , double num2 , double num3) {
		double media = (num1 + num2 +num3) / 3;
		return media ;
	}

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce el primer numero");
		double num1 = entrada.nextDouble();
		System.out.println("Introduce el segundo numero");
		double num2 = entrada.nextDouble();
		System.out.println("Introduce el tercer numero");
		double num3 = entrada.nextDouble();


		System.out.println("La media de los tres numeros es de  :"+media(num1,num2,num3));




	}

}
