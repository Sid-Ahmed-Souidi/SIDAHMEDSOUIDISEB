package unidad8.ejemplos.herencia.interfaces.Vehiculos;

public class CocheElectrico implements VehiculosElectricos{
	
	
	private int nivelBateria;
	
	
	public CocheElectrico() {
		nivelBateria =50;
		
	}
	
	
	
	public void cargar() {
		
		System.out.println("Cargando el coche electrico..");
		nivelBateria=100;
		System.out.println("Carga COmpleta .Nivel Bateria "+nivelBateria);
		
	}	
		public void descargar() {
			System.out.println("Descargando el coche electrico..");
			nivelBateria-=10;
			if(nivelBateria<0) {
				nivelBateria=0;
			}
			System.out.println("Nivel de bateria despues de descargar "+nivelBateria);
		}		
	}


