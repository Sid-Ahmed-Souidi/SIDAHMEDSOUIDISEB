package Ejercicio2;

public class Terrestres extends Vehiculo{
	
	
	private int numRueda ;

	public Terrestres(String matricula, String modelo , int numRueda) {
		super(matricula, modelo);
		this.numRueda = numRueda;
	}
	
	
	
	

	public int getNumRueda() {
		return numRueda;
	}

	@Override
	public boolean validarMatricula(String matricula) {
		
		if(matricula.matches("\\d{4}[a-zA-Z]{3}")) {
			return true;
		}
		System.out.println("Error de validacion");
		return false;
		
	}





	@Override
	public String toString() {
		return "Terrestres [numRueda=" + numRueda + ", getMatricula()=" + getMatricula() + ", getModelo()="
				+ getModelo() + "]";
	}
	
	
	
	

}
