package unidad5.ejemplos;

import java.util.Scanner;

public class Ejercicio13 {

	static Scanner entrada=  new Scanner(System.in);	
	static int N ;
	static int [] empledos ;
	static int [] hijos ;
	static int [] pagoMensual ;


	public static void main(String[] args) {
		//Declarar el arreglo nombres del empleado, número de hijos 
		//y pago mensual para los registros de N empleados en una empresa. 	

		pedirEmpleados();
		declararNempleados(N);
		declararHijos();
		declararPagoMensual();

		
		

	}
	private static void declararPagoMensual() {
		// TODO Auto-generated method stub
		
	}
	private static void declararHijos() {
		// TODO Auto-generated method stub
		
	}
	private static void pedirEmpleados() {
		System.out.println("Introduce el numero de empleados");
		N = entrada.nextInt();
	
	}
	private static void declararNempleados(int N) {
		empledos = new int[N];
		
	}

}
