package unidad7.ejemplos;


public class Bicicleta {
	
	
	// atributos de la clase 
	private String marca="Sin marca";
	private String modelo="Sin modelo";
	private String color= "Sin color";
	private int id = 0;
	private int tipo = 0;
	private int peso = 0;
	private int talla = 0;
	
	
	
	public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getTipo() {
		return tipo;
	}


	public void setTipo(int tipo) {
		this.tipo = tipo;
	}


	public int getPeso() {
		return peso;
	}


	public void setPeso(int peso) {
		this.peso = peso;
	}


	public int getTalla() {
		return talla;
	}


	public void setTalla(int talla) {
		this.talla = talla;
	}

	//Constructor 
	public Bicicleta(int id , int tipo, String marca , String modelo, String color) {
		this.id = id;
		this.tipo = tipo;
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		
	}
	
	
	public String getMarca() {
		return marca;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	
	public void imprimirDatos() {
		
		System.out.println("DATOS DE LA BICICLETA");
		System.out.println("ID :"+id);
		System.out.println("TIPO :"+tipo);
		System.out.println("Marca :"+marca);
		System.out.println("modelo :"+modelo);
		System.out.println("color :"+color);
	}
	
	

}
