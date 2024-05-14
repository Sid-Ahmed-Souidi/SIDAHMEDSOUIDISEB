package tareasFinales.parking;

import java.time.LocalTime;

public class VehiculoResidente extends Vehiculo{

	
	protected double precio = 0.002;
	
	
	public VehiculoResidente(String matricula) {
		super(matricula);
		
	}






	@Override
	public double precioCobro(double cobroMinuto, LocalTime tiempo ) {
		
		int horas = tiempo.getHour();
		int minutos = tiempo.getMinute();
		
	     int totalMinutos = horas * 60 + minutos;
	     cobroMinuto = totalMinutos * precio;
		
	
		return cobroMinuto;
		
	}

}
