package unidad9.ejemplos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestOrdenJugadorComparator {

	public static void main(String[] args) {
	
		
		List<Jugador> equipo = new ArrayList<Jugador>();
		
		
		Jugador jugador1 = new Jugador(59 ,28 , "Juan");
		Jugador jugador2 = new Jugador(67 ,22 , "Rebeca");
		Jugador jugador3 = new Jugador(45 ,24 , "Sandra");

		
		equipo.add(jugador1);
		equipo.add(jugador2);
		equipo.add(jugador3);
		
		System.out.println(equipo);
		
		ComparatorRankingJugador  comparatorRanking = new ComparatorRankingJugador();
		Collections.sort(equipo ,comparatorRanking);
		
		
	}

}
