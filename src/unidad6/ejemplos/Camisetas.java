package unidad6.ejemplos;


public class Camisetas {
	/**4.      La serigrafía de tu pueblo pretende crear una aplicación para organizar los datos de las camisetas
	que ofrece en su catálogo. Nos indica que quiere recoger la siguiente información: identificador, descripción,
	material, color, precio y cantidad en stock. Defina una clase que permita modelar dicha información. 
	Además, esta clase tendrá un método que permita mostrar por pantalla los datos de la camiseta. 
	Crear una clase ProgramaCamiseta con un método main que utilice la clase creada.*/
	private int ide ;
	private String descripcion;
	private String material;
	private String color;
	private double precio;
	private int cantidad;
	
	// constructor 
	
	public Camisetas(int ide , String descripcion, String material, String color , double precio, int cantidad) {
		
		this.ide = ide ;
		this.descripcion = descripcion;
		this.material = material ;
		this.color = color;
		this.precio = precio;
		this.cantidad = cantidad;
		
	}
	
	
	
	
	// mostrarDatos 

	public int getIde() {
		return ide;
	}
	public void setIde(int ide) {
		this.ide = ide;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		descripcion = descripcion;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
	
	// funciones 

	
	
	// mostrarDatos 
	public void mostrarDatos() {
		String Informacion = "Identificador de la camiseta "+ide+" /n" ;
		Informacion += "Descripción "+descripcion+" /n" ;
		Informacion += "material "+descripcion+" /n" ;
		Informacion += "Descripción "+descripcion+" /n" ;
	}

	
}
