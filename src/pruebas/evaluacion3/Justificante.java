package pruebas.evaluacion3;

public class Justificante {
	
	private String cita;
	private String fecha;
	private String hora ;
	private String tramite;
	
	
	public Justificante(String cita, String fecha, String hora, String tramite) {
		super();
		this.cita = cita;
		this.fecha = fecha;
		this.hora = hora;
		this.tramite = tramite;
	}


	
	public String getCita() {
		return cita;
	}


	public void setCita(String cita) {
		this.cita = cita;
	}


	public String getFecha() {
		return fecha;
	}


	public void setFecha(String fecha) {
		this.fecha = fecha;
	}


	public String getHora() {
		return hora;
	}


	public void setHora(String hora) {
		this.hora = hora;
	}


	public String getTramite() {
		return tramite;
	}


	public void setTramite(String tramite) {
		this.tramite = tramite;
	}
	
	
	
	
	

}
