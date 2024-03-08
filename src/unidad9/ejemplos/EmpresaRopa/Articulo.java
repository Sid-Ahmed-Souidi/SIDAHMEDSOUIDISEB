package unidad9.ejemplos.EmpresaRopa;

public class Articulo{
	

	private String talla;
	private double precio;
	private int cantidad;

	//
	
	public Articulo(int cantidad, String talla, double precio) {
		super();
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






	@Override
	public String toString() {
		return "Articulo [talla=" + talla + ", precio=" + precio + ", cantidad=" + cantidad + "]";
	}


	
	
	
	
	
	

}
