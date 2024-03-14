package unidad9.ejemplos.EmpresaEnergiaRenovables;

public class Placa extends Recurso{
	
	private int eficiencia;
	private  ORIENTACIONES orientacion;
	private double capacidadGenerada;
	
	
	
	public Placa(String id,  ORIENTACIONES orientacion) {
		super(id);
		this.orientacion = orientacion;
		
	}

	

	public int getEficiencia() {
		return eficiencia;
	}


	public void setEficiencia(int eficiencia) {
		this.eficiencia = eficiencia;
	}


	public ORIENTACIONES getOrientacion() {
		return orientacion;
	}


	public void setOrientacion(ORIENTACIONES orientacion) {
		this.orientacion = orientacion;
	}
	
	
	public double getCapacidadGenerada() {
		return capacidadGenerada;
	}



	public void setCapacidadGenerada(double capacidadGenerada) {
		this.capacidadGenerada = capacidadGenerada;
	}



	public double calculoEnergiaPlaca(double eficiencia , double capacidadGenerada) {
		
		
		double eficiencia1 = eficiencia / 100;
		double energiaWp1 = capacidadGenerada / 1000000;
		
		double energiaGenerada = capacidadGenerada * eficiencia1 ; 
		//System.out.println("Con una eficiencia del"+eficiencia+" % y una energia en vatios pico de "+capacidadGenerada+
		//		"una energia generada de "+energiaGenerada);
		return energiaGenerada;
	}

	

}
