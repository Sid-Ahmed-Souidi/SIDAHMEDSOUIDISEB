package unidad8.ejemplos.herencia;

public class Coche extends Vehiculo {

	private int numPuertas;
	private int numPlazas;
	private int cacidadMaletero;
	private String tipo; 
	
	
	
	public Coche(String matricula, String bastidor, String marca, String modelo, Motor motor) {
		super(matricula, bastidor, marca, modelo, motor);
		// TODO Auto-generated constructor stub
	}
	
	
	public Coche(String matricula, String bastidor, String marca, String modelo, Motor motor,
			int numPuertas,
			int numPlazas,
			int capacidadMaletero,
			String tipo
			){
		super(matricula, bastidor, marca, modelo, motor);
		
			this.numPuertas = numPuertas;
			this.numPlazas = numPlazas;
			this.cacidadMaletero = capacidadMaletero;
			this.tipo = tipo;
	}

	
	// mostrarDatos
		public void mostrarDatos(){
			System.out.println("------Coche---------");
			System.out.println("Marca: "+marca);// hay utilizar el get y set por que son private
			System.out.println("Marca: "+modelo);
			System.out.println("Marca: "+motor.getTipoCombustible());
			System.out.println("Nª Plazas: "+numPlazas);
			
		}
	
		
	//getters and setters
	
	public int getNumPuertas() {
		return numPuertas;
	}

	public void setNumPuertas(int numPuertas) {
		this.numPuertas = numPuertas;
	}

	public int getNumPlazas() {
		return numPlazas;
	}

	public void setNumPlazas(int numPlazas) {
		this.numPlazas = numPlazas;
	}

	public int getCacidadMaletero() {
		return cacidadMaletero;
	}

	public void setCacidadMaletero(int cacidadMaletero) {
		this.cacidadMaletero = cacidadMaletero;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	
	
	
	

}
