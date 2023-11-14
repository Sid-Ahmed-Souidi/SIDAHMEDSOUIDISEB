package unidad5.ejemplos;

public class Ejercicios1 {
	static int [] numeros = {3,4,5};
	static int contador= 0;
	static int media ;
	public static void main(String[] args) {
		//Escriba un programa Java para calcular el valor promedio de los elementos de la matriz.
		for(int i = 0 ; i <numeros.length; i++) {
			contador += numeros[i];
		}
		
	System.out.println("La media de la matriz es de :"+calcularMedia(numeros ,contador));	
	}
	
	//FUNCION CALCULAR 
	public static int calcularMedia(int[] datos , int contador) {
		media = contador / datos.length ; 
		return media;
		
	}

}
