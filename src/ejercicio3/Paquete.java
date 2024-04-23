package ejercicio3;

public class Paquete {
	
	private String ide ;
	private double peso;
	private String fecha;
	
	
	// paquete donde vamos a pasarlo a la lista de pedidos
	public Paquete(String ide, double peso, String fecha) {
		super();
		this.ide = ide;
		this.peso = peso;
		this.fecha = fecha;
	}
	
	
	

	public String getIde() {
		return ide;
	}

	public void setIde(String ide) {
		this.ide = ide;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}




	@Override
	public String toString() {
		return "Paquete [ide=" + ide + ", peso=" + peso + ", fecha=" + fecha + "]";
	}
	
	
    
	
	
	
	

}
