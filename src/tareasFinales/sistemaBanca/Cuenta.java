package tareasFinales.sistemaBanca;

import java.util.Scanner;

public class Cuenta {
	
	protected int idCuenta;
	protected double balance;
	
	public static Scanner entrada = new Scanner(System.in);

	public Cuenta(int idCuenta, double balance) {
		super();
		this.idCuenta = idCuenta;
		this.balance = balance;
	}
	
	
	
	
	public int getIdCuenta() {
		return idCuenta;
	}
	public void setIdCuenta(int idCuenta) {
		this.idCuenta = idCuenta;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
	
	public static void depositar() {
		System.out.println("Introduce la cantidad que deseas depositar");
		double deposito = entrada.nextDouble();
		
		
		
		
		
	}

}
