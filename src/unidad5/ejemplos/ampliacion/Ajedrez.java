package unidad5.ejemplos.ampliacion;

public class Ajedrez {

	
	public static final int filas = 8;
	public static final int columnas = 8;
	public static int[][] ajedrez ;
	public static void main(String[] args) {
		
	ajedrez= new int[filas][columnas];
			
		
		posicionesPositivo(4,6);
		
		
	}
	
	private static void posicionesPositivo(int pos1 , int pos2) {

		for(int i = pos1 ; (i <ajedrez.length && i< ajedrez.length) ; i++) {
			ajedrez[i][pos2] = 1;
			//System.out.println(ajedrez[i][pos2]);
			pos2++;
			
		}
		mostrarArray();
	}
	private static void mostrarArray() {
		for(int i = 0 ; i < filas ; i++) {
			for(int j = 0 ; j < columnas ; j++) {
				System.out.print(ajedrez[i][j]+" ");
				
			} 
			System.out.println();
		}
	}

}
