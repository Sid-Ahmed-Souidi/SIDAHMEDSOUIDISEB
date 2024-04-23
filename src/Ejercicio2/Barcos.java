package Ejercicio2;

public class Barcos extends Acuaticos{

	
	
	private boolean motor;

	
	public Barcos(String matricula, String modelo, int eslora , boolean motor) {
		super(matricula, modelo, eslora);
		this.motor = motor; 
		
	}

	public boolean isMotor() {
		return motor;
	}


	public void setMotor(boolean motor) {
		this.motor = motor;
	}


	@Override
	public String toString() {
		return "Barcos [motor=" + motor + ", getEslora()=" + getEslora() + ", getMatricula()=" + getMatricula()
				+ ", getModelo()=" + getModelo() + "]";
	}
	
	
	
	

	
	

}
