package unidad5.ejemplos;

import java.util.Scanner;

public class Ejercicio13 {

	static Scanner entrada=  new Scanner(System.in);	
	static int N ;
	static String [] empleados ;
	static int [] hijos ;
	static double [] pagoMensual ;


	public static void main(String[] args) {
		//Declarar el arreglo nombres del empleado, número de hijos 
		//y pago mensual para los registros de N empleados en una empresa. 	

		pedirEmpleados();
		declararNempleados(N);
		declararHijos(N);
		declararPagoMensual(N); 
		añadirDatos();
		mostrarDatos(empleados);
	

	}
	private static void mostrarDatos(String [] empleados) {
		
// muestro los datos de los distintos arrays 		
			System.out.println("Con un total de "+N+ "empleados en la empresa");
			System.out.println("---------------------------------------------");
		for(int i = 0 ,j = 0, n = 0; i < empleados.length && j < hijos.length && n< pagoMensual.length; i++,j++,n++) {
			System.out.println("El empleado "+empleados[i]+" tiene "+hijos[j]+" hijos y recibe un pago mensual de"+pagoMensual[i]) ;
		}
	}
	private static void añadirDatos() {
			//recorro los distintos array y voy añadiendo los distintos datos en cada array 
		for(int i = 0 ,j = 0, n = 0; i < empleados.length && j < hijos.length && n< pagoMensual.length; i++,j++,n++) {
			System.out.println("Introduce el nombre del empleado numero "+(i+1));
			String empleado = entrada.next();
			empleados[i] = empleado;
			System.out.println("Introduce el numero de hijos del empleado numero "+(j+1));
			int hijo = entrada.nextInt();
			hijos[j] = hijo;
			System.out.println("Introduce el pago mensual del empleado "+(n+1));
			double pago = entrada.nextDouble();
			pagoMensual[n] = pago;
		}
		
		
	}
	// en estas tres funciones declaro las posiciones queb van a tener las arrays
	private static String [] declararNempleados(int N) {
		empleados = new String[N];
		return empleados ;
	}
	private static double [] declararPagoMensual(int N) {
		pagoMensual = new double[N];
		return pagoMensual;
	}
	private static int [] declararHijos(int N) {
		hijos = new int[N];
		return hijos ;
	}
	// aqui pido el numero de empleados que va a tener la empresa que va a ser el numero de posiciones que va a tener las distintas arrays
	private static void pedirEmpleados() {
		System.out.println("Introduce el numero de empleados que hay en la empresa");
		N = entrada.nextInt();
	
	}

}
