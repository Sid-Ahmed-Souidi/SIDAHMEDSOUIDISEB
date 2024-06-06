package pruebas.ordinaria.evaluacion2;

import java.time.LocalDate;

public class Consulta extends Servicio{
	private String veterinario;
	private String especialidad;
	
	
	protected Consulta(String descripcion, double precioEspecifico, LocalDate fecha ,String veterinario , String especialidad) {
		super(descripcion, precioEspecifico, fecha);
		this.veterinario = veterinario;
		this.especialidad = especialidad;
	
	}


	public String getVeterinario() {
		return veterinario;
	}


	public void setVeterinario(String veterinario) {
		this.veterinario = veterinario;
	}


	public String getEspecialidad() {
		return especialidad;
	}


	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}


	
	
	@Override
	public String toString() {
		return "Consulta [veterinario=" + veterinario + ", especialidad=" + especialidad + "]";
	}


	
	

}
