package unidad9.ejemplos.EmpresaEnergiaRenovables;

public class Molino extends Recurso{
	
	private int velocidad;
	private double  capacidadGenerada;
	
	public Molino(String id) {
		super(id );

		
	}
	
	
	public int getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}
	
	public double calculoEnergiaMolino(int velocidad , double capacidadGenerada) {
		
		double energiaGenerada = velocidad * capacidadGenerada ; 
		//System.out.println("Con velocidad de viento de "+velocidad+" km/h ,la capacidad generada de "+capacidadGenerada+
		//		" da resultado de una energia generada de "+energiaGenerada);
		return energiaGenerada ;
		
	}

	
	

	

}
