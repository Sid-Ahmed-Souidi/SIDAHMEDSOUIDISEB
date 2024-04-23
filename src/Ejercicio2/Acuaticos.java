package Ejercicio2;

public class Acuaticos extends Vehiculo{
	
	
	private int eslora;

	public Acuaticos(String matricula, String modelo, int eslora) {
		super(matricula, modelo);
		this.eslora = eslora;
	}
	
	
	

	public int getEslora() {
		return eslora;
	}
	
	

	@Override
	public boolean validarMatricula(String matricula) {
		if(matricula.matches("\\d{3}[a-zA-Z]{10}")) {
			return true;
		}
		System.out.println("Error de validacion");
		return false;
		
	}




	@Override
	public String toString() {
		return "Acuaticos [eslora=" + eslora + ", getEslora()=" + getEslora() + ", getMatricula()=" + getMatricula()
				+ ", getModelo()=" + getModelo() + "]";
	}
	
	
	

}
