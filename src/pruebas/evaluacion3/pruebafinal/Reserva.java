package pruebas.evaluacion3.pruebafinal;



public class Reserva {
	
	private String documento;
	private String fecha;
	private String hora;
	private String cita;
	private String estadoPago;
	private String tramite;
	private String telefono;
	private String email;
	
	
	public Reserva( String documento, String fecha, String hora, String cita, String estadoPago, String tramite,
			String telefono, String email) {
		super();
		this.documento = documento;
		this.fecha = fecha;
		this.hora = hora;
		this.cita = cita;
		this.estadoPago = estadoPago;
		this.tramite = tramite;
		this.telefono = telefono;
		this.email = email;
	}
	
	
	





	public String getDocumento() {
		return documento;
	}


	public void setDocumento(String documento) {
		this.documento = documento;
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


	public String  getCita() {
		return cita;
	}


	public void setCita(String  cita) {
		this.cita = cita;
	}


	public String getEstado_pago() {
		return estadoPago;
	}


	public void setEstado_pago(String estadoPago) {
		this.estadoPago = estadoPago;
	}


	public String getTramite() {
		return tramite;
	}


	public void setTramite(String tramite) {
		this.tramite = tramite;
	}


	public String getTelefono() {
		return telefono;
	}


	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
