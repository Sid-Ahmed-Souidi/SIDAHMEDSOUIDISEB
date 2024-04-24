package pruebas.evaluacion2.recuperacion.Ejercicio3;

public class Voladores extends Dinosaurio{
	private boolean migraciones ;
	private int alturaMaxima ;
	private int huevos;
	
	public Voladores(String id, int edad, int altura, String tipoSangre, String dieta, boolean monoEspecie) {
		super(id, edad, altura, tipoSangre, dieta, monoEspecie);
		this.migraciones = migraciones;
		this.alturaMaxima = alturaMaxima;
		this.huevos = huevos;
		}

	public boolean isMigraciones() {
		return migraciones;
	}

	public void setMigraciones(boolean migraciones) {
		this.migraciones = migraciones;
	}

	public int getAlturaMaxima() {
		return alturaMaxima;
	}

	public void setAlturaMaxima(int alturaMaxima) {
		this.alturaMaxima = alturaMaxima;
	}

	public int getHuevos() {
		return huevos;
	}

	public void setHuevos(int huevos) {
		this.huevos = huevos;
	}

	@Override
	public String toString() {
		return "Voladores [migraciones=" + migraciones + ", alturaMaxima=" + alturaMaxima + ", huevos=" + huevos
				+ ", getId()=" + getId() + ", getEdad()=" + getEdad() + ", getAltura()=" + getAltura()
				+ ", getTipoSangre()=" + getTipoSangre() + ", getDieta()=" + getDieta() + ", isMonoEspecie()="
				+ isMonoEspecie() + ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}

	
		
		
	
	
	
	

}
