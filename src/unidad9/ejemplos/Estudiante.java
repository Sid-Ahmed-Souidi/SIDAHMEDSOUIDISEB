package unidad9.ejemplos;

public class Estudiante implements Comparable<Estudiante> {
	
	private String nombre;
	private int matricula;
	private int edad;
	
	public Estudiante(String nombre, int matricula, int edad) {
		super();
		this.nombre = nombre;
		this.matricula = matricula;
		this.edad = edad;
	}
	
	
	

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}




	@Override
	public int compareTo(Estudiante otro) {
		int comparation =0;
		if(matricula>otro.matricula) {
			comparation = 1;
		}
		if(matricula<otro.matricula) {
			comparation = -1;
		}
		
		
		return comparation;
	}




	@Override
	public String toString() {
		return "Estudiante [nombre=" + nombre + ", matricula=" + matricula + ", edad=" + edad + "]";
	}
	
	

}
