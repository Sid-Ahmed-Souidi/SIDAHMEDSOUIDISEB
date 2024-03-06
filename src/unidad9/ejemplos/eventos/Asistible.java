package unidad9.ejemplos.eventos;

import java.util.List;

public interface Asistible {
	
	void registrarAsistente(String nombre);
	void cancelarRegistroAsistente(String nombre);
	boolean esAsistenteRegistrado(String nombre);
	List<String> obtenerListaAsistentes();
	void limpiarListaAsistente();
}
