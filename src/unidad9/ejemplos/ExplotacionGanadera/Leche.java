package unidad9.ejemplos.ExplotacionGanadera;

import java.time.LocalDate;
import java.util.List;

public class Leche  extends Animal{
	
	
	private int numLitros;
	private int edad;

	public Leche(LocalDate camada, int ide, String nombre, SEXO sexo, TIPO_ANIMAL tipoAnimal,LocalDate fechaVacunacion, List<Revision> revisiones,
			boolean cuidado) {
		super(camada, ide, nombre, sexo, tipoAnimal,fechaVacunacion, revisiones, cuidado);
		this.numLitros = numLitros;
		this.edad = edad;
		
		}

	public int getNumLitros() {
		return numLitros;
	}

	public void setNumLitros(int numLitros) {
		this.numLitros = numLitros;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	
	
}
