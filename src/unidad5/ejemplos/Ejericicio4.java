package unidad5.ejemplos;

import java.util.Arrays;
import java.util.Scanner;

public class Ejericicio4 {
	 static int [] matriz = {3,7,5,4,32,23} ;
	 static int [] nuevaMatriz ;
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce el elemento que desea eliminar de la matriz");
		int elemento = entrada.nextInt();
       // System.out.println(Arrays.toString(borrarElemento(matriz, elemento)));
        nuevaMatriz = borrarElemento(matriz, elemento);
        System.out.println(Arrays.toString(nuevaMatriz));


	}

	public static int [] borrarElemento(int [] matriz , int elemento) {
		
		boolean encontrado = false;
		for(int i = 0 ; i < matriz.length ; i++) {
			if(matriz[i] == elemento) {
			 nuevaMatriz = new int[matriz.length - 1]; // se establece el tamaño de la array y se elimina uno tamaño ya que vamos a eliminar un elemento
			 encontrado = true ;
			for (int j = 0; j < i; j++) {
                nuevaMatriz[j] = matriz[j]; //aqui copiamos los elementos anteriores del elemento a eliminar
            }
			for (int k = i; k < nuevaMatriz.length; k++) {
			    nuevaMatriz[k] = matriz[k + 1]; //Aqui copiamos todos los elementos posteriores del elemento a eliminar
			}

			}if(!encontrado) {
				System.out.println("No se ha encontrado el elemnto en la matriz");
				
			}


		}return nuevaMatriz;

	}





}
