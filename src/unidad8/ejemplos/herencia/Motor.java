package unidad8.ejemplos.herencia;

public class Motor {
	
	private String tipoCombustible; // cantidato a una enumeracion
	private double cc;
	private double cv;
	
	

	// constructor
	
	public Motor(String tipoCombustible, double cc, double cv) {
		super();
		this.tipoCombustible = tipoCombustible;
		this.cc = cc;
		this.cv = cv;
	}
	

	
	
	// setters and getters
	public String getTipoCombustible() {
		return tipoCombustible;
	}
	public void setTipoCombustible(String tipoCombustible) {
		this.tipoCombustible = tipoCombustible;
	}
	public double getCc() {
		return cc;
	}
	public void setCc(double cc) {
		this.cc = cc;
	}
	public double getCv() {
		return cv;
	}
	public void setCv(double cv) {
		this.cv = cv;
	}
	
	

}
