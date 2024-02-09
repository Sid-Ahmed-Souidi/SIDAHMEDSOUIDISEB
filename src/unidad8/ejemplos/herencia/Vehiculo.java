package unidad8.ejemplos.herencia;

public class Vehiculo {
	
	protected String matricula;
	protected String bastidor;
	protected String marca;
	protected String modelo;
	protected Motor motor;
	
	
	// constructor
	public Vehiculo(String matricula, String bastidor, String marca, String modelo, Motor motor) {
		super();
		this.matricula = matricula;
		this.bastidor = bastidor;
		this.marca = marca;
		this.modelo = modelo;
		this.motor = motor;
	}

	
	
	
	// getter y setters
	
	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getBastidor() {
		return bastidor;
	}

	public void setBastidor(String bastidor) {
		this.bastidor = bastidor;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Motor getMotor() {
		return motor;
	}

	public void setMotor(Motor motor) {
		this.motor = motor;
	}
	
	
	
	

}
