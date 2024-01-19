package unidad6.ejemplos;

public class JuegoCartaTest {

	public static void main(String[] args) {                                             
		
		JuegoCartas carta1 = new JuegoCartas(JuegoCartas.PALO_CORAZONES ,4);
		System.out.println("La carta es "+ carta1.getPuntos()+ "de"+carta1.getNombrePalo());
		
		JuegoCartas carta2 = new JuegoCartas(47 ,4);
		System.out.println("La carta es "+ carta2.getPuntos()+ "de"+carta2.getNombrePalo());
		
		
	}

}
