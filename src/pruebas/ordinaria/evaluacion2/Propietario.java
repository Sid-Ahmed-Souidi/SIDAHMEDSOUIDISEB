package pruebas.ordinaria.evaluacion2;

public class Propietario {
	
	private String idCliente;
	private String nombre;
	private int telefono;
	
	
	protected Propietario(String idCliente, String nombre, int telefono) {
		super();
		this.idCliente = idCliente;
		this.nombre = nombre;
		this.telefono = telefono;
	}


	
	
	public String getIdCliente() {
		return idCliente;
	}


	public void setIdCliente(String idCliente) {
		this.idCliente = idCliente;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getTelefono() {
		return telefono;
	}


	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}




	@Override
	public String toString() {
		return "Propietario [idCliente=" + idCliente + ", nombre=" + nombre + ", telefono=" + telefono + "]";
	}
	
	
	
	
	

}
