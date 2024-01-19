package unidad6.ejemplos;

public class JuegoCartasTest3 {

	public static void main(String[] args) {
		
		JuegoCartas3 carta = new JuegoCartas3(PaloNaipes.PALO_PICAS , 6);

		System.out.println("La carta es el "+carta.getPuntos()+" de "+carta.getPalo().getNombre());
			
		}
	}


