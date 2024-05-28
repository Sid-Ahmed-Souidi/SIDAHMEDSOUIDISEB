package pruebas.evaluacion3.pruebafinal;

public class Pago {
	
	private String metodoPago;
	private String estadoPago;
	
	
	public Pago( String tarjeta, String estadoPago) {
		super();
		this.metodoPago = tarjeta;
		this.estadoPago = estadoPago;
	}


	
	


	public String getTarjeta() {
		return metodoPago;
	}


	public void setTarjeta(String metodoPago) {
		this.metodoPago = metodoPago;
	}


	public String getEstadoPago() {
		return estadoPago;
	}


	public void setEstadoPago(String estadoPago) {
		this.estadoPago = estadoPago;
	}






	@Override
	public String toString() {
		return "Pago [metodoPago=" + metodoPago + ", estadoPago=" + estadoPago + "]";
	}
	
	
	
	

	
	

}
