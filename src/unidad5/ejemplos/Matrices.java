package unidad5.ejemplos;

public class Matrices {

	public static void main(String[] args) {
		
		final int TAM_EDADES=20;
		
		//Array edades
		int[] edades = new int[TAM_EDADES];
		edades[0] =13;
		edades[1] =6;
		edades[2] =34;
		edades[3] =56;
		edades[4] =19;
		edades[5] =25;
		edades[6] =42;
		int ContadorMayorEdad = 0 ;
		System.out.println("---------ORDEN ASCENDENTE-------");
		for(int i = 0; i<edades.length; i++) {
			if(edades[i]!=0) { // solo las edades que son distintas a 0
				System.out.println("Posicion"+(i+0)+"-->"+edades[i]);
				if(edades[i]>=18){
					ContadorMayorEdad++;
				}
			}
		}
		
		System.out.println("---------ORDEN DESCENDENTE-------");
		for(int j=TAM_EDADES-1;j>=0;j--) {
			if(edades[j]!=0) { // solo las edades que son distintas a 0
			System.out.println("Posicion"+(j+0)+"-->"+edades[j]);
			}
		}
		
		
		int edad1=13;
		int edad2=6;
		int edad3=34;
		int edad4=56;
		int edad5=19;	
		int edad6=25;
		int edad7=42;
	/**	
		System.out.println(edad1);
		System.out.println(edad2);
		System.out.println(edad3);
		System.out.println(edad4);
		System.out.println(edad5);
		System.out.println(edad6);
		System.out.println(edad7);
	
	*/
	}

}
