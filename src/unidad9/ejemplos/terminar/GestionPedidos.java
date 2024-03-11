package unidad9.ejemplos.terminar;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import unidad9.ejemplos.terminar.Articulo;

public class GestionPedidos {

    

	
	public static void main(String[] args) {
		
		Map<Integer,Articulo> inventario = new HashMap<Integer,Articulo>();

		Articulo pantalones = new Articulo(0,2,"xl" ,10);
		Articulo camisetas = new Articulo(1,3,"s" ,12);
		Articulo sudaderas = new Articulo(2,4,"l" ,15);
		Articulo vestido = new Articulo(3,5,"m" ,20);
	
		inventario.put(0, pantalones);
		inventario.put(1, camisetas);
		inventario.put(2, sudaderas);
		inventario.put(3, vestido);
		
	
		
		
		
		
		System.out.println("---INVENTARIO-----");
		System.out.println("Pantalones :"+pantalones);
		System.out.println("camisetas :"+camisetas);
		System.out.println("sudaderas :"+sudaderas);
		System.out.println("vestido :"+vestido);
		Articulo.realizarPedido(inventario,seleccionarArticulo());
		System.out.println("---INVENTARIO-----");
		System.out.println("Pantalones :"+pantalones);
		System.out.println("camisetas :"+camisetas);
		System.out.println("sudaderas :"+sudaderas);
		System.out.println("vestido :"+vestido);
		
		
		
		
		
		
		
		
		
		
		
	}

	private static int seleccionarArticulo() {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Que prenda deseas pedir");
		System.out.println("1.Pantalones");
		System.out.println("2.Camisetas");
		System.out.println("3.sudaderas");
		System.out.println("4.Vestido");
		int prenda = entrada.nextInt();
		prenda = prenda -1;
		
		if(prenda==0) {
			return 0;
		}
		else if(prenda==1) {
			return 1;
		}
		else if(prenda==2) {
			return 2;
		}
		else if(prenda==3) {
			return 3;
		}
		else {
			System.out.println("No tenemos esa prenda en el inventario");
		}
		return prenda;
		
		
	}
	
	
	
	
}
