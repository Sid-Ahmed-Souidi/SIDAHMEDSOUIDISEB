package unidad6.ejemplos;

import java.time.LocalDate;

public class TestCovid {
	
	// Atributos
	private static String nombrePaciente ;
	private static String resultado;
	private static String fechaRealizacion;
	private static String tipoDePrueba;
	private static int numeroIde ;
	private static String infoLaboratorio ;
	private static String sintomas ;
	private static String fechaEntrega;
	private static String nombreMedico;
	
	
	
	
	
	public static String getNombrePaciente() {
		return nombrePaciente;
	}
	public static void setNombrePaciente(String nombrePaciente) {
		TestCovid.nombrePaciente = nombrePaciente;
	}
	public static String getResultado() {
		return resultado;
	}
	public static void setResultado(String resultado) {
		TestCovid.resultado = resultado;
	}
	public static String getFechaRealizacion() {
		return fechaRealizacion;
	}
	public static void setFechaRealizacion(String fechaRealizacion) {
		TestCovid.fechaRealizacion = fechaRealizacion;
	}
	public static String getTipoDePrueba() {
		return tipoDePrueba;
	}
	public static void setTipoDePrueba(String tipoDePrueba) {
		TestCovid.tipoDePrueba = tipoDePrueba;
	}
	public static int getNumeroIde() {
		return numeroIde;
	}
	public static void setNumeroIde(int numeroIde) {
		TestCovid.numeroIde = numeroIde;
	}
	public static String getInfoLaboratorio() {
		return infoLaboratorio;
	}
	public static void setInfoLaboratorio(String infoLaboratorio) {
		TestCovid.infoLaboratorio = infoLaboratorio;
	}
	public static String getSintomas() {
		return sintomas;
	}
	public static void setSintomas(String sintomas) {
		TestCovid.sintomas = sintomas;
	}
	public static String getFechaEntrega() {
		return fechaEntrega;
	}
	public static void setFechaEntrega(String fechaEntrega) {
		TestCovid.fechaEntrega = fechaEntrega;
	}
	public static String getNombreMedico() {
		return nombreMedico;
	}
	public static void setNombreMedico(String nombreMedico) {
		TestCovid.nombreMedico = nombreMedico;
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
