package unidad8.ejemplos.Tarea2;

import java.util.Scanner;

public class CuentaCorrientes implements Responsable {

	private String nombre ;
	private double cantidad;	
	public static final double miBalance = 100; 
	
	
	public CuentaCorrientes(String nombre, double cantidad) {
		super();
		this.nombre = nombre;
		this.cantidad = cantidad;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getCantidad() {
		return cantidad;
	}

	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}	

	
	@Override
	public boolean esValidoDeposito() {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduzca la cantidad que desea depositar");
		double deposito = entrada.nextDouble();
		if(deposito  > 0) {
			depositar(deposito);
			return true;
			
		}else {
			System.out.println("Deposito no realizado");
			return false;
		}

	}

	@Override
	public void depositar(double deposito) {
		cantidad  += deposito;
	}

	@Override
	public boolean esValidoRetirar() {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduzca la cantidad que desea retirar");
		double retiro = entrada.nextDouble();
		if((getCantidad() - retiro) >= miBalance) {
			retirar(retiro);
			return true;
			
		}else {
			System.out.println("El saldo minimo no puede ser inferior a "+miBalance);
			return false;
		}
		
		
		
	}

	@Override
	public void retirar(double retiro) {	
	 cantidad = cantidad -retiro ;
	}
	
	
	
	
	

}
