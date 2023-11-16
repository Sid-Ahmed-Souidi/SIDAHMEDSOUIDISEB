package unidad5.ejemplos;

public class Ejercicio8 {
	static String[] matriz1 = {"Hola", "movil", "pizza", "PaquitoPotente", "Cadenas"};

	static String[] matriz2 = {"adios", "PaquitoPotente", "Java", "ordenador", "pizza"};

	public static void main(String[] args)  {
		//Escriba un programa Java para encontrar los elementos comunes entre dos matrices 
		//(valores de cadena).
		recorrerElementos(matriz1, matriz2);


	}
	
	public static void recorrerElementos(String [] matriz1 , String [] matriz2) {
		 
		for(int i = 0 ; i < matriz1.length  ; i ++) { // recorrer la matriz1 (no se debe poner 1<= matriz1.length por que se intenta acceder a un indice fuera de rango)
			//System.out.println(matriz1[i]);
			elementoComunes(matriz1[i]);// con esta funcion comparo un elemento de la matriz 1 con los distintos elementos de la matriz 2
		}
		
	}
	public static void elementoComunes(String elemento) {
		for(int k = 0 ; k < matriz2.length ; k ++) {
			if(elemento == matriz2[k]) {
				System.out.println("El elemento que coincide de la matriz1  "+elemento+" coincide con el elemento de  la matriz2 "+matriz2[k]);
			}
				
				
			}
		
		
		}
	}
