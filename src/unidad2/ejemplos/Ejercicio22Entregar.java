package unidad2.ejemplos;

import java.util.Scanner;

public class Ejercicio22Entregar {

	public static void main(String[] args) {
		/**Utilice la web para determinar la población mundial actual y la tasa anual de crecimiento de la población mundial.
		Escriba una aplicación que ingrese estos valores y luego muestra la población mundial estimada después de uno, dos, tres,
		cuatro y cinco años. */
		
		long poblacionMundial ;
		double tasaActual; 
		double tasaActualDecimal;
		double previsionPoblacion ; 
	    double	previsionPoblacion2; 
	    double previsionPoblacion3;
	    double previsionPoblacion4;
	    double previsionPoblacion5;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("introduzca el numero de la poblacion mundial");
		
		poblacionMundial = entrada.nextLong();
		
		System.out.println("introduzca el porcentaje de la tasa anual de crecimiento de la población mundial");
		
		tasaActual = entrada.nextDouble();
		
		
		//Pasar a decimal el porcentaje de la tasa anual 
		
		tasaActualDecimal = tasaActual / 100 ;
		
		// realizo el calculo de la prevision 
		
		 previsionPoblacion = poblacionMundial + ( poblacionMundial * tasaActualDecimal) ;
		 System.out.println("Estimacion de la poblacion dentro de un año"+previsionPoblacion);
		 
		 
		 previsionPoblacion2 = previsionPoblacion +( previsionPoblacion * tasaActualDecimal) ;
		 System.out.println("Estimacion de la poblacion dentro de dos años"+previsionPoblacion2);

		 previsionPoblacion3 = previsionPoblacion2 +( previsionPoblacion2 * tasaActualDecimal) ;
		 System.out.println("Estimacion de la poblacion dentro de tres años"+previsionPoblacion3);

		 previsionPoblacion4 = previsionPoblacion3 +( previsionPoblacion3 * tasaActualDecimal) ;
		 System.out.println("Estimacion de la poblacion dentro de cuatro años"+previsionPoblacion4);

		
		 previsionPoblacion5 = previsionPoblacion4 +( previsionPoblacion4 * tasaActualDecimal) ;
		 System.out.println("Estimacion de la poblacion dentro de cinco años"+previsionPoblacion5);
		
		
	}

}
