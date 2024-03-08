package unidad9.ejemplos.EmpresaRopa;

import java.util.Map;
import java.util.Scanner;

public class Pedido {

	
	

	
	public void  realizarPedido(Map<Integer ,Articulo> conjuntoArticulos){
	    Scanner entrada = new Scanner(System.in); 
		System.out.println("Introduce el articulo que deseas pedir");
		String producto = entrada.next();
		
		for(Integer  producto1 : conjuntoArticulos.keySet()) {
			if(producto.equals(conjuntoArticulos.get(producto1))) {



			}
		}
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
}
