package unidad6.ejemplos.Tarea2;

public class Garaje {
	 
	private Coche coche; //representa el coche que está dentro del taller.
	private String averia;
	private int contadorCoche;
	
	public  boolean aceptarCoche(Coche coche ,String averia) {
		 boolean aceptado = false; 
		
		 if(this.coche== null) {
			 this.coche = coche;
			 this.averia = averia;
			 contadorCoche++;
			 aceptado=true;
			 System.out.println("Coche aceptado");
			 
		 } else {
			 aceptado = false; // Garaje ocupado, coche no aceptado
	        }
		 
		 return aceptado;
		
		
	}
	private void devolverCoche() {
		
		coche = null;
		averia = null;
		
		
	}
	
	
	
	
	
	
	
	
	
	
}
