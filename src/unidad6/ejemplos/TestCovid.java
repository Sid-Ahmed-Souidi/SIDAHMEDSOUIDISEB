package unidad6.ejemplos;

import java.time.LocalDate;

public class TestCovid {
	
	// Atributos
	private  String nombrePaciente ;
	private  String resultado;
	private  LocalDate fechaRealizacion;
	private  String tipoDePrueba;
	private  int numeroIde ;
	private  String infoLaboratorio ;
	private  String sintomas ;
	private  LocalDate fechaEntrega;
	private  String nombreMedico;
	
	
	
	// preguntar la cual es mejor manera con instacias o estaticas 
	// si usar el this a nivel de una variable particular o a estaticas a nivel de clase 
	
	public  String getNombrePaciente() {
		return nombrePaciente;
	}
	public  void setNombrePaciente(String nombrePaciente) {
		this.nombrePaciente = nombrePaciente;
	}
	public  String getResultado() {
		return resultado;
	}
	public  void setResultado(String resultado) {
		this.resultado = resultado;
	}
	public  LocalDate getFechaRealizacion() {
		return fechaRealizacion;
	}
	public  void setFechaRealizacion(LocalDate fechaRealizacion) {
		this.fechaRealizacion = fechaRealizacion;
	}
	public  String getTipoDePrueba() {
		return tipoDePrueba;
	}
	public  void setTipoDePrueba(String tipoDePrueba) {
		this.tipoDePrueba = tipoDePrueba;
	}
	public  int getNumeroIde() {
		return numeroIde;
	}
	public  void setNumeroIde(int numeroIde) {
		this.numeroIde = numeroIde;
	}
	public  String getInfoLaboratorio() {
		return infoLaboratorio;
	}
	public  void setInfoLaboratorio(String infoLaboratorio) {
		this.infoLaboratorio = infoLaboratorio;
	}
	public  String getSintomas() {
		return sintomas;
	}
	public  void setSintomas(String sintomas) {
		this.sintomas = sintomas;
	}
	public  LocalDate getFechaEntrega() {
		return fechaEntrega;
	}
	public  void setFechaEntrega(LocalDate fechaEntrega) {
		this.fechaEntrega = fechaEntrega;
	}
	public  String getNombreMedico() {
		return nombreMedico;
	}
	public  void setNombreMedico(String nombreMedico) {
		this.nombreMedico = nombreMedico;
	}
	
	
	public void  imprimirDatos() {
		System.out.println("TEST COVID");
		System.out.println("------------------------------------");
		System.out.println("Nombre del paciente :"+nombrePaciente);
		System.out.println("");
		System.out.println("Resultado del test :"+resultado);
		System.out.println("");
		System.out.println("Fecha realización :"+fechaRealizacion);
		System.out.println("");
		System.out.println("Tipo de prueba realizado :"+tipoDePrueba);
		System.out.println("");
		System.out.println("El numero de identificación :"+numeroIde);
		System.out.println("");
		System.out.println("Informaci´pn de laboratio :"+infoLaboratorio);
		System.out.println("");
		System.out.println("Sintomas del paciente :"+sintomas);
		System.out.println("");
		System.out.println("Fecha de entrega del test al paciente :"+fechaEntrega);
		System.out.println("");
		System.out.println("Nombre del medico que inspeccionó el test :"+nombreMedico);


		
		
		
		
	}
	
	

	
	
	

}
