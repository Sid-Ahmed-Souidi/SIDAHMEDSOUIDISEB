package unidad6.ejemplos.Tarea2;

public class Coche {
	private Motor tipoMotor;
	private String marca;
	private String modelo;
	private double precio;
	
	public Coche(String marca , String modelo) { 	 
		this.marca = marca;
		this.marca = modelo ;
	}
	
	public Motor getTipoMotor() {
		return tipoMotor;
	}

	public String getMarca() {
		return marca;
	}

	public String getModelo() {
		return modelo;
	}

	public double getPrecio() {
		return precio;
	}
	
	//metodo acumular precio averias
	
	public void acumulaAveria( double averia){
		
		this.precio += averia;
		
		
		
		
		
	}
	
	
	
	
	
}
