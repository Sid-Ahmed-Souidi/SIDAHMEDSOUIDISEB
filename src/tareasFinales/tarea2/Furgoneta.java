package tareasFinales.tarea2;

public class Furgoneta  extends VehiculosCarga{

	
	
	
	public Furgoneta(String numMatricula, double PMA) {
		super(numMatricula, PMA);
		
	}

	@Override
	public String toString() {
		return "Furgoneta [PRECIO_POR_TONELADA_PMA=" + PRECIO_POR_TONELADA_PMA + ", PMA=" + PMA + ", numMatricula="
				+ numMatricula + "]";
	}


	
}
