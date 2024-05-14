package tareasFinales.parking;

import java.time.LocalTime;

public class VehiculoNoResidente extends Vehiculo{
	
	protected double precio = 0.02;

	
	public VehiculoNoResidente(String matricula) {
		super(matricula);
		this.matricula = matricula;
		
	}




	@Override
	public double precioCobro(double cobroMinuto, LocalTime tiempo) {
		
		
		int horas = tiempo.getHour();
		int minutos = tiempo.getMinute();
		
	     int totalMinutos = horas * 60 + minutos;
	     cobroMinuto = totalMinutos * precio;
		
	     
	     

		return cobroMinuto;
	}

	
	
	
	
}
