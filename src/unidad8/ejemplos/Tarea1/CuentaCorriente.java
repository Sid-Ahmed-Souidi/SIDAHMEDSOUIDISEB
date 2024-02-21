package unidad8.ejemplos.Tarea1;

public class CuentaCorriente extends Cuenta {

	
	private int numTitulares;
	public CuentaCorriente(String nombre, double cantidad, int numTitulares) {
		super(nombre, cantidad);
		this.numTitulares = numTitulares;
	}

	
	public int getNumTitulares() {
		return numTitulares;
	}


	public void setNumTitulares(int numTitulares) {
		this.numTitulares = numTitulares;
	}


	public void retirar(double retiro) {
		
		
		
	}
	
	
}
