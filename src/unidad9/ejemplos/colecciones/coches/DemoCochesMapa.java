package unidad9.ejemplos.colecciones.coches;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class DemoCochesMapa {

	public static void main(String[] args) {
		
		Map<String,Integer> cantidadesMarcas = new HashMap<String,Integer>();
		
		for(String marca : MarcasCoches.marcas) {
			cantidadesMarcas.put(marca, 0);
			
			}
		
		
		cantidadesMarcas.put("Toyota", 3);
		cantidadesMarcas.put("Mazda", 6);
		cantidadesMarcas.put("Volkswagen", 4);
		
		
		System.out.println("Marcas coches - cantidad");
		
		cantidadesMarcas.replace("Toyota", 12);
		 
		imprimirMapa(cantidadesMarcas);
		
	}
	
	
	private static void  imprimirMapa(Map<String,Integer> marcasCoches) {
		for(String  marca : marcasCoches.keySet()) {
			System.out.println("Marca: "+marca+" -Cantidad: "+marcasCoches.get(marca));
		}
		
		
	}

}
