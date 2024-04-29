package unidad11.ejemplos.razasComarcas2;

import java.time.LocalDate;

public class Animal {
	
	private int codigo ;
	private String tipo;
	private int numero;
	private LocalDate fecha;
	private String  zona;
	
	
	
	public Animal(int codigo, String tipo, int numero, LocalDate fecha, String zona) {
		super();
		this.codigo = codigo;
		this.tipo = tipo;
		this.numero = numero;
		this.fecha = fecha;
		this.zona = zona;
	}



	
	
	public int getCodigo() {
		return codigo;
	}



	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}



	public String getTipo() {
		return tipo;
	}



	public void setTipo(String tipo) {
		this.tipo = tipo;
	}



	public int getNumero() {
		return numero;
	}



	public void setNumero(int numero) {
		this.numero = numero;
	}



	public LocalDate getFecha() {
		return fecha;
	}



	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}



	public String getZona() {
		return zona;
	}



	public void setZona(String zona) {
		this.zona = zona;
	}





	
	
	@Override
	public String toString() {
		return "Animal [codigo=" + codigo + ", tipo=" + tipo + ", numero=" + numero + ", fecha=" + fecha + ", zona="
				+ zona + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
