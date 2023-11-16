package unidad3.ejemplos;

import java.util.Scanner;

public class EstacionIf {

	public static void main(String[] args) {
		int mes;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduzca un mes");
		mes = entrada.nextInt();

		if (mes>=1 && mes<2 || mes==12) {
			System.out.println("INVIERNO");

		}
		else if(mes>=3 && mes<=5) {
			System.out.println("PRIMAVERA");

		}
		else if(mes>=6 && mes<=8) {
			System.out.println("VERANO");

		}
		else if(mes>=9 && mes<=11) {
			System.out.println("OTOÑO");

		}
		else
			System.out.println("Valor no valido");

		}






	}


