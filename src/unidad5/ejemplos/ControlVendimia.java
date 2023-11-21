package unidad5.ejemplos;

import java.util.Arrays;
import java.util.Scanner;


public class ControlVendimia {
	 static double [] matriz = {0} ;
	static double [] zona1 ;
	static double [] zona2 ;
	static double [] zona3 ;
	static double [] zona4 ;
	static double [] zona5 ;
	static double [] zona6 ;
	static int opcion ;
	static int opcionZona;
	static double cantidad ;
	Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) {
		int opcion ;
		int opcionZona;
		double cantidad ;
		double sumaTotal = 0;
		Scanner entrada = new Scanner(System.in);
		do {

			System.out.println("--Menu Control Vendimia-----");
			System.out.println("1.Añadir cantidad a una zona");
			System.out.println("2.Obtener peso total");
			System.out.println("3.Cantidad por una zona");
			System.out.println("4.Media de peso");
			System.out.println("5.Salir");
			opcion = entrada.nextInt();


			if(opcion ==1) {
				System.out.println("Selecciona zona para añadir cantidad");
				System.out.println("1.ZONA 1");
				System.out.println("2.ZONA 2");
				System.out.println("3.ZONA 3");
				System.out.println("4.ZONA 4");
				System.out.println("5.ZONA 5");
				System.out.println("6.ZONA 6");
				opcionZona = entrada.nextInt();
				if(opcionZona == 1) {
					System.out.println("Introduzca la cantidad");
					cantidad = entrada.nextDouble();
					double N = matriz.length;
					 zona1 = Arrays.copyOf(matriz , (int) (N + 1));
					 zona1[(int) N] = cantidad;
					System.out.println(Arrays.toString(zona1));

				}else if(opcionZona ==2 ){
					System.out.println("Introduzca la cantidad");
					cantidad = entrada.nextDouble();
					double N = matriz.length;
					 zona2 = Arrays.copyOf(matriz , (int) (N + 1));
					 zona2[(int) N] = cantidad;
					System.out.println(Arrays.toString(zona2));

				}else if(opcionZona ==3 ) {
					System.out.println("Introduzca la cantidad");
					cantidad = entrada.nextDouble();
					double N = matriz.length;
					 zona3 = Arrays.copyOf(matriz , (int) (N + 1));
					 zona3[(int) N] = cantidad;
					System.out.println(Arrays.toString(zona3));

				}else if(opcionZona ==4 ) {
					System.out.println("Introduzca la cantidad");
					cantidad = entrada.nextDouble();
					double N = matriz.length;
					 zona4 = Arrays.copyOf(matriz , (int) (N + 1));
					 zona4[(int) N] = cantidad;
					System.out.println(Arrays.toString(zona4));

				}else if(opcionZona ==5 ) {
					System.out.println("Introduzca la cantidad");
					cantidad = entrada.nextDouble();
					double N = matriz.length;
					 zona5 = Arrays.copyOf(matriz , (int) (N + 1));
					 zona5[(int) N] = cantidad;
					System.out.println(Arrays.toString(zona5));

				}else if(opcionZona ==6 ) {
					System.out.println("Introduzca la cantidad");
					cantidad = entrada.nextDouble();
					double N = matriz.length;
					 zona6 = Arrays.copyOf(matriz , (int) (N + 1));
					 zona6[(int) N] = cantidad;
					System.out.println(Arrays.toString(zona6));

				}
			}else if(opcion ==2) {
				for (double element : zona1) {
					sumaTotal += element ;

				}System.out.println(sumaTotal);

			}














		}while(opcion!=5);







	}


}
