package unidad5.ejemplos;

public class Ejercicio9 {
	static int  [] matriz1 = {1,0,65,4,5,0,7};
	static int  [] matriz2 = {8,7,6,21,6,65,8};



	public static void main(String[] args) {
		//Escriba un programa Java para encontrar los elementos comunes entre dos matrices
		//(valores de cadena).
		recorrerElementos(matriz1, matriz2);


	}

	public static void recorrerElementos(int [] matriz1 , int [] matriz2) {

		for (int element : matriz1) { // recorrer la matriz1 (no se debe poner 1<= matriz1.length por que se intenta acceder a un indice fuera de rango)
			//System.out.println(matriz1[i]);
			elementoComunes(element);// con esta funcion comparo un elemento de la matriz 1 con los distintos elementos de la matriz 2
		}

	}
	public static void elementoComunes(int elemento) {
		for (int element : matriz2) {
			if(elemento == element) {
				System.out.println("El elemento que coincide de la matriz1 "+elemento+"coincide con la matriz2 "+element);
			}


			}


		}
	}


