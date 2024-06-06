package pruebas.ordinaria.evaluacion2;

import java.time.LocalDate;

public class Tratamiento extends Servicio{
	
	
	private String medicamento;
	private int dosis;
	private LocalDate fechaInicioMedicacion;
	private int numDiasTratamiento;
	

	protected Tratamiento(String descripcion, double precioEspecifico, LocalDate fecha , String medicamento,
			int dosis , LocalDate fechaInicioMedicacion , int numDiasTratamiento) {
			super(descripcion, precioEspecifico, fecha);
			this.medicamento = medicamento;
			this.dosis = dosis;
			this.fechaInicioMedicacion = fechaInicioMedicacion;
			this.numDiasTratamiento = numDiasTratamiento;
		
	}

	
	

	public String getMedicamento() {
		return medicamento;
	}


	public void setMedicamento(String medicamento) {
		this.medicamento = medicamento;
	}


	public int getDosis() {
		return dosis;
	}


	public void setDosis(int dosis) {
		this.dosis = dosis;
	}


	public LocalDate getFechaInicioMedicacion() {
		return fechaInicioMedicacion;
	}


	public void setFechaInicioMedicacion(LocalDate fechaInicioMedicacion) {
		this.fechaInicioMedicacion = fechaInicioMedicacion;
	}


	public int getNumDiasTratamiento() {
		return numDiasTratamiento;
	}


	public void setNumDiasTratamiento(int numDiasTratamiento) {
		this.numDiasTratamiento = numDiasTratamiento;
	}




	@Override
	public String toString() {
		return "Tratamiento [medicamento=" + medicamento + ", dosis=" + dosis + ", fechaInicioMedicacion="
				+ fechaInicioMedicacion + ", numDiasTratamiento=" + numDiasTratamiento + "]";
	}
	
	
	
	
	

}
