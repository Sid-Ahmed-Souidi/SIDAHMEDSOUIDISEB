package unidad7.ejemplos;

public class Cliente {

	private String id;
	private String nombre;
	private boolean socio;
	private String direccion;
	private String tfl;
	private String email;
	
	

	public 	Cliente(String id , String nombre , boolean socio) {
		
		this.id=id;
		this.nombre = nombre;
		this.socio = socio;
		
	}
	
	
	public void mostrarDatos() {
		System.out.println("ID "+id);
		System.out.println("Nombre "+nombre);
		System.out.println("socio "+socio);
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public boolean isSocio() {
		return socio;
	}

	public void setSocio(boolean socio) {
		this.socio = socio;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTfl() {
		return tfl;
	}

	public void setTfl(String tfl) {
		this.tfl = tfl;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
}
