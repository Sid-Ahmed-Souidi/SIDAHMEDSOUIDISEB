package tareasFinales.parking;

import java.time.LocalDate;
import java.time.LocalTime;

public abstract class Vehiculo {
	
	
	
	protected String matricula;
	protected double cobroMinuto ;
	protected LocalTime tiempo; 	
	
	

	
	
	
	
	
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



	public double getCobroMinuto() {
		return cobroMinuto;
	}

 void setCobroMinuto(double cobroMinuto) {
		this.cobroMinuto = cobroMinuto;
	}


	
	public  abstract  double precioCobro(double cobroMinuto , LocalTime tiempo);



	
	
	@Override
	public String toString() {
		return "Vehiculo [matricula=" + matricula + ", ]";
	}

	



	
	
	
	

	

}
