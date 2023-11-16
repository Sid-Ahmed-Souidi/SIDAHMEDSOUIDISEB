package unidad4.ejemplos;

public class Ejercicio7 {

	public static boolean comprobarNumero( int num) {
		final int OPMIN = 5 ;
		final int OPMAX = 10 ;
		boolean logico;
		if(num >= OPMIN && num<= OPMAX ) {
			logico = true;
			return  logico ;
		}else {
			logico = false;
			return logico ;

		}

	}

	public static void main(String[] args) {

		System.out.println(" si se encuentra comprendido true y si no lo esta false"+comprobarNumero(5));

	}

}
