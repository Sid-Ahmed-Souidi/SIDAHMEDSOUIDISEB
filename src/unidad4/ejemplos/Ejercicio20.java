package unidad4.ejemplos;

import java.util.Scanner;

public class Ejercicio20 {
		public static final double  PI = Math.PI;
		 static double radio  ;


	public static void main(String[] args) {

		menu();

	}

	//Pedir radio
	public static double pedirRadio() {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduzca el radio");
		radio = entrada.nextInt();
		return radio ;
	}

	//FUNCION MENU
	public static void menu() {
		Scanner entrada = new Scanner(System.in);
		int opcion ;
		do {

			System.out.println("-----MENU-------");
			System.out.println("1.Circunferencia");
			System.out.println("2.Área");
			System.out.println("3.Volumen");
			System.out.println("4.Todas");
			System.out.println("5.Salir ");
			opcion = entrada.nextInt();

			if(opcion==1) {
				pedirRadio();

				System.out.println("Calculo de la  circunferencia  es :"+circunferencia(radio));

			}else if(opcion==2) {
				pedirRadio();
				System.out.println("Calculo del area es :"+area(radio));


			}else if(opcion==3) {
				pedirRadio();
				System.out.println("Calculo del volumen es :"+volumen(radio));

			}else if(opcion==4) {
				pedirRadio();
				System.out.println("Ha seleccionado todas las operaciones");
				System.out.println("Calculo de la  circunferencia  es :"+circunferencia(radio));
				System.out.println("Calculo del area es :"+area(radio));
				System.out.println("Calculo del volumen es :"+volumen(radio));

			}else if(opcion==5) {
				System.out.println("Ha seleccionado salir.");

			}


		}while(opcion!=3);

	}
	// Funcion Circunferencia
	public static double circunferencia(double radio) {
		double circunferencia = 2 * PI * radio ;
		return circunferencia ;

	}
	// funcion area
	public static double area(double radio) {
		double area = PI * Math.pow(radio, 2);
		return area ;

	}
	// funcion volumen
	public static double volumen(double radio) {
		double volumen = (4.0 / 3.0) * PI * Math.pow(radio, 3) ;
		return volumen;

	}


}
