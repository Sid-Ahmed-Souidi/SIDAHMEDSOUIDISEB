package unidad9.ejemplos.terminar;

import java.util.Map;
import java.util.Scanner;

public class Articulo{

	
	private int id ;
	private String talla;
	private double precio;
	private int cantidad;

	//
	
	public Articulo(int id ,int cantidad, String talla, double precio) {
		super();
		this.id =  id;
		this.cantidad = cantidad;
		this.talla = talla;
		this.precio = precio;
	}
	
	public int getCantidad() {
		return cantidad;
	}


	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	
	
	
	public String getTalla() {
		return talla;
	}


	public void setTalla(String talla) {
		this.talla = talla;
	}


	public double getPrecio() {
		return precio;
	}


	public void setPrecio(double precio) {
		this.precio = precio;
	}


	public static void realizarPedido(Map<Integer , Articulo> inventario ,int claveArticulo) {
		Scanner entrada = new Scanner(System.in);
		Articulo articulo = inventario.get(claveArticulo);

		System.out.println("Introduzca la talla");
		String talla = entrada.next();
		if(claveArticulo==0) {
			if(articulo.getTalla().equals("xl")) {
				System.out.println("Pedido realizado");
				int cantidadActual = articulo.getCantidad();
				articulo.setCantidad(cantidadActual-1); 
				System.out.println("Cantidad reducida "+articulo.getCantidad());
		}else {
			System.out.println("No hay esa talla para los pantalones ");
		}		
		}else if(claveArticulo==1) {
		if(articulo.getTalla().equals("s")) {
			System.out.println("Pedido realizado");
			int cantidadActual = articulo.getCantidad();
			articulo.setCantidad(cantidadActual-1); 
			System.out.println("Cantidad reducida "+articulo.getCantidad());
		
		}else {
			System.out.println("No hay esa talla para camisetas");
		}
		}else if(claveArticulo==2) {
		if(articulo.getTalla().equals("l")) {
			System.out.println("Pedido realizado");
			int cantidadActual = articulo.getCantidad();
			articulo.setCantidad(cantidadActual-1); 
			System.out.println("Cantidad reducida "+articulo.getCantidad());
		
		}else {
			System.out.println("No hay esa talla para sudaderas");
		}
		}else if(claveArticulo==3) {
		if(articulo.getTalla().equals("m")) {
			System.out.println("Pedido realizado");
			int cantidadActual = articulo.getCantidad();
			articulo.setCantidad(cantidadActual-1); 
			System.out.println("Cantidad reducida "+articulo.getCantidad());
		
		}else {
			System.out.println("No hay esa talla para vestidos");
		}
		
		}
	}
	
	

	@Override
	public String toString() {
		return "Articulo [id=" + id + ", talla=" + talla + ", precio=" + precio + ", cantidad=" + cantidad + "]";
	}
	
	
	
	



	 

	
	
	
	
	
	

}
