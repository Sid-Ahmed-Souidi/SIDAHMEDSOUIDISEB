package tareasFinales.panelSolar;

import java.util.ArrayList;
import java.util.List;

import pruebas.evaluacion3.pruebas2.Certificado;

public class gestionPlacaSolares {
	
    public static List<PlacaSolar> panelSolares = new ArrayList<PlacaSolar>();
    /**
	private String id;
	private double acimut;
	private double elevacion;
	private double potencia;
	private boolean averiado;
	private boolean alineado;
	*/

	public static void main(String[] args) {
		
		PlacaSolar placa = new PlacaSolar("01",true,false);
		PlacaSolar placa2 = new PlacaSolar("02",true,false);
		PlacaSolar placa3 = new PlacaSolar("03",true,false);
		PlacaSolar placa4 = new PlacaSolar("04",true,false);
		
		panelSolares.add(placa);
		panelSolares.add(placa2);
		panelSolares.add(placa3);
		panelSolares.add(placa4);
		
		
		
		
		
		
		
		
		



		
		
	}

}
