package unidad5.ejemplos;

public final class encontrarValor {

	
	public static int [] matriz1 = {2,4,5,6,7};
	public static int [] matriz2 = {11,2,55,65,7,43};
	
	public static void main(String[] args) {

	encontrarValor();	
		
	}

	private static void encontrarValor() {
		
		for(int i = 0 ; i < matriz1.length; i++) {
			for(int j = 0 ; j < matriz2.length ; j++) {
				if(matriz1[i] == matriz2[j]) {
					System.out.println("Este elemento es comun en las dos matrices: "+matriz1[i]);
				}
			}
		}
	}

}
