package unidad9.ejemplos.EmpresaEnergiaRenovables;

import java.util.ArrayList;
import java.util.List;

import unidad9.ejemplos.ExplotacionGanadera.Revision;

public class Planta {
	
	private String id ;
	private String nombre ;
	private TIPO_PLANTA tipo;
	private List<Recurso> recursos;
	
	
	
	public Planta(String id, String nombre, TIPO_PLANTA tipo) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.tipo = tipo;
	
	}



	public String getId() {
		return id;
	}



	public void setId(String id) {
		this.id = id;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public TIPO_PLANTA getTipo() {
		return tipo;
	}



	public void setTipo(TIPO_PLANTA tipo) {
		
		this.tipo = tipo;
	}



	public void addRecurso(Recurso recurso) {
		
		boolean registro=false;
		
		if(tipo.equals(TIPO_PLANTA.PLACA) && recurso instanceof Placa) {
			recurso.setId(recurso.getId()+"-"+nombre.substring(0, 3).toUpperCase()); //1000-NAV
			recursos.add(recurso);
			registro = true;
			
		}
		if(tipo.equals(TIPO_PLANTA.MOLINO) && recurso instanceof Molino) {
			recurso.setId(recurso.getId()+"-"+nombre.substring(0, 3).toUpperCase()); //1000-NAV
			recursos.add(recurso);
			registro = true;
			
		}
		
		if(registro) {
			System.out.println("Se ha registrado correctamente");
		}else {
			System.out.println("No se ha podido registrar el recurso en la planta");
		}
		
		
	}



	public List<Recurso> getRecursos() {
		return recursos;
	}



	public void setRecursos(List<Recurso> recursos) {
		this.recursos = recursos;
	}
	
	
	
	
	
	
	
	
	
	
	
	

	
	
	
	
	
	
	
	
	

}
