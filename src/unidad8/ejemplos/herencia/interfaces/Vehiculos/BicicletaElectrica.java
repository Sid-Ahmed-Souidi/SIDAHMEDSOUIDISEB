package unidad8.ejemplos.herencia.interfaces.Vehiculos;

public class BicicletaElectrica implements VehiculosElectricos {
	
	private int nivelBateria;
	
	public BicicletaElectrica() {
		nivelBateria =30;
	}
	

	public void cargar() {
		
		System.out.println("Cargando la bicicleta electrica..");
		nivelBateria=100;
		System.out.println("Carga COmpleta .Nivel Bateria "+nivelBateria);
		
	}	
		public void descargar() {
			System.out.println("Descargando el bicicleta electrica..");
			nivelBateria-=5;
			if(nivelBateria<0) {
				nivelBateria=0;
			}
			System.out.println("Nivel de bateria despues de descargar "+nivelBateria);
		}	

}
