package Examenes.tercerExamen.Ejercicio3;

public class Acuarticos extends Dinosaurio{
	
	private boolean bucear;
	private int distancia; 
	private int velocidad;
	
	public Acuarticos(String id, int edad, int altura, String tipoSangre, String dieta, boolean monoEspecie) {
		super(id, edad, altura, tipoSangre, dieta, monoEspecie);
		this.bucear = bucear;
		this.distancia = distancia;
		this.velocidad = velocidad;

	}

	public boolean isBucear() {
		return bucear;
	}

	public void setBucear(boolean bucear) {
		this.bucear = bucear;
	}

	public int getDistancia() {
		return distancia;
	}

	public void setDistancia(int distancia) {
		this.distancia = distancia;
	}

	public int getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}

	@Override
	public String toString() {
		return "Acuarticos [bucear=" + bucear + ", distancia=" + distancia + ", velocidad=" + velocidad + ", getId()="
				+ getId() + ", getEdad()=" + getEdad() + ", getAltura()=" + getAltura() + ", getTipoSangre()="
				+ getTipoSangre() + ", getDieta()=" + getDieta() + ", isMonoEspecie()=" + isMonoEspecie()
				+ ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}

	
	

	
	

}
