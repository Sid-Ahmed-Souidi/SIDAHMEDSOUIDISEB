package Ejercicio2;

public class Motos extends Terrestres{

	
	private String color;
	
	
	public Motos(String matricula, String modelo, int numRueda , String color) {
		super(matricula, modelo, numRueda);
		this.color = color;

	}


	public String isColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	@Override
	public String toString() {
		return "Motos [motor=" + color + ", getNumRueda()=" + getNumRueda() + ", getMatricula()=" + getMatricula()
				+ ", getModelo()=" + getModelo() + "]";
	}
	
	
	
	
	
	

}
