package Examenes.tercerExamen.Ejercicio1;

import java.util.Comparator;

public class ComparatorTraficoDireccion implements Comparator<Direccion>{

	


	@Override
	public int compare(Direccion direccion1, Direccion direccion2) {
		return Integer.compare(direccion1.getTrafico(), direccion2.getTrafico());
	}


}
