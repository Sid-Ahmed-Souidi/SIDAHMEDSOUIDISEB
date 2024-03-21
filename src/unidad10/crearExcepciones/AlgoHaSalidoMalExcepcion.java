package unidad10.crearExcepciones;

public class AlgoHaSalidoMalExcepcion  extends Exception{
	
	
	public AlgoHaSalidoMalExcepcion(String mensaje) {
		super(mensaje);
	}
	
	
	
	public AlgoHaSalidoMalExcepcion(String mensaje ,Throwable causa) {
		super(mensaje , causa);
		
	}

}
