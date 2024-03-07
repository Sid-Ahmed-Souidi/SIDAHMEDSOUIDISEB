package unidad8.ejemplos.sooper.Contenedores;

public class Producto {
	
	private double volumen ;
	private double peso;
	private boolean estado;
	private String nombre;
	
	
	public Producto(double volumen, double peso, boolean estado ,String nombre) {
		super();
		this.volumen = volumen;
		this.peso = peso;
		this.estado = estado;
		this.nombre = nombre;
	}

	
	
	
	
	public String getNombre() {
		return nombre;
	}

	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	
	public double getVolumen() {
		return volumen;
	}



	public void setVolumen(double volumen) {
		this.volumen = volumen;
	}



	public double getPeso() {
		return peso;
	}



	public void setPeso(double peso) {
		this.peso = peso;
	}



	public boolean isEstado() {
		return estado;
	}



	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	
	
	
	
	
	
	
	
	
	
	

}
