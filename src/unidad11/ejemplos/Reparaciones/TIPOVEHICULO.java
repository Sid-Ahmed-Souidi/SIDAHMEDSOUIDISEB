package unidad11.ejemplos.Reparaciones;

public enum TIPOVEHICULO {
	
	COCHE("Coche"), MOTO("Moto"),CAMION("Camión");
	
	private final String nombre;
	
	private TIPOVEHICULO(String nombre) {
		this.nombre=nombre;
	}
	
	public String getNombre() {
		return nombre;
		
	}
	

}
