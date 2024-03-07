package unidad9.ejemplos.eventos2;

import java.time.LocalDate;

public class Taller extends Evento {

	private String instructor;
	
	public Taller(String nombre, LocalDate fecha, int duracionEnHoras , String instructor) {
		super(nombre, fecha, duracionEnHoras);
		this.instructor = instructor;
	}
	
	
	@Override
	public String toString() {
		
		return "Taller " + super.toString();
	}

}
