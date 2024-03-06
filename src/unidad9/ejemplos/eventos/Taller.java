package unidad9.ejemplos.eventos;

import java.time.LocalDate;

public class Taller extends Evento {

	
	private String instructor;
	
	public Taller(String nombre, LocalDate fecha, int duracionEnHoras , String instructor) {
		super(nombre, fecha, duracionEnHoras);
		this.instructor = instructor;
	}

}
