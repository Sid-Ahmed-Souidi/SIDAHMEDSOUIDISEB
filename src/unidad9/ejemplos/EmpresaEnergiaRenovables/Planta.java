package unidad9.ejemplos.EmpresaEnergiaRenovables;

import java.util.ArrayList;
import java.util.List;

import unidad9.ejemplos.ExplotacionGanadera.Revision;

public class Planta {
	
	private String id ;
	private String nombre ;
	private TIPO_PLANTA tipo;
	private List<Recurso> recursos;
	private double energiaPlantaSolar;
	private double energiaPlantaEolica;
	
	
	
	public Planta(String id, String nombre, TIPO_PLANTA tipo) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.tipo = tipo;
		this.recursos = new ArrayList<Recurso>();
	
	}



	public double getEnergiaPlantaSolar() {
		return energiaPlantaSolar;
	}



	public void setEnergiaPlantaSolar(double energiaPlantaSolar) {
		this.energiaPlantaSolar = energiaPlantaSolar;
	}



	public double getEnergiaPlantaEolica() {
		return energiaPlantaEolica;
	}



	public void setEnergiaPlantaEolica(double energiaPlantaEolica) {
		this.energiaPlantaEolica = energiaPlantaEolica;
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


	public List<Recurso> getRecursos() {
		return recursos;
	}



	public void setRecursos(List<Recurso> recursos) {
		this.recursos = recursos;
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


	public double energiaGeneradaPlanta(double energiaGenerada ,Recurso recurso) {

		
		if(tipo.equals(TIPO_PLANTA.PLACA) &&  recurso instanceof Placa) {
		 energiaPlantaSolar += energiaGenerada;
		return energiaPlantaSolar ;
		}
		else if(tipo.equals(TIPO_PLANTA.MOLINO) && recurso instanceof Molino) {
			 energiaPlantaEolica += energiaGenerada;
			return energiaPlantaEolica ;
		}

		else {
			System.out.println("Error la planta no es del mismo tipo que el recurso");
			
			return 0.0;
		}
	}

	
		public double energiaComunidad() {
			double energiaComunidad = energiaPlantaSolar+energiaPlantaEolica;
			return  energiaComunidad; 


		}

	}

	
	
	
	
	
	
	
	
	

	
	
	
	
	
	
	
	
	


