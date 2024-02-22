package unidad8.ejemplos.Tarea1;

public abstract class CuentaCorriente extends Cuenta {

	
	private int numTitulares;
	public static double almacenarSaldo;
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
		
		if(retiro > 0 &&  retiro <= cantidad) {
			almacenarSaldo += retiro;
			super.Retirar();
		}else {
			System.out.println("No se puede realizar el retiro");
		}
		
		
		
	}
	
	
}
