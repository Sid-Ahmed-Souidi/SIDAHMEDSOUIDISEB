package pruebas.ordinaria.evaluacion2;

import java.time.LocalDate;
import java.util.List;

public class Visita {
	
	private LocalDate fechaVisita;
	private List<Servicio> servicios;
	
	
	
	protected Visita(LocalDate fechaVisita, List<Servicio> servicios) {
		super();
		this.fechaVisita = fechaVisita;
		this.servicios = servicios;
	}

	
	
	public LocalDate getFechaVisita() {
		return fechaVisita;
	}

	public void setFechaVisita(LocalDate fechaVisita) {
		this.fechaVisita = fechaVisita;
	}

	public List<Servicio> getServicios() {
		return servicios;
	}

	public void setServicios(List<Servicio> servicios) {
		this.servicios = servicios;
	}



	@Override
	public String toString() {
		return "Visita [fechaVisita=" + fechaVisita + ", servicios=" + servicios + "]";
	}
	
	
	
	

}
