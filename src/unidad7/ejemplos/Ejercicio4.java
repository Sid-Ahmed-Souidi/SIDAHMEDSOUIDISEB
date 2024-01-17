package unidad7.ejemplos;

import java.time.LocalDateTime;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		 LocalDateTime fechaHoraActual = LocalDateTime.now();
		 int dia = fechaHoraActual.getDayOfMonth();
		 int mes = fechaHoraActual.getMonthValue();
		 int años = fechaHoraActual.getYear();
		 System.out.println("Fecha actual :"+dia+":"+mes+":"+años);

		
	
	}

}
