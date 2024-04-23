package Ejercicio2;

public class Aereos extends Vehiculo{

	
	private int numAsientos ;
	
	
	
	public Aereos(String matricula, String modelo, int numAsientos) {
		super(matricula, modelo);
		this.numAsientos = numAsientos;
		
	}

	
	
	
	
	public int getNumAsientos() {
		return numAsientos;
	}





	@Override
	public boolean validarMatricula(String matricula) {
		if(matricula.matches("[a-zA-Z]{4}\\d{6}")) {
			return true;
		}
		System.out.println("Error de validacion");
		return false;
		
	}





	@Override
	public String toString() {
		return "Aereos [numAsientos=" + numAsientos + ", getNumAsientos()=" + getNumAsientos() + ", getMatricula()="
				+ getMatricula() + ", getModelo()=" + getModelo() + "]";
	}
	
	
	

}
