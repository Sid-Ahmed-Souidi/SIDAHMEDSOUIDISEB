package unidad7.ejemplos;


public class Bicicleta {
	
	private String marca="Sin marca";
	private String modelo="Sin modelo";
	private String color= "Sin color";
	private int id = 0;
	private int tipo = 0;
	
	
	
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
