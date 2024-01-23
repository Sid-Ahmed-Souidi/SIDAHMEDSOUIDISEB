package unidad6.ejemplos;

public class JuegoCartas {

	public static final int PALO_PICAS = 0;
	public static final int PALO_CORAZONES = 1;
	public static final int PALO_TREBOLES = 2;
	public static final int PALO_DIAMANTES = 3;


	private int palo ;
	private int puntos;
	
	public JuegoCartas(int palo , int puntos) {
		this.palo = palo;
		this.puntos = puntos;

		
	}
	
		
	
	//SET Y GET

	public int getPalo() {
		return palo;
	}

	public void setPalo(int palo) {
		this.palo = palo;
	}

	public int getPuntos() {
		return puntos;
	}

	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}

	public static int getPaloPicas() {
		return PALO_PICAS;
	}

	public static int getPaloCorazones() {
		return PALO_CORAZONES;
	}

	public static int getPaloTreboles() {
		return PALO_TREBOLES;
	}

	public static int getPaloDiamantes() {
		return PALO_DIAMANTES;
	}


	
	public String getNombrePalo() {
		
		String nombre ="";
		switch(palo){
			case PALO_PICAS:
				nombre = "Picas";
				break;
			case PALO_CORAZONES:
				nombre = "Picas";
				break;
			case PALO_TREBOLES:
				nombre = "Picas";
				break;
			case PALO_DIAMANTES:
				nombre = "Picas";
				break;
			default :
				System.out.println("Palo invalido");
				break;
				
		
		}return nombre;
			
		
	}
	
	
	
}
