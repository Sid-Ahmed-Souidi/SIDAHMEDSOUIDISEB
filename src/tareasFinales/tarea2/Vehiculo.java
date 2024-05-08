package tareasFinales.tarea2;

public abstract class Vehiculo {
	
	
	
	static protected final double precioDia = 50;
	protected String numMatricula;
	
	
	public Vehiculo( String numMatricula) {
		super();
		this.numMatricula = numMatricula;
	}






	public String getNumMatricula() {
		return numMatricula;
	}



	public void setNumMatricula(String numMatricula) {
		this.numMatricula = numMatricula;
	}
	
	
	
	
	public  abstract  double precioAlquiler(int dias );
	
	
	
	
	
	
	
	
	
	
	

}
