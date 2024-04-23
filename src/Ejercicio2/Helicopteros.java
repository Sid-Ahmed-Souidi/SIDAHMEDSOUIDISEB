package Ejercicio2;

public class Helicopteros extends Aereos{
	
	
	private int numHelices;

	public Helicopteros(String matricula, String modelo, int numAsientos , int numHelices) {
		super(matricula, modelo, numAsientos);
		this.numHelices= numHelices;
		
	}

	public int getNumHelices() {
		return numHelices;
	}

	public void setNumHelices(int numHelices) {
		this.numHelices = numHelices;
	}

	@Override
	public String toString() {
		return "Helicopteros [numHelices=" + numHelices + ", getNumAsientos()=" + getNumAsientos() + ", getMatricula()="
				+ getMatricula() + ", getModelo()=" + getModelo() + "]";
	}
	
	

}
