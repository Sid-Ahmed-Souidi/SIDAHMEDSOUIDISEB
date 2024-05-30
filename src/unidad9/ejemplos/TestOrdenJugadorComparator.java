package unidad9.ejemplos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestOrdenJugadorComparator {

	public static void main(String[] args) {
	
		
		List<Jugador> equipo = new ArrayList<Jugador>();
		
		
		Jugador messi = new Jugador(36 ,1 , "messi");
		Jugador cristiano = new Jugador(38 ,2 , "cristiano");
		Jugador jugador3 = new Jugador(45 ,24 , "Sandra");

		
		equipo.add(messi);
		equipo.add(jugador3);
		equipo.add(cristiano);
		
		System.out.println(equipo);
		
		ComparatorRankingJugador  comparatorRanking = new ComparatorRankingJugador();
		Collections.sort(equipo ,comparatorRanking);
		System.out.println(equipo);

		
	}

}
