package pruebas.evaluacion2.prueba1.Ejercicio2;

public class Terrestres extends Vehiculos {

	private String matricula;
	private int  ruedas;
	private boolean aireAcondiccionado;
	private COLOR color ;
	
	public Terrestres( String modelo,TIPO_VEHICULO vehiculo, int  ruedas , boolean aireAcondiccionado,String matricula) {
		super( modelo ,vehiculo);
		this.ruedas= ruedas; 
		this.aireAcondiccionado= aireAcondiccionado;
		this.matricula=matricula;
	
	}
	public Terrestres( String modelo, TIPO_VEHICULO vehiculo,int  ruedas , COLOR color,String matricula) {
		super( modelo , vehiculo);
		this.ruedas= ruedas; 
		this.color = color ; 
		this.matricula= matricula;
	}
	
	
	
	public int getRuedas() {
		return ruedas;
	}
	public void setRuedas(int ruedas) {
		this.ruedas = ruedas;
	}
	
	public boolean isAireAcondiccionado() {
		return aireAcondiccionado;
	}
	public void setAireAcondiccionado(boolean aireAcondiccionado) {
		this.aireAcondiccionado = aireAcondiccionado;
	}
	
	
	public COLOR getColor() {
		return color;
	}
	public void setColor(COLOR color) {
		this.color = color;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	

	
	
	

	

}
