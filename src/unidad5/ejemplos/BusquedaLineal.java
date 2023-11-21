package unidad5.ejemplos;

public class BusquedaLineal {

	public static void main(String[] args) {
		int arr [] = {2,3,14,10,56,40};
		int x = 14;
		
		//elemento a buscar 
		int posicion = buscar(arr,x);
		if(posicion==-1) {
			System.out.println("Elemento no encontrado en el array");
		}else {
			System.out.println("El elemento se encuentra en"+"posición :"+posicion+1);
		}
	}

	private static int buscar(int[] arr, int x) {
		
		int resultado = -1 ;
		boolean noEncontrado=true;
		int numVeces =1;
		for(int i = 0 ; i< arr.length && noEncontrado; i ++) {
			if(arr[i] ==x) {
				resultado=i;
				noEncontrado=false;
				//i = arr.length; otra solucion para parar el bucle cuando se encuente la posicion
			}
			numVeces++;
			
		
		}
		return resultado;
		
		
	}

}
