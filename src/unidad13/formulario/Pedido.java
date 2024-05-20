package unidad13.formulario;

public class Pedido {
	/**
    "Nombre: " + nombre + "\nApellido: " + apellido + "\nCiudad: " + direccion +
    "\nTipo Pedido: " +tipoPedido +
    "\nSeleccion Pizza: " + seleccionPizza +
    "\nSeleccion Tamaño: " + seleccionTamaño+
    "\nPrecio: " + precio
    */
	
	protected String nombre;
	protected String apellido;
	protected String direccion;
	protected String tipoPedido;
	protected String pizza;
	protected String tamaño;
	protected String precio;
	
	
	
	public Pedido(String nombre, String apellido, String direccion, String tipoPedido, String pizza,
			String tamaño, String precio) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
		this.tipoPedido = tipoPedido;
		this.pizza = pizza;
		this.tamaño = tamaño;
		this.precio = precio;
	}



	
	
	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getApellido() {
		return apellido;
	}



	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public String getDireccion() {
		return direccion;
	}



	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}



	public String getTipoPedido() {
		return tipoPedido;
	}



	public void setTipoPedido(String tipoPedido) {
		this.tipoPedido = tipoPedido;
	}



	public String getPizza() {
		return pizza;
	}



	public void setPizza(String pizza) {
		this.pizza = pizza;
	}



	public String getTamaño() {
		return tamaño;
	}



	public void setTamaño(String tamaño) {
		this.tamaño = tamaño;
	}



	public String getPrecio() {
		return precio;
	}



	public void setPrecio(String precio) {
		this.precio = precio;
	}
	
	
	
}
