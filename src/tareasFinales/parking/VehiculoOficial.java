package tareasFinales.parking;

import java.time.LocalTime;

public class VehiculoOficial extends Vehiculo{

	public VehiculoOficial(String matricula) {
		super(matricula);
		this.matricula = matricula;
	}

	@Override
	public double precioCobro() {
		
		return 0;
	}
	
}
