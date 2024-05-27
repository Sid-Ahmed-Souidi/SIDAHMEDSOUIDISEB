package pruebas.evaluacion3.pruebas1;

public class CuentaBancaria {
	
	protected String idCliente;
	protected String IBAN ;
	protected double balance;
	
	
	
	public CuentaBancaria(String idCliente, String IBAN, double balance) {
		this.idCliente = idCliente;
		this.IBAN = IBAN;
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
	public void setIBAN(String IBAN) {
		IBAN = IBAN;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}

	
	

	@Override
	public String toString() {
		return "CuentaBancaria [idCliente=" + idCliente + ", IBAN=" + IBAN + ", balance=" + balance + "]";
	}
	
	
	
	
	
	

}
