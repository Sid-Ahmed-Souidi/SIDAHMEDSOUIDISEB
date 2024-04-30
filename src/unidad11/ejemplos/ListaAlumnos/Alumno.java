package unidad11.ejemplos.ListaAlumnos;

public class Alumno {
	
	private int id;
	private String nombre ;
	private String apellido;
	private int cicloFormativo;
	
	
	
	
	
	
	public Alumno(int id, String nombre, String apellido, int cicloFormativo) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.cicloFormativo = cicloFormativo;
	}

	
	
	
	

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellidos() {
		return apellido;
	}
	

	public void setApellidos(String apellidos) {
		this.apellido = apellidos;
	}


	public int getCicloFormativo() {
		return cicloFormativo;
	}


	public void setCicloFormativo(int cicloFormativo) {
		this.cicloFormativo = cicloFormativo;
	}






	@Override
	public String toString() {
		return "Alumno [id=" + id + ", nombre=" + nombre + ", apellidos=" + apellido + ", cicloFormativo="
				+ cicloFormativo + "]";
	}
	
	
	
	
	
	
	
	
	

}
