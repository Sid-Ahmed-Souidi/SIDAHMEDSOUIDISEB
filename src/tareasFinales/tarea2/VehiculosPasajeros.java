package tareasFinales.tarea2;

public class VehiculosPasajeros  extends Vehiculo {
	
	
private final double  PRECIO_DIA_Y_PLAZA = 1.5;
	
	protected int plazas;

	public VehiculosPasajeros(String numMatricula , int plazas) {
		super(numMatricula);
		this.plazas = plazas;
		}
	
	

	@Override
	public double precioAlquiler(int dias) {
		
		return   precioDia + (PRECIO_DIA_Y_PLAZA * dias +PRECIO_DIA_Y_PLAZA * plazas );
	}
	



	
	
	
	
	
	
	

}
