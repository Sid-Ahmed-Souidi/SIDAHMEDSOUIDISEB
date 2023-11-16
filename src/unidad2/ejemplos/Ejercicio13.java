package unidad2.ejemplos;

public class Ejercicio13 {

	public static void main(String[] args) {

		/**Escribe un programa que calcule el área y
		la circunferencia de un círculo cuyo radio estará almacenado
		en una variable entera llamada r.
		Tal vez necesites buscar las fórmulas para calcular ambas magnitudes.
		Comprueba que el programa funciona correctamente para cualquier valor de r.*/

		int radio = 17;
		double pi = 3.14159;
		double area;
		double cir ;

		System.out.println("Con el radio"+radio);

		area = pi * radio * radio ;
		System.out.println("aqui esta el calculo del area "+area);

		cir = 2 * pi * radio ;
		System.out.println("aqui esta el calculo de la circunferencia "+cir);









	}

}
