package practicaEntidadBancaria;

import java.time.LocalDate;

public class EntidadBancaria {
	
	private String dni;
	private String pasaporte;
	private LocalDate fechaNacimiento;
	
	

	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		if(dni.equals("77025587J")) {
		this.dni = dni;
		}
		else {
			System.out.println("El dni no es correcto");
		}
		
	}
	
	
	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		
		LocalDate  nacimientoValidacion = LocalDate.of(2001, 5, 6);
		
		if(nacimientoValidacion.equals(fechaNacimiento)) {
		this.fechaNacimiento = fechaNacimiento;
		}else {
			System.out.println("la fecha de nacimiento es errónea");
		}
	}
	
	
	
	public String getPasaporte() {
		return pasaporte;
	}
	public void setPasaporte(String pasaporte) {
		if(pasaporte.equals("1234abc")) {
		this.pasaporte = pasaporte;
		}else {
			System.out.println("Pasaporte erróneo");
		}
	}
	
	
	
	@Override
	public String toString() {
		return "EntidadBancaria [dni=" + dni + ", pasaporte=" + pasaporte + ", fechaNacimiento=" + fechaNacimiento
				+ "]";
	}
	
	
	
	

}
