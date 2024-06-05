package Examenes.tercerExamen.Ejercicio1;

public class Direccion {
	
	private String direccion;
	private int trafico;
	private int conxion;
	
	
	public Direccion(String direccion, int  trafico, int  conxion) {
		super();
		this.direccion = direccion;
		this.trafico = trafico;
		this.conxion = conxion;
	}
	
	
	


	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	public int  getTrafico() {
		return trafico;
	}


	public void setTrafico(int trafico) {
		this.trafico = trafico;
	}


	public int  getConxion() {
		return conxion;
	}


	public void setConxion(int  conxion) {
		this.conxion = conxion;
	}





	@Override
	public String toString() {
		return "Direccion [direccion=" + direccion + ", trafico=" + trafico + ", conxion=" + conxion + "]";
	}


	
	
	
	
	

}
