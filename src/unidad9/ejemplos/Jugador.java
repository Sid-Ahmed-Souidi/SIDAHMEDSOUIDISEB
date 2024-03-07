package unidad9.ejemplos;

public class Jugador {
	
	private int Edad;
	private int ranking;
	private String nombre;
	
	
	
	public Jugador(int edad, int ranking, String nombre) {
		super();
		Edad = edad;
		this.ranking = ranking;
		this.nombre = nombre;
	}



	public int getEdad() {
		return Edad;
	}



	public void setEdad(int edad) {
		Edad = edad;
	}



	public int getRanking() {
		return ranking;
	}



	public void setRanking(int ranking) {
		this.ranking = ranking;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	

}
