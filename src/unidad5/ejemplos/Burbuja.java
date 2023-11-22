package unidad5.ejemplos;

public class Burbuja {

	public static void main(String[] args) {
		int [] arreglo = {62 ,23,10,20 ,9};
		System.out.println("Array sin ordenar");

		mostrarArreglo(arreglo);
		System.out.println("Array ordenado");
		ordenarBurbuja(arreglo);
		
	}
	
	private static void ordenarBurbuja(int [] arreglo) {
		int tam = arreglo.length ;
		int tmp;
		for(int i = 0; i < tam -1 ;i++) {
			for(int j=0 ; j<tam-i-1;j++) {
				if(arreglo[j]>arreglo[+j+1]) { // (arreglo[j] vale la posicion 0 , arreglo[+j+1] vale posicion 1
					tmp = arreglo[j];
					arreglo[j]=arreglo[j+1];
					arreglo[j+1]=tmp;
				}
			}
			
		}
		
	}

	private static void mostrarArreglo(int [] arreglo) {
		for(int elemento:arreglo) {
			System.out.print(elemento+" ");
			
		}
	}

}
