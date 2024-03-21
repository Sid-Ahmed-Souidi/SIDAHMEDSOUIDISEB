package unidad10.crearExcepciones;

public class Programa {

	public static void main(String[] args) {
		
		Programa programa = new Programa();
		try {
			programa.metodoQuePuedeLanzarExcepcion();
		}catch(AlgoHaSalidoMalExcepcion ex) {
			System.out.println(ex.getMessage());
			System.out.println("Causa de la Excepion : "+ex.getCause());
			ex.printStackTrace();
			
		}

	}

	
	public void metodoQuePuedeLanzarExcepcion() throws AlgoHaSalidoMalExcepcion {
		
		boolean  condicion = true;
		if(condicion ) {
			throw new AlgoHaSalidoMalExcepcion("sE ha producido un error");
		}
		
	}
	
}
