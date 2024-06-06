package tareasFinales.talleresVehiculos;

import java.util.List;

public class Garaje {
	
	private static List<Coche>  listaCoches;
	
	
	
	
	

	public Garaje() {
		
		super();
	}



	

	public static  Coche   compararCoches(Coche coche ) {
		
		
		boolean encontrado = false;
		for (Coche coche1 : listaCoches) {
			if(coche1.getMatricula().equals(coche) ) {
				System.out.println("Matricula ya existe en el garaje");
				
			}
		
		}
		return coche;  
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
}
