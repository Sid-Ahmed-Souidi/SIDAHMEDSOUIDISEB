package unidad4.ejemplos;

public class Ejercicio6 {
	
	//A)  	// Este método tiene un error!

	public static void saludar(); // No debe llevar punto y coma al declarar saludar() {} 

	{

	System.out.println("Hola");

	}
	
	//B)   	Un método presenta la siguiente cabecera

	// el error es que al hacer la llamada al metodo no se debe indicar el tipo de dato int
	// la manera correcta es mostrarValor(x)
	
	public static void mostrarValor(int x)

	El siguiente código hace una llamada al método

	int x = 8;

	mostrarValor (int x);
	
	//C)   	
	
	//Falta el return que devuelve la variable result 
	public static double multiplicarPorDos(double num){

	double result = num * 2;

	}

	D)  
	// El error que esta dando es que se esta intentado convertir un double a un entero
	public static int obtenerMitad(double num)

	{

	double result = num / 2.0;

	return result;

	}


	
	
	
}
