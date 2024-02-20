package unidad8.ejemplos.herencia.interfaces.Vehiculos;

public class MainElectrico {
	
	
	public static void main(String[] args) {
		
		VehiculosElectricos arrayVehiculos[] = new VehiculosElectricos[10];
		
		VehiculosElectricos coche = new CocheElectrico();
		VehiculosElectricos bici = new BicicletaElectrica();
		VehiculosElectricos furgoneta = new FurgonetaElectrica();
		VehiculosElectricos moto = new MotoELectrica();
		VehiculosElectricos patinete = new PatineteElectrico();
		
		arrayVehiculos[0] = coche;
		arrayVehiculos[1] = bici;
		arrayVehiculos[2] = furgoneta;
		arrayVehiculos[3] = moto;
		arrayVehiculos[4] = patinete;
		
		System.out.println("---Coche---");
		coche.cargar();
		coche.descargar();
		System.out.println("----bici---");
		bici.cargar();
		bici.descargar();
		System.out.println("furgoneta");
		furgoneta.cargar();
		furgoneta.descargar();
		System.out.println("moto");
		moto.cargar();
		moto.descargar();
		System.out.println("Patinete");
		patinete.cargar();
		patinete.descargar();
		
	 
		
		
		
		
		
		
	
	
		
		
		
		
	}

}
