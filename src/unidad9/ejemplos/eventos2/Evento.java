 package unidad9.ejemplos.eventos2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Evento implements Asistible {

	private String nombre;
	private LocalDate fecha;
	private int duracionEnHoras;
	private List<String> asistentes;
	
	
	
	
	
	
	public Evento(String nombre, LocalDate fecha, int duracionEnHoras) {
		super();
		this.nombre = nombre; // nombre del evento
		this.fecha = fecha;
		this.duracionEnHoras = duracionEnHoras;
		this.asistentes = new ArrayList<String>();// nombre de los asistentes
	}

	
	
	
	
	
	@Override
	public void registrarAsistente(String nombre) {

		if(esNombreValido(nombre)) {
			if(esAsistenteRegistrado(nombre)) {
				asistentes.add(nombre);
				System.out.println(nombre +"registrado como asistente en "+ this.nombre);
				
			}else {
				System.out.println(nombre +" ya esta registrado como asistente en "+ this.nombre);
			}
			
		}else {
			System.out.println("Nombre incorrecto");
		}
	}

	private boolean esNombreValido(String nombre2) {
		String patroValido= "[A-Z][a-z]*";
		return nombre.matches(patroValido);

	}

	@Override
	public void cancelarRegistroAsistente(String nombre) {
		asistentes.remove(nombre);
		System.out.println(nombre +"Ha cancelado su registro en: "+this.nombre );
		
	}

	@Override
	public boolean esAsistenteRegistrado(String nombre) {
					
		return asistentes.contains(nombre);
	}

	@Override
	public List<String> obtenerListaAsistentes() {
    // de esta forma damos una copia de los datos originales
	return new ArrayList<>(asistentes);
	}

	@Override
	public void limpiarListaAsistente() {
		asistentes.clear();
		System.out.println("Lista de aistentes en "+this.nombre+" ha sido limpiada");
	}

	
	
	
	
	
	
	// getter y seters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public int getDuracionEnHoras() {
		return duracionEnHoras;
	}

	public void setDuracionEnHoras(int duracionEnHoras) {
		this.duracionEnHoras = duracionEnHoras;
	}

	public List<String> getAsistentes() {
		return asistentes;
	}

	public void setAsistentes(List<String> asistentes) {
		this.asistentes = asistentes;
	}
	
	
	
	
	
	
	@Override
	public String toString() {
		String informacion = "Nombre del evento :"+this.nombre+"\n"+
			" fecha :"+this.fecha+"\n"+
		   " duracion en horas : "+this.duracionEnHoras+"\n"+
			"Asistentes :";
	
				int size = asistentes.size();
				    for (int i = 0; i < size; i++) {
				        informacion += asistentes.get(i);
				        if (i < size - 1) {
				            informacion += ", ";
				        }
				    }


			return informacion;
}
	
	
	
}