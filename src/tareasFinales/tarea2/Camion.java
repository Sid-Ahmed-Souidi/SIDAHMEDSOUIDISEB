package tareasFinales.tarea2;

public class Camion extends VehiculosCarga{
	
	protected final double PRECIO_CAMION  = 40;

	public Camion(String numMatricula, double PMA) {
		super(numMatricula, PMA);
		// TODO Auto-generated constructor stub
	}


	
	
   @Override
   			public double precioAlquiler(int dias) {
	   		return super.precioAlquiler(dias) + PRECIO_CAMION;
	   		
   				}




@Override
public String toString() {
	return "Camion [PRECIO_CAMION=" + PRECIO_CAMION + ", PRECIO_POR_TONELADA_PMA=" + PRECIO_POR_TONELADA_PMA + ", PMA="
			+ PMA + ", numMatricula=" + numMatricula + "]";
}	
   
   
   
	
	
}
