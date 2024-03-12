package unidad9.ejemplos.ExplotacionGanadera;

import java.time.LocalDate;

public class Revision {
	
	private String veterinaria;
	private LocalDate fechaRevision;
	private boolean cuidado;
	
	
	// constructor 
	public Revision(String veterinaria, LocalDate fechaRevision, boolean cuidado) {
		super();
		this.veterinaria = veterinaria;
		this.fechaRevision = fechaRevision;
		this.cuidado = cuidado;
	}


	public String getVeterinaria() {
		return veterinaria;
	}


	public void setVeterinaria(String veterinaria) {
		this.veterinaria = veterinaria;
	}


	public LocalDate getFechaRevision() {
		return fechaRevision;
	}


	public void setFechaRevision(LocalDate fechaRevision) {
		this.fechaRevision = fechaRevision;
	}


	public boolean isCuidado() {
		return cuidado;
	}


	public void setCuidado(boolean cuidado) {
		this.cuidado = cuidado;
	}
	
	
	
	
	
}
