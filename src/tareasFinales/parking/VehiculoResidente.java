package tareasFinales.parking;

import java.time.LocalTime;

public class VehiculoResidente extends Vehiculo{

	
	protected static double precio = 0.002;
	
	
	public VehiculoResidente(String matricula) {
		super(matricula);
		
	}

	@Override
	/**
	 *  funcion donde multiplicamos el tiempo que son el total de minutos que ha pasado el coche en el parking
	 *  por el precio del vehiculo en este caso de vehiculos residentes
	 */
	public double precioCobro( ) {
		double cobro = precio * tiempo;
		return cobro;
		
	}

}
