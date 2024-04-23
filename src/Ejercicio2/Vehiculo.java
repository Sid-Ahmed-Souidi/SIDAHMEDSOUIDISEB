package Ejercicio2;

public abstract class Vehiculo {
	
	private String matricula;
	private String modelo;
	
	
	// desde la clase padre hacemos que se valide la matricula 
	public Vehiculo(String matricula, String modelo) {
		super();
		if(validarMatricula(matricula)) {
		this.matricula = matricula;
		}else {
            throw new IllegalArgumentException("Matrícula inválida para este tipo de vehículo.");

		}
		this.modelo = modelo;
	}

	public String getMatricula() {
		return matricula;
	}
	
	public String getModelo() {
		return modelo;
	}
	
	
	public abstract boolean validarMatricula(String matricula);
	
	
	
	
	
	

}
