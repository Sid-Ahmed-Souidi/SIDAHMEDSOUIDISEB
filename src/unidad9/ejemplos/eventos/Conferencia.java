package unidad9.ejemplos.eventos;

import java.time.LocalDate;

public class Conferencia extends Evento {

	private String tema;
	
	
	public Conferencia(String nombre, LocalDate fecha, int duracionEnHoras, String tema) {
		super(nombre, fecha, duracionEnHoras );
		this.tema = tema;
	}

}
