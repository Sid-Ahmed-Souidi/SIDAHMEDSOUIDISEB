package pruebas.ordinaria.evaluacion2;

import java.time.LocalDate;

public class Cirugia extends Servicio{

	
	private String tipoCirugia;
	private String nombreCirujano;
	
	
	public  Cirugia(String descripcion, double precioEspecifico, LocalDate fecha ,String tipoCirugia, String nombreCirujano) {
		super(descripcion,precioEspecifico, fecha);
		this.tipoCirugia = tipoCirugia;
		this.nombreCirujano = nombreCirujano;
		
	}
	
	
	public String getTipoCirugia() {
		return tipoCirugia;
	}
	public void setTipoCirugia(String tipoCirugia) {
		this.tipoCirugia = tipoCirugia;
	}


	
	
	public String getNombreCirujano() {
		return nombreCirujano;
	}


	public void setNombreCirujano(String nombreCirujano) {
		this.nombreCirujano = nombreCirujano;
	}


	@Override
	public String toString() {
		return "Cirugia [tipoCirugia=" + tipoCirugia + ", nombreCirujano=" + nombreCirujano + "]";
	}

	
	
	
	

}
