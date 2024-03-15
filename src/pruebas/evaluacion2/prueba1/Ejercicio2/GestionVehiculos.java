package pruebas.evaluacion2.prueba1.Ejercicio2;

public class GestionVehiculos {

	public static void main(String[] args) {	
		
		Acuaticos barco = new Acuaticos("M12",TIPO_VEHICULO.BARCO,120,true,"123sMSTEYTONL");
		Acuaticos submarino = new Acuaticos("M18",TIPO_VEHICULO.SUBMARINO,120,20,"124ACVDFQWONL");
		Terrestres coche = new Terrestres("SEAT",TIPO_VEHICULO.COCHE,4,true,"1234LMJ");
		Terrestres moto = new Terrestres("DABISON",TIPO_VEHICULO.MOTO,2,COLOR.AMARILLO,"1245LHJ");
		Aereos avion = new Aereos("BO80",TIPO_VEHICULO.AVION,29,60,"FLMJ876543");
		Aereos helicoptero = new Aereos("BO50",5,TIPO_VEHICULO.HELICOPTERO,4,"QWER873633");

		
		System.out.println("BARCO");
		System.out.println(barco);
		System.out.println("SUBMARINO");
		System.out.println(submarino);
		System.out.println("BARCO");
		System.out.println(coche);
		System.out.println("SUBMARINO");
		System.out.println(moto);
		System.out.println("BARCO");
		System.out.println(avion);
		System.out.println("SUBMARINO");
		System.out.println(helicoptero);



	}

}
