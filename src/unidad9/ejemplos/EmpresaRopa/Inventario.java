package unidad9.ejemplos.EmpresaRopa;

import java.util.HashMap;
import java.util.Map;

public class Inventario {
	
	
	Map<Integer,Articulo> inventario = new HashMap<Integer,Articulo>();

	
	public void articulos(Map<Integer ,Articulo> conjuntoArticulos) {
		
		Articulo pantalones = new Articulo(0,"xl" ,5);
		Articulo camisetas = new Articulo(1,"s" ,3);
		Articulo sudaderas = new Articulo(3,"l" ,10);
		Articulo vestido = new Articulo(4,"m" ,10);
	
		conjuntoArticulos.put(0, pantalones);
		conjuntoArticulos.put(1, camisetas);
		conjuntoArticulos.put(2, sudaderas);
		conjuntoArticulos.put(3, vestido);


		
	}
	
	
		public static void mostrarInventario(Map<Integer , Articulo> inventario) {
			
				for(Integer  claveArticulo : inventario.keySet()) {
					System.out.println("Marca: "+claveArticulo+" -Cantidad: "+inventario.get(claveArticulo));
				}
						
			}
			
			
		}
	
	
	
	
