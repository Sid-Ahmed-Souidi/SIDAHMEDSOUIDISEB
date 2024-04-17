package unidad11.ejemplos.razasComarcas;

public class Ganado {
	
	private int codigo;
	private String raza_ganado;
    private int numero;
    private int fecha;
    private String zonas;
    
    
    
  
	public Ganado(int codigo, String raza_ganado, int numero, int fecha, String zonas) {
		super();
		this.codigo = codigo;
		this.raza_ganado = raza_ganado;
		this.numero = numero;
		this.fecha = fecha;
		this.zonas = zonas;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getRaza_ganado() {
		return raza_ganado;
	}
	public void setRaza_ganado(String raza_ganado) {
		this.raza_ganado = raza_ganado;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getFecha() {
		return fecha;
	}
	public void setFecha(int fecha) {
		this.fecha = fecha;
	}
	public String getZonas() {
		return zonas;
	}
	public void setZonas(String zonas) {
		this.zonas = zonas;
	}
    
    
    

}
