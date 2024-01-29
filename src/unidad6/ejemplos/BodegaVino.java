package unidad6.ejemplos;

public class BodegaVino {
	
	// atributos 
	private String tipoUva ;
	private int litros;
	
	
	// constructros
	public BodegaVino(String tipoUva, int litros) {
		
		this.tipoUva = tipoUva;
		this.litros = litros;
		
	}
	//Seters y getters 
	
	public String getTipoUva() {
		return tipoUva;
	}
	public void setTipoUva(String tipoUva) {
		this.tipoUva = tipoUva;
	}
	
	public int getLitros() {
		return litros;
	}
	public void setLitros(int litros) {
		this.litros = litros;
	}
	
	
	// metodos 
	
	public double arrobas() {
		
		double arrobas = litros / 16.33;
		return arrobas;
		
		
		
		
		
	}
	
	public String imprimirDatos() {
		String informacion ;
		
		informacion = "El tipo de Uva"+tipoUva+"\n";
		informacion += "El numero de litros del deposito "+litros+"\n";
		informacion += "El numero de arrobas que tiene el vino"+arrobas()+"\n";
		
		return informacion;
		
		
		
	}
	

	
	
	
	
	
	
	
	

}
