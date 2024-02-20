package unidad8.ejemplos.abstractas;

import java.util.Scanner;

public class Bicicleta extends Vehiculo{
	
	static Scanner entrada = new Scanner(System.in);

	
	
	public Bicicleta() {
		super("Una persona" ,2);
		setPrecio();
		
		
	}
	
	
	
	public void setPrecio() {
		
		final int MAX =10000;
		
		int lecturaTeclado;
		System.out.println("Introduzca un precio para de la bicicleta: ");
		precio = entrada.nextInt();
		if(precio>MAX) {
			precio=MAX;
		}
		if(precio<0) {
			precio=0;
		}
	}
	
	
	
	public String toString() {
		String salida = 
				"El Bicicleta tiene como fuente de alimentacion:"+getFuenteAlimentacion()
				+"\nTiene "+getRuedas()+" ruedas\n"
				+"Coste de"+precio;
			
		return salida;
		
		
	}

	@Override
	public double calcEficienciaCarburante() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double calcDistanciaViaje() {
		// TODO Auto-generated method stub
		return 0;
	}



	@Override
	public double precio() {
		// TODO Auto-generated method stub
		return 0;
	}
}
