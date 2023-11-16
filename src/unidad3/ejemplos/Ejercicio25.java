package unidad3.ejemplos;

import java.util.Scanner;

public class Ejercicio25 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int hectareas ;
		int hectareaTomate;
		int hectareaMaiz ;
		double precioTomate;
		double precioMaiz;
		double precioTotalH;
		System.out.println("Introduzca el numero de hectareas de tomate");
		hectareaTomate = entrada.nextInt();
		System.out.println("Introduzca el numero de hectareas de maiz");
		hectareaMaiz = entrada.nextInt();

		hectareas = hectareaTomate + hectareaMaiz ;

		if(hectareas <=150) {
			precioTomate = hectareaTomate * 3.00 ;
			precioMaiz = hectareaMaiz * 5.00 ;
			precioTotalH = precioTomate + precioMaiz;
			System.out.println("El costo que invertirá el agricultor por la compra de cierta cantidad de hectáreas de tomates y maiz es de :"+precioTotalH+"euros");
			if(precioTomate > precioMaiz) {
				System.out.println("La semmila en que se invirtió mas es la de tomate con total de :"+precioTomate+"respecto a la del Maiz"+precioMaiz+"euros");
			}else if(precioMaiz > precioTomate) {
				System.out.println("La semmila en que se invirtió mas es la de tomate con total de :"+precioMaiz+" euros respecto a la del Maiz"+precioTomate+"euros");
			}

		}else {
			System.out.println("El numero de hectareas excede el limite de 150 hectáreas");

		}























	}

}
