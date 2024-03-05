package unidad9.ejemplos.colecciones.listas.Ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class AñadirCompañero {

	public static void main(String[] args) {
		
		
		Compañero compañero1 = new Compañero("Salama");
		Compañero compañero2 = new Compañero("Buker");
		Compañero compañero3 = new Compañero("Jorge");
		Compañero compañero4 = new Compañero("Justin");
		Compañero compañero5 = new Compañero("Miguel");
		
		
		List<Compañero>ListaCompañeros = new ArrayList<Compañero>();
		ListaCompañeros.add(compañero1);
		ListaCompañeros.add(compañero2);
		ListaCompañeros.add(compañero3);	
		ListaCompañeros.add(compañero4);
		// Ejercicio 2 
		ListaCompañeros.add(4,compañero5);

		System.out.println("Lista de Compañeros");
		System.out.println(ListaCompañeros);
	
	
	}

}
