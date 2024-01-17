package unidad7.ejemplos;

import java.time.LocalDateTime;

public class Ejercicio6 {

	public static void main(String[] args) {
		
		
		 LocalDateTime fechaHoraActual = LocalDateTime.now();
		 
		 int dia = fechaHoraActual.getDayOfMonth();
		 int mes = fechaHoraActual.getMonthValue();
		 int años = fechaHoraActual.getYear();
		 
		 System.out.println("Fecha actual :"+dia+":"+mes+":"+años);

	
		 System.out.println("Fecha actual con 4 meses mas :"+dia+":"+(+mes+4)+":"+años);


		
	}

}
