package tareasFinales.talleresVehiculos;

import java.util.ArrayList;
import java.util.List;

public class Coche {
	
	private String matricula;
	private String direccion;
	private static List<Reparacion> listaReparaciones;
	
	
	
	public Coche(String matricula, String direccion ) {
		super();
		validacion(matricula);
		this.direccion = direccion;
		this.listaReparaciones = new ArrayList<Reparacion>();

	}
	
	

	
	
	
	public static  Reparacion  Reparacion(Reparacion reparacion) {
		  
		  Reparacion ultimaReparacion = listaReparaciones.get(listaReparaciones.size() - 1);
		  
		  if(ultimaReparacion.getKilometraje()> reparacion.getKilometraje()) {
			  System.out.println("Error de kilometraje");
		  }else return reparacion;

		  return reparacion;
		
	}
	
	

	private String validacion(String matricula) {
		
		if (matricula.matches("\\d{4}[A-Z]{3}") || matricula.matches("[A-Z]{1}\\d{4}[A-Z]{2}")) {
			return matricula;
		
		}else  return "Formato erróneo ";
		
	}



	public String getMatricula() {
		return matricula;
	}



	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}



	public String getDireccion() {
		return direccion;
	}



	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}




	
	
	
	
	

}
