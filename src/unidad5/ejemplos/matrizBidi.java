package unidad5.ejemplos;

public class matrizBidi {

	public static void main(String[] args) {

		// Declarar e inicializar una matriz 3x4
        int[][] matriz = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12}
        };

        // Acceder a un elemento
        int valor = matriz[1][2];  // Obtendrá el valor 7

        // Modificar un elemento
        matriz[0][1] = 20;

        // Recorrer la matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();  // Nueva línea después de cada fila
        }
        for (int i = 0; i < matriz.length; i++) {
        	System.out.println(matriz[i] +" ");
        	
        	
        	
        }
		
	}

}
