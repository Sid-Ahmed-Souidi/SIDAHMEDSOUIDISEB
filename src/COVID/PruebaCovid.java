package COVID;

import java.time.LocalDate;

public class PruebaCovid {
	
	private String nombre;
	private String apellidos;
	private int nif;
	private String ocupacion;
	private String lugar ;
	private LocalDate fecha;
	private String tipoPrueba;
	private boolean resultado;
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public int getNif() {
		return nif;
	}
	public void setNif(int nif) {
		this.nif = nif;
	}
	public String getOcupacion() {
		return ocupacion;
	}
	public void setOcupacion(String ocupacion) {
		this.ocupacion = ocupacion;
	}
	public String getLugar() {
		return lugar;
	}
	public void setLugar(String lugar) {
		this.lugar = lugar;
	}
	public LocalDate getFecha() {
		return fecha;
	}
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	public String getTipoPrueba() {
		return tipoPrueba;
	}
	public void setTipoPrueba(String tipoPrueba) {
		this.tipoPrueba = tipoPrueba;
	}
	public boolean isResultado() {
		return resultado;
	}
	public void setResultado(boolean resultado) {
		this.resultado = resultado;
	}
	@Override
	public String toString() {
		return "PruebaCovid [nombre=" + nombre + ", apellidos=" + apellidos + ", nif=" + nif + ", ocupacion="
				+ ocupacion + ", lugar=" + lugar + ", fecha=" + fecha + ", tipoPrueba=" + tipoPrueba + ", resultado="
				+ resultado + "]";
	}
	
	
	
	
	
	
	
	
	
	

}
