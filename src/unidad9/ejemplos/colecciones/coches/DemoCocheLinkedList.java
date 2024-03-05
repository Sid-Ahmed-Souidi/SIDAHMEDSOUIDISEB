package unidad9.ejemplos.colecciones.coches;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class DemoCocheLinkedList {

	public static void main(String[] args) {
		
		
		
		// el mismo codigo que la clase de arrayList pero con linkedList
		List<String> listaMarcas = new LinkedList<String>();
		
		for(String marca : MarcasCoches.marcas) {
			listaMarcas.add(marca);
		}
		
		
		System.out.println("## LISTA MARCAS ##");
		Iterator iteradorMarcas = listaMarcas.iterator(); 
		while(iteradorMarcas.hasNext()) {
			String marca = (String)iteradorMarcas.next();
			System.out.println(marca);	
		}
			
		//Otra forma de recorrer con el get 
		for(int i = 0 ; i < listaMarcas.size();i++) {
			System.out.println(listaMarcas.get(i));
		}
		
		
		

	
	
	}

}
