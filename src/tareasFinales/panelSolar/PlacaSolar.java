package tareasFinales.panelSolar;

import java.util.Scanner;

public class PlacaSolar {

	
		Scanner entrada = new Scanner(System.in);
	
	
		private String id;
		private double acimut;
		private double elevacion;
		private double potencia;
		private boolean averiado;
		private boolean alineado;
		
		
		
		
		public PlacaSolar(String id, boolean averiado,
				boolean alineado) {
			super();
			this.id = id;
			this.acimut = acimut();
			this.elevacion = elevacion();
			this.potencia = potencia();
			this.averiado = averiado;
			this.alineado = alineado;
		}
		
		
		
		public  double elevacion() {
			System.out.println("Introduce la elevacion de la placa solar");
			double elevacion = entrada.nextDouble();
			return elevacion;
			
			
		}
		
		
		public  double acimut() {
			System.out.println("Introduce la elevacion de la placa solar");
			double acimut = entrada.nextDouble();
			return acimut;
			
			
		}	
		
		
		public  double potencia() {
			System.out.println("Introduce la elevacion de la placa solar");
			double potencia = entrada.nextDouble();
			return potencia;
			
			
		}


		

		public String getId() {
			return id;
		}





		public void setId(String id) {
			this.id = id;
		}





		public double getAcimut() {
			return acimut;
		}





		public void setAcimut(double acimut) {
			this.acimut = acimut;
		}





		public double getElevacion() {
			return elevacion;
		}





		public void setElevacion(double elevacion) {
			this.elevacion = elevacion;
		}





		public double getPotencia() {
			return potencia;
		}





		public void setPotencia(double potencia) {
			this.potencia = potencia;
		}





		public boolean isAveriado() {
			return averiado;
		}





		public void setAveriado(boolean averiado) {
			this.averiado = averiado;
		}





		public boolean isAlineado() {
			return alineado;
		}





		public void setAlineado(boolean alineado) {
			this.alineado = alineado;
		}





		@Override
		public String toString() {
			return "PlacaSolar [id=" + id + ", acimut=" + acimut + ", elevacion=" + elevacion + ", potencia=" + potencia
					+ ", averiado=" + averiado + ", alineado=" + alineado + "]";
		}
		
		
		
		
		
		
		
		
		
		
		
}
