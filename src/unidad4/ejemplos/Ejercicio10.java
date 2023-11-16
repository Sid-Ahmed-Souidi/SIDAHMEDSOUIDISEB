package unidad4.ejemplos;

import java.time.LocalTime;

public class Ejercicio10 {

	public static LocalTime instanteTiempo(int horas , int min , int seg , int horas2 , int min2, int seg2) {
		LocalTime instanteUno = LocalTime.of(horas, min , seg);
		LocalTime instanteDos = LocalTime.of(horas2, min2 , seg2);
		if(instanteUno.isBefore(instanteDos)) {

			return instanteUno;

		}else {
			return instanteDos;
		}
	}

	public static void main(String[] args) {

			System.out.println("El primer instante es :"+instanteTiempo(18,30,56,13,30,54));

	}

}
