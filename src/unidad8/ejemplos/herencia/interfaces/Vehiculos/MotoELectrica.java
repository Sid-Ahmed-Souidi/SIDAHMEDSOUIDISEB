package unidad8.ejemplos.herencia.interfaces.Vehiculos;

public class MotoELectrica implements VehiculosElectricos{
	
	private int nivelBateria ;
	
	public MotoELectrica() {
		
		nivelBateria=40;
	}
	
	
	
	
	public void cargar() {
		
		System.out.println("Cargando la moto electrica..");
		nivelBateria=100;
		System.out.println("Carga COmpleta .Nivel Bateria "+nivelBateria);
		
	}	
		public void descargar() {
			System.out.println("Descargando el moto electrica..");
			nivelBateria-=8;
			if(nivelBateria<0) {
				nivelBateria=0;
			}
			System.out.println("Nivel de bateria despues de descargar "+nivelBateria);
		}	

}
