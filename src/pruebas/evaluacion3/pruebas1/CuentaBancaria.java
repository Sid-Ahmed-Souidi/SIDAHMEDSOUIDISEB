package pruebas.evaluacion3.pruebas1;

public class CuentaBancaria {
	
	protected String idCliente;
	protected String IBAN ;
	protected double balance;
	
	
	
	public CuentaBancaria(String idCliente, String iBAN, double balance) {
		super();
		this.idCliente = idCliente;
		IBAN = iBAN;
		this.balance = balance;
	}
	
	
	public String getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(String idCliente) {
		this.idCliente = idCliente;
	}
	public String getIBAN() {
		return IBAN;
	}
	public void setIBAN(String iBAN) {
		IBAN = iBAN;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
	
	
	
	

}
