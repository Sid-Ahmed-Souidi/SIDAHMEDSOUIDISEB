package tareasFinales.tarea2;

public class Microbus extends VehiculosPasajeros {
	
	
	

	public Microbus(String numMatricula, int plazas) {
		super(numMatricula, plazas);
		// TODO Auto-generated constructor stub
	}
		
	
	@Override
	public double precioAlquiler(int dias) {
		// TODO Auto-generated method stub
		return super.precioAlquiler(dias) + 2 * plazas;
	}

	

	@Override
	public String toString() {
		return "Microbus [plazas=" + plazas + ", numMatricula=" + numMatricula + "]";
	}
	
	
	
	
	

}
