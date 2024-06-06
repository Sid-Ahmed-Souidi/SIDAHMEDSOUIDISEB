package pruebas.ordinaria.evaluacion2;

import java.time.LocalDate;

public abstract class Servicio {
	
	private String descripcion;
	private double precioEspecifico;
	private LocalDate fecha;
	
	
	
	
	
	
	
	protected Servicio(String descripcion, double precioEspecifico, LocalDate fecha) {
		super();
		this.descripcion = descripcion;
		this.precioEspecifico = precioEspecifico;
		this.fecha = fecha;
	}
	
	
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public double getPrecioEspecifico() {
		return precioEspecifico;
	}
	public void setPrecioEspecifico(double precioEspecifico) {
		this.precioEspecifico = precioEspecifico;
	}
	public LocalDate getFecha() {
		return fecha;
	}
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	
	
	
	

}
