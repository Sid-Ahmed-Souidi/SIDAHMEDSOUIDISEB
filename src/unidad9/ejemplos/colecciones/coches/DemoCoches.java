package unidad9.ejemplos.colecciones.coches;

public class DemoCoches {

	public static void main(String[] args) {
		
		
		imprimirMarcas(MarcasCoches.marcas);
	}

	private static void imprimirMarcas(String[]  marcasCoches) {
		System.out.println("--marcas coches--");
		for(String marca : marcasCoches) {
			System.out.println(marca);
		}		
	}

}
