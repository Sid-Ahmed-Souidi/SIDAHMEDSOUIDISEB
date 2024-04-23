package Ejercicio2;

public class Aviones extends Aereos{
	
	private int tiempoVuelo;

	public Aviones(String matricula, String modelo, int numAsientos , int tiempoVuelo) {
		super(matricula, modelo, numAsientos);
		this.tiempoVuelo = tiempoVuelo;
		
	}

	public int getTiempoVuelo() {
		return tiempoVuelo;
	}

	public void setTiempoVuelo(int tiempoVuelo) {
		this.tiempoVuelo = tiempoVuelo;
	}

	@Override
	public String toString() {
		return "Aviones [tiempoVuelo=" + tiempoVuelo + ", getNumAsientos()=" + getNumAsientos() + ", getMatricula()="
				+ getMatricula() + ", getModelo()=" + getModelo() + "]";
	}
	
	

}
