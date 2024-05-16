package tareasFinales.parking;

import java.time.LocalTime;

public class VehiculoNoResidente extends Vehiculo{
	
	protected double precio = 0.02;

	
	public VehiculoNoResidente(String matricula) {
		super(matricula);
		this.matricula = matricula;
		
	}




	@Override
	public double precioCobro() {
		
		double cobro = precio * getTiempo();
		return cobro;
	}

}
