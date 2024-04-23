package Ejercicio2;

public class GestionVehiculos {

	public static void main(String[] args) {

		Terrestres coche = new Coches("1234abc","A25",4,true);
		Terrestres moto = new Motos("1234abe","A25",4,"Amarillo");
		Acuaticos barco = new Barcos("123hbgcdtyonv","A25",42,true);
		Acuaticos submarino = new Submarinos("123hbgcdtyohv","A25",4,2000);
		Aereos avion = new Aviones("qwer123456","modelo22",123 , 423);
		Aereos helicoptero = new Helicopteros("qwer123765","modelo22",123 , 423);

		
		System.out.println(coche);
		System.out.println(moto);
		System.out.println(barco);
		System.out.println(submarino);
		System.out.println(avion);
		System.out.println(helicoptero);
		
	
		
		
		
		
	}

}
