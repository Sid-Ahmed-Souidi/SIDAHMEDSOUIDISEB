package unidad9.ejemplos.eventos2;

import java.time.LocalDate;

public class Conferencia extends Evento {

	private String tema;
	
	
	public Conferencia(String nombre, LocalDate fecha, int duracionEnHoras, String tema) {
		super(nombre, fecha, duracionEnHoras );
		this.tema = tema;
	}
	
	
	@Override
	public String toString() {
		
		return "Conferencia "+ super.toString();
	}

}
