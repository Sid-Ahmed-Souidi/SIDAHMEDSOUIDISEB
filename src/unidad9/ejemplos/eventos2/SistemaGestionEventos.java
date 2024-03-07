package unidad9.ejemplos.eventos2;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class SistemaGestionEventos {
	public static Map<Integer, Evento> conjuntoEventos = new HashMap<Integer, Evento>();
	public static void main(String[] args) {
		
		

		//aqui crearemos los eventos
		Taller taller1 = new Taller("Pintura" ,pasarFecha("2024-03-03") ,2,"PACO");
		Conferencia conferencia1 = new Conferencia("Politica" ,pasarFecha("2024-05-03") ,2,"Amnistía");
		
		conjuntoEventos.put(1,taller1);
		conjuntoEventos.put(2,conferencia1);
	
		taller1.registrarAsistente("Sid");
		conferencia1.registrarAsistente("Paco");
		taller1.registrarAsistente("Salama");
		conferencia1.registrarAsistente("buker");
		taller1.registrarAsistente("sergio");
		conferencia1.registrarAsistente("manuel");
		taller1.registrarAsistente("adrian");
		conferencia1.registrarAsistente("alberto");
		mostrarMapa(conjuntoEventos);
	}
	
	
	private static void  mostrarMapa(Map<Integer, Evento> conjuntoEventos2) {
		for(Integer  evento : conjuntoEventos2.keySet()) {
			System.out.println("clave: "+evento+" -evento: "+conjuntoEventos2.get(evento).toString());
		}
		
	}



	private static LocalDate pasarFecha(String string) {
	
		LocalDate fecha = LocalDate.parse(string);
		return fecha;
	}

	
	
	
}
