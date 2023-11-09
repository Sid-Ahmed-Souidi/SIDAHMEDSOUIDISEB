package unidad4.ejemplos;

import java.util.Scanner;

public class Porcentajes2 {
	
	public static double calcularPorcentaje(double valor1,double valor2) {
		double calculoPorcentaje = (valor1 / valor2) * 100;
		return calculoPorcentaje;
		
	}

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce el primer valor");
		double valor1 = entrada.nextDouble();
		System.out.println("Introduce el primer valor");
		double valor2 = entrada.nextDouble();
		 System.out.println(+valor1+" es "+calcularPorcentaje(valor1,valor2)+" por ciento de "+valor2);  
			
			
		}

	}


