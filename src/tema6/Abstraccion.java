package tema6;

public class Abstraccion {
	// Definición de la interfaz Vehiculo
	interface Vehiculo {
	    void acelerar();
	}

	// Clase que implementa la interfaz Vehiculo para un coche
	class Coche implements Vehiculo {
	    @Override
	    public void acelerar() {
	        System.out.println("El coche está acelerando...");
	    }
	}

	// Clase que implementa la interfaz Vehiculo para una motocicleta
	class Motocicleta implements Vehiculo {
	    @Override
	    public void acelerar() {
	        System.out.println("La motocicleta está acelerando...");
	    }
	}

	public class Main {
	    public static void main(String[] args) {
	        // Creamos objetos de tipo Coche y Motocicleta
	        Vehiculo miCoche = new Coche();
	        Vehiculo miMotocicleta = new Motocicleta();
	        
	        // Llamamos al método acelerar() en ambos objetos
	        miCoche.acelerar();
	        miMotocicleta.acelerar();
	    }
	}
}
