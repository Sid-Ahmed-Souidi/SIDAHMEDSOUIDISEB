package unidad8.ejemplos.Tarea2;

import java.util.Scanner;

public class CuentaAhorros implements Responsable{
	
	
	private String nombre ;
	private double cantidad;	
	
	public CuentaAhorros(String nombre, double cantidad) {
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
			
			
		}else {
			System.out.println("No se puede realizar el deposito");
		}

	}

	@Override
	public void depositar(double deposito) {
		cantidad = cantidad + deposito;
	}

	@Override
	public boolean esValidoRetirar() {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduzca la cantidad que desea retirar");
		double retiro = entrada.nextDouble();
		if(retiro  <=  getCantidad()) {
			retirar(retiro);
			
			
		}else {
			System.out.println("No se puede retirar el dinero");
		}
		
		return false;
	}

	@Override
	public void retirar(double retiro) {
		
		cantidad = cantidad - retiro;
		
	}
	
	
	
	@Override
	public String toString() {
	System.out.println("La cuenta Ahorro con el nombre"+nombre);
	System.out.println("Cantidad :"+cantidad);
		return super.toString();
	}
	
	
	
	
	
	
	
	

}
