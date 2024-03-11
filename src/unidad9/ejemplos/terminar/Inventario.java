package unidad9.ejemplos.terminar;

import java.util.HashMap;
import java.util.Map;

public class Inventario {
		
	//Map<Integer,Articulo> inventario = new HashMap<Integer,Articulo>();


		public static void mostrarInventario(Map<Integer , Articulo> inventario) {
			
				for(Integer  claveArticulo : inventario.keySet()) {
					System.out.println("Marca: "+claveArticulo+" -Cantidad: "+inventario.get(claveArticulo));
				}
						
			}
			
			
		}
	
	
	
	
