package comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestOrdenJugadorComparator {

	public static void main(String[] args) {
	
		
		List<Jugador> equipo = new ArrayList<Jugador>();
		
		
		Jugador messi = new Jugador(36 ,1 , "messi");
		Jugador cristiano = new Jugador(38 ,2 , "cristiano");
		Jugador neymar = new Jugador(31 ,3 , "neymar");
		Jugador hazard = new Jugador(33 ,4 , "hazard");

		
		equipo.add(messi);
		equipo.add(neymar);
		equipo.add(cristiano);
		equipo.add(hazard);

		
		System.out.println(equipo);
		
		ComparatorRankingJugador  comparatorRanking = new ComparatorRankingJugador();
		Collections.sort(equipo ,comparatorRanking);
		System.out.println("De forma ascendiente ");
		System.out.println(equipo);
		System.out.println();
        Collections.sort(equipo, comparatorRanking.reversed());
		System.out.println("De forma descendiente ");
		System.out.println(equipo);

		
	}

}
