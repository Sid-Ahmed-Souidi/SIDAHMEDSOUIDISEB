package Ejercicio2;

public  class Coches extends Terrestres{
	
	private boolean acondicionado;

	public Coches(String matricula, String modelo, int numRueda , boolean acondicionado) {
		super(matricula, modelo, numRueda);
		this.acondicionado=acondicionado;
		
	}

	public boolean isAcondicionado() {
		return acondicionado;
	}

	public void setAcondicionado(boolean acondicionado) {
		this.acondicionado = acondicionado;
	}

	@Override
	public String toString() {
		return "Coches [acondicionado=" + acondicionado + ", getNumRueda()=" + getNumRueda() + ", getMatricula()="
				+ getMatricula() + ", getModelo()=" + getModelo() + "]";
	}
	
	
	
	
	
	
	
	
	
	

}
