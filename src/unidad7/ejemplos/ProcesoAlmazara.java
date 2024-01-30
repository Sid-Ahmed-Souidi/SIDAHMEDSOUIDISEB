package unidad7.ejemplos;

import java.text.DecimalFormat;
import java.util.Random;

public class ProcesoAlmazara {
	
	
	
	private double pesoAceitunas;
	private double pesoLimpio;
	private double pesoMolturado;
	private double aceiteExtraido;
	private double aceiteFiltrado;
	
	
	// constructor
	public ProcesoAlmazara() {
		
		// esta variable es la cantidad de aceitunas que se generan aleatoriamente
		pesoAceitunas = Simulador.generarCantidadAleatoria
				(Cantidades.CANTIDAD_MIN_ACEITUNAS, Cantidades.CANTIDAD_MAX_ACEITUNAS);
		
		
		
		double porcentajeLimpieza = Simulador.aplicarPorcentaje
				(Cantidades.CANTIDAD_MIN_LIMPIEZA, Cantidades.CANTIDAD_MAX_LIMPIEZA);
		
		pesoLimpio = Simulador.aplicarPorcentaje(pesoAceitunas, porcentajeLimpieza);
		
		
		double porcentajeMolturacion = Simulador.generarPorcentajeAleatorio
				(Cantidades.CANTIDAD_MIN_MOLTURACION, Cantidades.CANTIDAD_MAX_MOLTURACION);
		
		pesoMolturado = Simulador.aplicarPorcentaje(pesoLimpio, porcentajeMolturacion);
		
	
		double porcentajeExtraccion = Simulador.generarPorcentajeAleatorio
				(Cantidades.CANTIDAD_MIN_EXTRACCION, Cantidades.CANTIDAD_MAX_EXTRACCION);
		aceiteExtraido = Simulador.aplicarPorcentaje(pesoMolturado, porcentajeExtraccion);
		
	
		double porcentajeFiltrado = Simulador.generarPorcentajeAleatorio
				(Cantidades.CANTIDAD_MIN_FILTRADO, Cantidades.CANTIDAD_MAX_FILTRADO);
		aceiteFiltrado = Simulador.aplicarPorcentaje(aceiteExtraido, porcentajeFiltrado);
		
		
		
	}
	
	public void mostrarDatos() {
		
		     DecimalFormat formato = new DecimalFormat("0.00");
	        
	        // Resultados
	        System.out.println("Peso inicial de aceitunas: " +   formato.format(pesoAceitunas)  + " kg");
	        System.out.println("Peso después de la limpieza: " + formato.format(pesoLimpio) + " kg");
	        System.out.println("Peso después de la molturación: " + formato.format(pesoMolturado) + " kg");
	        System.out.println("Aceite extraído: " + formato.format(aceiteExtraido) + " litros");
	        System.out.println("Aceite después de la filtración: " + formato.format(aceiteFiltrado) + " litros");
	}
	

	
	
	public double getPesoAceitunas() {
		return pesoAceitunas;
	}
	public void setPesoAceitunas(double pesoAceitunas) {
		this.pesoAceitunas = pesoAceitunas;
	}
	public double getPesoLimpio() {
		return pesoLimpio;
	}
	public void setPesoLimpio(double pesoLimpio) {
		this.pesoLimpio = pesoLimpio;
	}
	public double getPesoMolturado() {
		return pesoMolturado;
	}
	public void setPesoMolturado(double pesoMolturado) {
		this.pesoMolturado = pesoMolturado;
	}
	public double getAceiteExtraido() {
		return aceiteExtraido;
	}
	public void setAceiteExtraido(double aceiteExtraido) {
		this.aceiteExtraido = aceiteExtraido;
	}
	public double getAceiteFiltrado() {
		return aceiteFiltrado;
	}
	public void setAceiteFiltrado(double aceiteFiltrado) {
		this.aceiteFiltrado = aceiteFiltrado;
	}
	
	
	
	

}
