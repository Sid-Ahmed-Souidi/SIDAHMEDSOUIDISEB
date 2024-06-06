package pruebas.ordinaria.evaluacion2;

import java.time.LocalDate;

public class FichaCliente {
	
	private String idAnimal;
	private String nombre ;
	private LocalDate fechaNacimiento;
	private Propietario propietario;
	private Visita visita;
	
	
	protected FichaCliente(String idAnimal, String nombre, LocalDate fechaNacimiento, Propietario propietario,
			Visita visita) {
		super();
		this.idAnimal = idAnimal;
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
		this.propietario = propietario;
		this.visita = visita;
	}


	
	
	
	
	public String getIdAnimal() {
		return idAnimal;
	}






	public void setIdAnimal(String idAnimal) {
		this.idAnimal = idAnimal;
	}






	public String getNombre() {
		return nombre;
	}






	public void setNombre(String nombre) {
		this.nombre = nombre;
	}






	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}






	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}






	public Propietario getPropietario() {
		return propietario;
	}






	public void setPropietario(Propietario propietario) {
		this.propietario = propietario;
	}






	public Visita getVisita() {
		return visita;
	}






	public void setVisita(Visita visita) {
		this.visita = visita;
	}






	@Override
	public String toString() {
		return "fichaCliente [idAnimal=" + idAnimal + ", nombre=" + nombre + ", fechaNacimiento=" + fechaNacimiento
				+ ", propietario=" + propietario + ", visita=" + visita + "]";
	}
	
	
	
	
	
	
	
	

}
