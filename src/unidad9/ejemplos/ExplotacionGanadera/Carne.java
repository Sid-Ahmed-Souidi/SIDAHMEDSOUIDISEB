package unidad9.ejemplos.ExplotacionGanadera;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Carne extends Animal {
	
	
	private int canComer;
	private Map<TIPO_ALIMENTO,Integer> tipoAlimentacion ;

	
	public Carne(LocalDate camada, int ide, String nombre, SEXO sexo, TIPO_ANIMAL tipoAnimal, List<Revision> revisiones,
			boolean cuidado) {
		super(camada, ide, nombre, sexo, tipoAnimal, revisiones, cuidado);
		this.canComer = canComer;
		this.tipoAlimentacion = new HashMap<TIPO_ALIMENTO,Integer>();
		
	}

	

	public int getCanComer() {
		return canComer;
	}


	public void setCanComer(int canComer) {
		this.canComer = canComer;
	}


	public Map<TIPO_ALIMENTO, Integer> getTipoAlimentacion() {
		return tipoAlimentacion;
	}


	public void setTipoAlimentacion(Map<TIPO_ALIMENTO, Integer> tipoAlimentacion) {
		this.tipoAlimentacion = tipoAlimentacion;
	}

	
		
	
	

}
