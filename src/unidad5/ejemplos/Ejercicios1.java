package unidad5.ejemplos;

public class Ejercicios1 {

	public static void main(String[] args) {
		//Escriba un programa Java para calcular el valor promedio de los elementos de la matriz.
		int [] numeros = {3,4,5};
		int contador= 0;
		int media ;
		for(int i = 0 ; i <numeros.length; i++) {
			contador += numeros[i];
		}
		
		media = contador / numeros.length ;
		System.out.println(media);
	
		
		
	}
	

}
