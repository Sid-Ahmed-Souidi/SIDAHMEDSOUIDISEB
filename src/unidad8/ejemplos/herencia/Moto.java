package unidad8.ejemplos.herencia;

public class Moto extends Vehiculo{

	private boolean limitacion;
	private String tipo;
	
	
	public Moto(String matricula,
			String bastidor,
			String marca,
			String modelo,
			Motor motor,
			boolean limitacion,
			String tipo) {
		super(matricula, bastidor, marca, modelo, motor);
		
		this.limitacion = limitacion;
		this.tipo = tipo;
		
	}
	
	public void mostrarDatos() {
		System.out.println("---Moto------");
		System.out.println("Marca : "+marca);
		System.out.println("Modelo :"+modelo);
		System.out.println("Limitacion: "+limitacion);
		System.out.println("Tipo: "+tipo);
		
	}

	public boolean isLimitacion() {
		return limitacion;
	}

	public void setLimitacion(boolean limitacion) {
		this.limitacion = limitacion;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	

}
