package unidad8.ejemplos.abstractas;

public abstract class Vehiculo {
	
	
	private String fuenteAlimentacion;
	private int ruedas;
	protected int precio;
	
	
	public Vehiculo(String fuenteAlimentacion ,int ruedas) {
		setFuenteAlimentacion(fuenteAlimentacion);
		setRuedas(ruedas);
		
		
		
	}
	
	
	public String getFuenteAlimentacion() {
		return fuenteAlimentacion;
	}


	public void setFuenteAlimentacion(String fuenteAlimentacion) {
		this.fuenteAlimentacion = fuenteAlimentacion;
		
	}


	public int getRuedas() {
		return ruedas;
	}


	public void setRuedas(int ruedas) {
		if(ruedas>=0) {
			this.ruedas = ruedas;	
		}else {
			ruedas=0;
		}
		
		
	}


	public int getPrecio() {
		return precio;
	}


	
	


	public void saludo() {
		System.out.println("Aplicacion Vehiculos");
	}
	public abstract double precio();
	public abstract double calcEficienciaCarburante();
	public abstract double calcDistanciaViaje();
	
	

}
