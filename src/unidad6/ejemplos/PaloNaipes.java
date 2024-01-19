package unidad6.ejemplos;

public enum PaloNaipes {
	
	PALO_PICAS("Picas") , PALO_CORAZONES("Corazones"), PALO_TREBOLES("Treboles"),PALO_DIAMANTES("Diamantes");
	
	private final String nombre;
	
	private PaloNaipes(String nombre) {
		this.nombre = nombre;
	}
	
	
	public String getNombre() {
		return nombre;
		
	}

}
