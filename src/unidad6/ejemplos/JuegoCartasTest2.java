package unidad6.ejemplos;

public class JuegoCartasTest2 {

	public static void main(String[] args) {
	JuegoCartas2 carta = new JuegoCartas2(Palo.PALO_DIAMANTES , 7) ;
	
	System.out.println("La carta es el "+carta.getPuntos()+"de"+carta.getNombrePalo());
	
	
	// Importante gracias a Enum no se puede pasar un entero;
	//JuegoCartas2 carta = new JuegoCartas2(47 , 7) ;

	}

}
