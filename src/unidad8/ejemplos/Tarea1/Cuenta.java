package unidad8.ejemplos.Tarea1;

import java.util.Scanner;

public abstract class Cuenta {
	
	
	

	 protected String nombre;
	 protected double cantidad;
	
	
	
	public Cuenta(String nombre, double cantidad) {
		this.nombre = nombre;
		this.cantidad = cantidad;
	}
	
	
	
	public String getNombre() {
		return nombre;
	}



	public void setNombre(){
		String validacion = "[A-Za-z]*";
		boolean correcto = false;
		String nombre;
		Scanner entrada = new Scanner(System.in);
		while(!correcto) {
			System.out.println("Introduce el nombre");
			nombre = entrada.next();
			if(nombre.matches(validacion)) {
				this.nombre = nombre;
				correcto = true;
				
			}else {
				System.out.println("Introduzca otra vez el nombre");
				
			}
			
			
		}
		
	}



	public double getCantidad() {
		return cantidad;
	}

	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}
	
	public void ingresar() {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingresa la cantidad que deseas");
		double ingreso = entrada.nextDouble();
		cantidad += ingreso;
		
	}
	public void retirar(double retiro) {
		

		if(cantidad >= retiro) {
			cantidad = cantidad -retiro;
			System.out.println("Ha realizado el retiro "+cantidad);			
		}else {
			System.out.println("Operación Denegada");
			System.out.println("Detalle : La cantidad es menor al retiro");
			
		}
		
	
		
	}


		@Override
		public String toString() {
			return "###### INFORMACIÓN CUENTA #######";
		}


	
	

}
