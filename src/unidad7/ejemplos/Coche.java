package unidad7.ejemplos;


public class Coche {
	
	private String marca="Sin marca";
	private String modelo="Sin modelo";
	private String color= "Sin color";
	private String matricula = "vacio";
	private int puetas = 0;
	private int tipo = 0;
	
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
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
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public int getPuetas() {
		return puetas;
	}
	public void setPuetas(int puetas) {
		this.puetas = puetas;
	}
	public int getTipo() {
		return tipo;
	}
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	
	
	public 	Coche(int puertas , int tipo, String marca , String modelo, String color) {
		
		this.puetas = puertas;
		this.tipo = tipo;
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		
	}
	
	
	
	
	public void imprimirDatos() {
		
		System.out.println("DATOS DE LA BICICLETA");
		System.out.println("Matricula :"+matricula);
		System.out.println("TIPO :"+tipo);
		System.out.println("Marca :"+marca);
		System.out.println("modelo :"+modelo);
		System.out.println("color :"+color);
		System.out.println("Puertas :"+puetas);
	}
	
	
	
	

	
	
	

}
