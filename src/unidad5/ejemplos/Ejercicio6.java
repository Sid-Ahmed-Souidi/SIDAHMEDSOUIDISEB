package unidad5.ejemplos;

public class Ejercicio6 {
	 static int [] matriz = {1,2,3,4,5,6,90} ;

	public static void main(String[] args) {
		//Escriba un programa Java para encontrar el valor máximo y mínimo de una matriz.
		System.out.println("Valor maximo de la matriz");
		System.out.println(valorMaximoMatriz(matriz));
		System.out.println("Valor minimo de la matriz");
		System.out.println(valorMinimoMatriz(matriz));
	}

	public static int valorMaximoMatriz(int [] matriz) {
		int mayor = 0 ;
		for (int element : matriz) { // creamos un bucle for para iterar todos los elementos de la matriz
			if(element> mayor) { // aqui comparamos cada elemento  con la variable mayor que empieza con cero
				mayor = element; // y aqui si pasa la condicion pues la variable mayor que su valor por defecto es cero pasa a  valer el valor del elemento
			}

		}return mayor ;

	}
	public static int valorMinimoMatriz(int [] matriz) {
		int minimo = 1000;
		for (int element : matriz) { // creamos un bucle for para iterar todos los elementos de la matriz
			if(element < minimo) { // aqui comparamos cada elemento  con la variable mayor que empieza con cero
				minimo = element; // y aqui si pasa la condicion pues la variable mayor que su valor por defecto es cero pasa a  valer el valor del elemento
			}

		}return minimo ;


	}
}
