package unidad8.ejemplos.herencia;

public class Concesionario {

	public static void main(String[] args) {

	 Motor motor = new Motor("Diesel",2000,150);
	 	
	 Coche coche = new Coche("8765-KWH","564984654984","Lancia","Stratos",motor,3,4,80,"rally");
	 
	 Motor motorMoto = new Motor("Gasolina",1500,80);
		
	 Moto moto = new Moto("1234-GHB","1642190F", "Yamaha","Virago",motor, false, "customs");
	 
	 
	 coche.mostrarDatos();
	 
	 moto.mostrarDatos();
		
		
	}

}
