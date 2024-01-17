package unidad7.ejemplos;


import java.time.LocalDateTime;

public class Ejercicio3 {

	
	public static void main(String[] args) {
		
		 LocalDateTime fechaHoraActual = LocalDateTime.now();
		 int hora = fechaHoraActual.getHour();
		 int minutos = fechaHoraActual.getMinute();
		 int segundos = fechaHoraActual.getSecond();
		 System.out.println("Hora actual :"+hora+":"+minutos+":"+segundos);

		
	
		
		
	}

}
