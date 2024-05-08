package tareasFinales.tarea2;

public class VehiculosCarga extends Vehiculo{

	protected final double PRECIO_POR_TONELADA_PMA  = 20;
	protected double PMA ;
	
	
	public VehiculosCarga(String numMatricula , double PMA) {
		super(numMatricula);
		this.PMA = PMA ; 
	}

	@Override
	public double precioAlquiler(int dias ) {
		
		

		return precioDia + PRECIO_POR_TONELADA_PMA * PMA ;
	}
	
	
	

}
