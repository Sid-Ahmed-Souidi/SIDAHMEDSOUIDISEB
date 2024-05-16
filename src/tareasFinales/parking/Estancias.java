package tareasFinales.parking;

import java.time.Duration;
import java.time.LocalTime;
import java.util.Scanner;

public class Estancias {
	
		public static Scanner entrada = new Scanner(System.in);
	
	
	protected static double cobroResidentes;
	protected static double cobroNoResidentes;
	protected Vehiculo vehiculo;
	
	
	
	public Vehiculo getVehiculo() {
		return vehiculo;
	}
	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}
	
	

	
	public static  void  registrarSalida(Vehiculo vehiculo) {
		
	    Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce la hora de salida (HH:MM)");
        LocalTime horaSalida = LocalTime.parse(entrada.next());
        long diferenciaMinutos = Duration.between(Vehiculo.getHoraEntrada(), horaSalida).toMinutes();
        vehiculo.setTiempo(diferenciaMinutos);
        
        
        
 
	}
	// funccion donde cobramos ya con los minutos en setTiempo multiplicando por los diferentes precios
	public static  double cobro( Vehiculo vehiculo) {
		
		if(vehiculo instanceof VehiculoNoResidente) {
			double cobro = vehiculo.precioCobro();
			cobroNoResidentes +=cobro;
			return cobroNoResidentes;
		}
		 if(vehiculo instanceof VehiculoResidente) {
			double cobro = vehiculo.precioCobro();
			cobroResidentes +=cobro;
			return cobroResidentes;
		}
		 if(vehiculo instanceof VehiculoOficial) {
			
			return 0;
		}
		return 0.0;
		
	}
	


	
}
	


