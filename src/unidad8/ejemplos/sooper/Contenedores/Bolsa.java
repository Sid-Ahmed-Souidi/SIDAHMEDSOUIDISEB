package unidad8.ejemplos.sooper.Contenedores;

import unidad8.ejemplos.sooper.Enum.TipoContenedor;

public class Bolsa extends Contenedores{
	
	private double resistenciaMaxima;

	public Bolsa(String referencia, int alto , int ancho , double resistenciaMaxima) {
		super(referencia, alto , ancho);
		this.resistenciaMaxima= resistenciaMaxima;
	}

	
	public double getResistenciaMaxima() {
		return resistenciaMaxima;
	}

	public void setResistenciaMaxima(double resistenciaMaxima) {
		this.resistenciaMaxima = resistenciaMaxima;
	}

	
	public TipoContenedor getTipo() {
		
		return TipoContenedor.BOLSA; 
	}
	

	
	
	
	

}
