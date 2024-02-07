package unidad6.ejemplos.Tarea2;

public class Garaje {

// Tendrá tres atributos, un coche, un String con la avería asociada y el número de coches
	//que ha ido atendiendo.

//El garaje solo podrá atender a un coche en cada momento. Controlar esta premisa.

//Tenga un método aceptarCoche que recibe un parámetro de tipo Coche y la avería asociada.
	//El garaje solo podrá atender a un coche en cada momento. Si ya esta atendiendo uno
	//que devuelva un false.

//Tenga un método devolverCoche que dejara al garaje en estado de aceptar un nuevo coche.

	 
	private Coche coche;
	private String averia;
	private int contadorCoche;
	
	
	public static boolean aceptarCoche(Coche coche ,String averia){
		 boolean garajeLleno = true; 
		 if(coche != null) {
			 System.out.println("Garaje ocupado");
		 }else {
			 
			 garajeLleno = false;
			 
		 }
		 return garajeLleno;
		
		
	}
	private void devolverCoche(Coche coche , String averia) {
		
		coche = null;
		averia =" ";
		
		
	}
	
	
	
	
	
	
	
	
	
	
}
