package unidad10;

public class LanzamientoDemo {

	public static void main(String[] args) {
		
		try {
			lanzarExcep();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
		     System.out.println(e.getMessage());	
		}
		
		
	}
	
	
	public static void lanzarExcep() throws IllegalAccessException{
		
		System.out.println("Lanzamos una expcepción");
		throw new IllegalAccessException("Error producido en el metodo lanzarExcep");
		
		
	}

}
