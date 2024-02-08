package unidad6.ejemplos.Tarea2;

public class Garaje {

// Tendrá tres atributos, un coche, un String con la avería asociada y el número de coches
	//que ha ido atendiendo.

//El garaje solo podrá atender a un coche en cada momento. Controlar esta premisa.

//Tenga un método aceptarCoche que recibe un parámetro de tipo Coche y la avería asociada.
	//El garaje solo podrá atender a un coche en cada momento. Si ya esta atendiendo uno
	//que devuelva un false.

//Tenga un método devolverCoche que dejara al garaje en estado de aceptar un nuevo coche.

	 
	private Coche coche; //representa el coche que está dentro del taller.
	private String averia;
	private int contadorCoche;
	
	
	public  boolean aceptarCoche(Coche coche ,String averia) {
		 double importeAveria = 0.0; 
		 boolean aceptado = false; 
		
		 if(this.coche== null) {
			
			 this.coche = coche;
			 aceptado=true;
			 System.out.println("Coche aceptado");
			 coche.acumulaAveria(importeAveria);
			 contadorCoche++;
			 
		 }
		 
		 return aceptado;
		
		
	}
	private void devolverCoche(Coche coche , String averia) {
		
		coche = null;
		averia =" ";
		
		
	}
	
	
	
	
	
	
	
	
	
	
}
