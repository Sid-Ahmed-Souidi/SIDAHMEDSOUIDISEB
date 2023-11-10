package unidad5.ejemplos;

public class EstacionMeteorologica {

	public static void main(String[] args) {
		
		// 
		//la temperatura media de cada mes 
		int [] temperaturas = {12,7,14,15,16,19,21,27,26,20,18,12,-5};
		int [] diasLluviosos = new int[]{28,6,48,89};
		int [] humedad = {10,67,24,89,76,50};
		
		System.out.println("-------TEMPERATURA MEDIA------");
		imprimirArray(temperaturas , "ª");
			
		System.out.println("-------DIAS LLUVIOSOS POR CADA ESTACION------");
		imprimirArray(diasLluviosos, "lluviosos");
		
		System.out.println("-------DIAS LLUVIOSOS POR CADA ESTACION------");
		imprimirArray(humedad, "%");

		
		
		
		
	}
	private static void imprimirArray(int[] datos,String unidad) {
		for(int indice=0;indice<datos.length;indice++) {
			System.out.println("Mes "+(indice+1)+":"+datos[indice]+unidad);
		}
		
	}

}
