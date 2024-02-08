package unidad6.ejemplos.Tarea2;

public class Coche {
//Tenga un atributo private de tipo Motor, un atributo de tipo String (marca), otro de tipo String (modelo)
	//y otro de tipo double con el precio acumulado con las averías.

//Tenga un constructor con dos parámetros de tipo String que inicialice la marca y el modelo.

//Tenga un getter para cada uno de los atributos.
	
	private Motor tipoMotor;
	private String marca;
	private String modelo;
	private double precio;
	
	public Coche(String marca , String modelo) { 	 
		this.marca = marca;
		this.marca = marca ;
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
	
	public  void acumulaAveria( double averia){
		
		this.precio += averia;
		
		
		
		
		
	}
	
	
	
	
	
}
