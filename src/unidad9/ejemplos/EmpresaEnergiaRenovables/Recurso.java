package unidad9.ejemplos.EmpresaEnergiaRenovables;

import java.time.LocalDate;

public  class Recurso {
	
	private String id ;
	private double capacidad ;
	
	
	public Recurso(String id ) {
		super();
		setId(id);

	}

	public String getId() {
		return id;
	}


	public void setId(String id) {
		// comprobar la validacion
		if(id.matches("[0-9]{5}-[A-z]{3}")) {
			this.id = id;

		}else{
			
			System.out.println("Formato erroneo");
			this.id = " ";
		}
		
		
		
	}


	public double getCapacidad() {
		return capacidad;
	}


	public void setCapacidad(double capacidad) {
		this.capacidad = capacidad;
	} 
	
	
	
}
