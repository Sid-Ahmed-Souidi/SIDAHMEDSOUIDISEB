package Ejercicio2;

public class Submarinos extends Acuaticos{

	
	private int profundidad;
	
	public Submarinos(String matricula, String modelo , int eslora , int profundidad) {
		super(matricula, modelo ,eslora);
		this.profundidad = profundidad;
	}

	public int getProfundidad() {
		return profundidad;
	}

	public void setProfundidad(int profundidad) {
		this.profundidad = profundidad;
	}

	@Override
	public String toString() {
		return "Submarinos [profundidad=" + profundidad + ", getEslora()=" + getEslora() + ", getMatricula()="
				+ getMatricula() + ", getModelo()=" + getModelo() + "]";
	}
	
	
	
	
	
	

}
