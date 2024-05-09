package unidad11.ejemplos.sociedadesCoperativas;

import java.time.LocalDate;

public class SociedadCoperativa {

	private String numInscripcion ;
	private String denoSocial;
	private String provincia ;
	private String localidad;
	private int codigoPostal;
	private String clase;
	private LocalDate fechaInscripcion;
	
	
	public SociedadCoperativa(String numInscripcion, String denoSocial, String provincia, String localidad,
			int codigoPostal, String clase, LocalDate fechaInscripcion) {
		super();
		this.numInscripcion = numInscripcion;
		this.denoSocial = denoSocial;
		this.provincia = provincia;
		this.localidad = localidad;
		this.codigoPostal = codigoPostal;
		this.clase = clase;
		this.fechaInscripcion = fechaInscripcion;
	}


	
	
	
	public String getNumInscripcion() {
		return numInscripcion;
	}


	public void setNumInscripcion(String numInscripcion) {
		this.numInscripcion = numInscripcion;
	}


	public String getDenoSocial() {
		return denoSocial;
	}


	public void setDenoSocial(String denoSocial) {
		this.denoSocial = denoSocial;
	}


	public String getProvincia() {
		return provincia;
	}


	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}


	public String getLocalidad() {
		return localidad;
	}


	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}


	public int getCodigoPostal() {
		return codigoPostal;
	}


	public void setCodigoPostal(int codigoPostal) {
		this.codigoPostal = codigoPostal;
	}


	public String getClase() {
		return clase;
	}


	public void setClase(String clase) {
		this.clase = clase;
	}


	public LocalDate getFechaInscripcion() {
		return fechaInscripcion;
	}


	public void setFechaInscripcion(LocalDate fechaInscripcion) {
		this.fechaInscripcion = fechaInscripcion;
	}
	
	
	
	
	
	
	

}
