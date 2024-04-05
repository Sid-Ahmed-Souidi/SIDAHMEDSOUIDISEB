package unidad11.ejemplos.cuentaBancaria;

import java.time.LocalDate;

public class Tarjeta {
	
	//esto representa cada una de las lineas del fichero que es una tarjeta
	//POJO - DTO -TO -VO
	private String numero;
	private String tipo;
	private String  numeroCuenta;
	private LocalDate caducidad;
	
	

	public Tarjeta(String numero, String tipo, String numeroCuenta, LocalDate caducidad) {
		super();
		this.numero = numero;
		this.tipo = tipo;
		this.numeroCuenta = numeroCuenta;
		this.caducidad = caducidad;
	}
	
	
	public String getNumero() {
		return numero;
	}


	public void setNumero(String numero) {
		this.numero = numero;
	}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	public String getNumeroCuenta() {
		return numeroCuenta;
	}


	public void setNumeroCuenta(String numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}


	public LocalDate getCaducidad() {
		return caducidad;
	}


	public void setCaducidad(LocalDate caducidad) {
		this.caducidad = caducidad;
	}



}
