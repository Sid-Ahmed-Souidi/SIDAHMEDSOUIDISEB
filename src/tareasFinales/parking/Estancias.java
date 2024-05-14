package tareasFinales.parking;

import java.time.Duration;
import java.time.LocalTime;
import java.util.Scanner;

public class Estancias {
	
		public static Scanner entrada = new Scanner(System.in);
	
	
	
	protected static LocalTime horaEntrada;
	protected static  LocalTime horaSalida;
	protected Vehiculo vehiculo;
	
	
	
	public LocalTime getHoraEntrada() {
		return horaEntrada;
	}
	public void setHoraEntrada(LocalTime horaEntrada) {
		this.horaEntrada = horaEntrada;
	}
	public LocalTime getHoraSalida() {
		return horaSalida;
	}
	public void setHoraSalida(LocalTime horaSalida) {
		this.horaSalida = horaSalida;
	}
	public Vehiculo getVehiculo() {
		return vehiculo;
	}
	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}
	
	
	public static  void  registrarEntrada() {
		
        System.out.println("El formato de la hora no es válido. Debe ser HH:mm.");
		System.out.println("Introduce la hora de entrada");
		String horaString = entrada.next();
         horaEntrada = LocalTime.parse(horaString);
        System.out.println("Hora registrada :" +horaEntrada);
 
	}
	
	
	public static  void  registrarSalida(Vehiculo vehiculo) {
		
        System.out.println("El formato de la hora no es válido. Debe ser HH:mm.");
		System.out.println("Introduce la hora de salida");
		String horaString = entrada.next();
         horaSalida = LocalTime.parse(horaString);
        System.out.println("Hora registrada :" +horaSalida);
        Duration diferencia = Duration.between(horaEntrada, horaSalida);
        long minutos = diferencia.toMinutes() % 60;
        System.out.println("El total de minutos consumidos en el parking es de "+minutos);
        vehiculo.setTiempo(minutos);
        
        
        
        
 
	}
	
	

}
