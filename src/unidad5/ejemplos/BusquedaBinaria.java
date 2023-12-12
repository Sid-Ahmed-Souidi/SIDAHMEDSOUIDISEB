package unidad5.ejemplos;

public class BusquedaBinaria {

	public static void main(String[] args) {
		int arr [] = {2,11,22,34,49,51,64,78,86,90};
		int resultado = -1;
		int elementoBuscado = 90;
		
		System.out.println("Array");
		imprimirArray(arr);
		System.out.println(" ");
		resultado = buscarBinario(arr,elementoBuscado);
		
		if(resultado==-1) {
			System.out.println("Elemento no esta en el array");
		}else {
			System.out.println("Elemento esta en la posicion :"+resultado);
		}

	}

	private static int buscarBinario(int[] arr, int elementoBuscado) {
		int posicion = -1;
		int izquierda = 0;
		int derecha = arr.length -1;
		int medio = -1;
		boolean noEncontrado=true;
		
		while(izquierda<=derecha && noEncontrado) {
			medio = izquierda +(derecha-izquierda)/2;
			
			if(arr[medio]==elementoBuscado) {
				noEncontrado=false;
				posicion = medio;
				
			}
			if(arr[medio]<elementoBuscado) {
				izquierda= medio+1;
			}else {
				derecha=medio-1;
			}
			
		}
		
		return posicion;
	}

	/**private static void mostrarArray(int []arr) {
		for(int elemento: arr) {
			System.out.print(elemento+" ");
		}
		
	}*/

	private static void imprimirArray(int[] arr) {
		for(int i =0; i<arr.length;i++){
			System.out.print(arr[i]+" ");
			
		}
	}

}
