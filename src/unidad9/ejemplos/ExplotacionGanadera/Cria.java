package unidad9.ejemplos.ExplotacionGanadera;

import java.time.LocalDate;
import java.util.List;

public class Cria extends Animal {

	
	private int numReproducciones ; 

	public Cria(LocalDate camada, int ide, String nombre, SEXO sexo, TIPO_ANIMAL tipoAnimal, List<Revision> revisiones,
			boolean cuidado) {
		super(camada, ide, nombre, sexo, tipoAnimal, revisiones, cuidado);
		this.numReproducciones =  numReproducciones;
	 	
		
	}

	public int getNumReproducciones() {
		return numReproducciones;
	}

	public void setNumReproducciones(int numReproducciones) {
		this.numReproducciones = numReproducciones;
	}

	
	
	
	
	
}
