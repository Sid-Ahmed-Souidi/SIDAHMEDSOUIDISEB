package unidad7.ejemplos;

import java.time.LocalDateTime;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		
		 LocalDateTime fechaHoraActual = LocalDateTime.now();
		 int hora = fechaHoraActual.getHour();
		 int minutos = fechaHoraActual.getMinute();

		 System.out.println("Son las "+hora+" horas y "+minutos+" minutos");

		
	
	}

}
