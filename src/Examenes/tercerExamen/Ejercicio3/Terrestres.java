package Examenes.tercerExamen.Ejercicio3;

public class Terrestres extends Dinosaurio{
	private boolean predador;
	private int cantidad;
	private int distancia;

	

	public Terrestres(String id, int edad, int altura, String tipoSangre, String dieta, boolean monoEspecie) {
		super(id, edad, altura, tipoSangre, dieta, monoEspecie);
		this.predador = predador;
		this.cantidad = cantidad;
		this.distancia = distancia; 
	}



	public boolean isPredador() {
		return predador;
	}



	public void setPredador(boolean predador) {
		this.predador = predador;
	}



	public int getCantidad() {
		return cantidad;
	}



	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}



	public int getDistancia() {
		return distancia;
	}



	public void setDistancia(int distancia) {
		this.distancia = distancia;
	}



	@Override
	public String toString() {
		return "Terrestres [predador=" + predador + ", cantidad=" + cantidad + ", distancia=" + distancia + ", getId()="
				+ getId() + ", getEdad()=" + getEdad() + ", getAltura()=" + getAltura() + ", getTipoSangre()="
				+ getTipoSangre() + ", getDieta()=" + getDieta() + ", isMonoEspecie()=" + isMonoEspecie()
				+ ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}
	
	

}
