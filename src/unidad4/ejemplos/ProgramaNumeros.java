package unidad4.ejemplos;

public class ProgramaNumeros {

	public static void main(String[] args) {
		int numero1 = 5;
		int numero2 = 10;

		mostrarDobleNumero(numero1 , numero2);
		mostrarCincoVecesNumero(numero1 , numero2);
		mostrarCuadradoNumero(numero1 , numero2);
	}


	// FUNCIONES
	public static void mostrarDobleNumero(int numero1, int numero2) {

		double numeroDoble = numero1 * 2;
		System.out.println("El doble del primer numero es  :"+numeroDoble);
		double numeroDoble2 = numero2 * 2;
		System.out.println("El doble del segundo numero es  :"+numeroDoble2);
	}

	public static void mostrarCincoVecesNumero(int numero1 , int numero2) {

		double numeroDoble = numero1 * 5;
		System.out.println("Mostrar 5 veces del primer  numero   :"+numeroDoble);
		double numeroDoble2 = numero2 * 5;
		System.out.println("Mostrar 5 veces del segundo numero   :"+numeroDoble2);


	}
public static void mostrarCuadradoNumero(int numero1 , int numero2) {


		double mostrarCuadrado = Math.pow(numero1, 2);
		System.out.println("Mostrar el cuadrado del primer numero   :"+mostrarCuadrado);
		double mostrarCuadrado2 = Math.pow(numero2, 2);
		System.out.println("Mostrar el cuadrado del segundo numero    :"+mostrarCuadrado2);


	}

}
