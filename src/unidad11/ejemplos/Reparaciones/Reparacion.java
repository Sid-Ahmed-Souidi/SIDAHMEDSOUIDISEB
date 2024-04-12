package unidad11.ejemplos.Reparaciones;

import java.util.List;

public class Reparacion {
	
	private TIPOVEHICULO tipo;
	private String matricula;
	private String anioCompra;
	private List<String> anioReparacion;
	
	
	
	
	
	
	
	
	
	
	
	
	public Reparacion(TIPOVEHICULO tipo, String matricula, String anioCompra, List<String> anioReparacion) {
		super();
		this.tipo = tipo;
		this.matricula = matricula;
		this.anioCompra = anioCompra;
		this.anioReparacion = anioReparacion;
	}
	
	public TIPOVEHICULO getTipo() {
		return tipo;
	}
	public void setTipo(TIPOVEHICULO tipo) {
		this.tipo = tipo;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getAnioCompra() {
		return anioCompra;
	}
	public void setAnioCompra(String anioCompra) {
		this.anioCompra = anioCompra;
	}
	public List<String> getAnioReparacion() {
		return anioReparacion;
	}
	public void setAnioReparacion(List<String> anioReparacion) {
		this.anioReparacion = anioReparacion;
	}
	
	
	
	
	
	
	

}
