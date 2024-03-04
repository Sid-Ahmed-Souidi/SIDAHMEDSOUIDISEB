package unidad8.ejemplos.Tarea1;

import java.util.Scanner;

public  class CuentaCorriente extends Cuenta {
	
	private static final int SALDO_MINIMO =10;

	
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
	
	@Override
	public void retirar(double retiro) {
		
		if((getCantidad() - retiro ) <= SALDO_MINIMO) {
			super.retirar(retiro);
			
		}else {
			System.out.println("No se puede realizar el retiro");
		}
		
		
	}
	
	@Override
	public String toString() {
		super.toString();
		String cadena = "Cuenta Corriente"+nombre+"\n"+
		"Saldo:"+cantidad;
		return cadena;
	}
	
	
}
