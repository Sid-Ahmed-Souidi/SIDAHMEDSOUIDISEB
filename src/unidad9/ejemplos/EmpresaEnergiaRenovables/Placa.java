package unidad9.ejemplos.EmpresaEnergiaRenovables;

public class Placa extends Recurso{
	
	private int eficiencia;
	private String orientacion;
	
	
	public Placa(String id,  String orientacion) {
		super(id);
		this.eficiencia = eficiencia;
		this.orientacion = orientacion;
		
	}

	

	public int getEficiencia() {
		return eficiencia;
	}


	public void setEficiencia(int eficiencia) {
		this.eficiencia = eficiencia;
	}


	public String getOrientacion() {
		return orientacion;
	}


	public void setOrientacion(String orientacion) {
		this.orientacion = orientacion;
	}
	
	
	

	
	
	
	

}
