package tareasFinales.parking;

import java.time.LocalDate;
import java.time.LocalTime;

public abstract class Vehiculo {
	
	
	
	protected String matricula;
	protected static long  tiempo; 	
	protected static LocalTime horaEntrada;
	protected static  LocalTime horaSalida;
	

	
	
	public static LocalTime getHoraEntrada() {
		return horaEntrada;
	}



	public static void setHoraEntrada(LocalTime horaEntrada) {
		Vehiculo.horaEntrada = horaEntrada;
	}



	public static LocalTime getHoraSalida() {
		return horaSalida;
	}



	public static void setHoraSalida(LocalTime horaSalida) {
		Vehiculo.horaSalida = horaSalida;
	}



	public Vehiculo(String matricula) {
		super();
		this.matricula = matricula;
	}



	public String getMatricula() {
		return matricula;
	}



	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}





	public long getTiempo() {
	return tiempo;
}



public void setTiempo(long tiempo) {
	this.tiempo = tiempo;
}



	public  abstract  double precioCobro();



	
	
	@Override
	public String toString() {
		return "Vehiculo [matricula=" + matricula + ", ]";
	}

	



	
	
	
	

	

}
