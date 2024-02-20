package unidad8.ejemplos.herencia.interfaces.Vehiculos;

public class FurgonetaElectrica implements VehiculosElectricos{
	
	private int nivelBateria;
	
	public FurgonetaElectrica() {
		nivelBateria=60;
	}

	public void cargar() {
		
		System.out.println("Cargando el furgoneta electrico..");
		nivelBateria=100;
		System.out.println("Carga COmpleta .Nivel Bateria "+nivelBateria);
		
	}	
		public void descargar() {
			System.out.println("Descargando el furboneta electrico..");
			nivelBateria-=12;
			if(nivelBateria<0) {
				nivelBateria=0;
			}
			System.out.println("Nivel de bateria despues de descargar "+nivelBateria);
		}	

}
