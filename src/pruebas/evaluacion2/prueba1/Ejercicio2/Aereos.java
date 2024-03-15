package pruebas.evaluacion2.prueba1.Ejercicio2;

public class Aereos extends Vehiculos{

	private String matricula;
	private int  asientos ;
	private int tiempoVuelo ;
	private int numHelice ; 
	
	
	public Aereos( String modelo , TIPO_VEHICULO vehiculo,int  asientos  ,int tiempoVuelo,String matricula ) {
		super( modelo , vehiculo);
		this.asientos = asientos;
		this.tiempoVuelo = tiempoVuelo;
		this.matricula = matricula;
		
	}
	public Aereos( String modelo ,int numHelice, TIPO_VEHICULO vehiculo, int  asientos ,String matricula ) {
		super( modelo ,vehiculo);
		this.asientos = asientos;
		this.numHelice = numHelice ; 
		
	}



	public int getNumHelice() {
		return numHelice;
	}
	public void setNumHelice(int numHelice) {
		this.numHelice = numHelice;
	}
	
	public int getTiempoVuelo() {
		return tiempoVuelo;
	}
	
	
	public void setTiempoVuelo(int tiempoVuelo) {
		this.tiempoVuelo = tiempoVuelo;
	}
	
	public int  getAsientos() {
		return asientos;
	}



	public void setAsientos(int  asientos) {
		this.asientos = asientos;
	}
	
	
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	
	
	

}
