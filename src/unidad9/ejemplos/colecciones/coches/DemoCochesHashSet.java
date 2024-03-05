package unidad9.ejemplos.colecciones.coches;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class DemoCochesHashSet {

	public static void main(String[] args) {
		
		Set<String> conjuntoMarcas = new HashSet<String>();
			
		for(String marca : MarcasCoches.marcas) {
			conjuntoMarcas.add(marca);
			}
		
			System.out.println("## LISTA MARCAS ##");
			Iterator iteradorMarcas = conjuntoMarcas.iterator(); 
			while(iteradorMarcas.hasNext()) {
				String marca = (String)iteradorMarcas.next();
				System.out.println(marca);
			
			}
		
			conjuntoMarcas.add("Toyota");
		
			while(iteradorMarcas.hasNext()) {
				String marca = (String)iteradorMarcas.next();
				System.out.println(marca);
			
			}
		
		
			

		
		
	}

}
