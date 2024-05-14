package tareasFinales.parking;

import java.time.LocalDate;
import java.time.LocalTime;

public abstract class Vehiculo {
	
	
	
	protected String matricula;
	protected static long  tiempo; 	
	
	

	
	
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
