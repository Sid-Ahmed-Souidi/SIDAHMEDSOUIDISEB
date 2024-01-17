package unidad6.ejemplos;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class FechasHoras {

	public static void main(String[] args) {
		
		Date fecha = new Date();
		System.out.println(fecha);
		
		//fechas con LocalDate 
		LocalDate fechaActual = LocalDate.now();
		System.out.println(fechaActual);
		 Month mes = fechaActual.getMonth();
		 System.out.println("Mes: "+mes.getValue());
		 System.out.println("Mes: "+fechaActual.getMonthValue());
		 System.out.println("Dia: "+fechaActual.getDayOfMonth());
		 
		 LocalDate  fechaPasado = LocalDate.of(2024, 1, 8);
		 
		 System.out.println("Fecha pasada");
		 System.out.println(fechaPasado);
		 LocalDate fechaFutura =fechaPasado.plusDays(4);
		 System.out.println("Fecha Futura");
		 System.out.println(fechaFutura);
		
		 DateTimeFormatter formatoFecha =  DateTimeFormatter.ofPattern("dd-MM-yyyy");
		
		 String fechaFormateada = fechaFutura.format(formatoFecha);
		 System.out.println("Fecha futura formateada: "+fechaFormateada);
		 
		 System.out.println("-----------------------------");
		 DateTimeFormatter formatoFecha2 = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		 
		 
		 // aqui me creo el objeto formatoFecha2 no sirve para darle el formato al crearlo
		 LocalDate fechaLocal = LocalDate.parse("25-12-2023" , formatoFecha2);
		 System.out.println(fechaLocal);
		 
		 // aqui es cuando se da el formato
		 System.out.println(fechaLocal.format(formatoFecha2));
		 
		 
		 // **** HORAS
		 LocalTime tiempo = LocalTime.now();
		 System.out.println(tiempo);
		 System.out.println(tiempo.toString());
		 System.out.println("Hora "+tiempo.getHour());
		 System.out.println("Minuto "+tiempo.getMinute());
		 System.out.println("Hora despues de tres horas: "+tiempo.plusHours(3).getHour());
		 
		 
		 //***** fecha y hora *******
		 LocalDateTime fechaHoraActual = LocalDateTime.now();
		 System.out.println(fechaHoraActual);
		 
		 LocalDateTime fechaHoraRecreo = LocalDateTime.of(2024,1,10,11,15,45);
		 System.out.println("Recreo hoy: "+fechaHoraRecreo);
		 
		 
		 DateTimeFormatter formatoFechaHora = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		 
		 String fechaHoraCadena = fechaHoraRecreo.format(formatoFechaHora);
		 
		 
		 	System.out.println("---------------------------------");
		 System.out.println("Fecha y hora Recreo "+fechaHoraCadena);
		 
		 
		 //*********************************
		 LocalDateTime inicio = LocalDateTime.now();
		 LocalDateTime fin = inicio.plusHours(2).plusMinutes(30);
		 Duration duracion = Duration.between(inicio, fin);
		 System.out.println(duracion.getSeconds());
		 
		 
		 
		 
		 
		 
		 
		 
		
	}

}
