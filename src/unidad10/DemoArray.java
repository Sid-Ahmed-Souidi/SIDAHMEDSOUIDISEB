package unidad10;

public class DemoArray {

	public static void main(String[] args) {

		int[] numeros = {1,2,3};
				
		
		try {
		numeros = null;
		System.out.println(numeros[20]);
		
		}catch(ArrayIndexOutOfBoundsException ex) {
			
			System.out.println("Indice del array fuera del limite"+ex.getMessage());
		}catch(NullPointerException e) {
			System.out.println("No existe la array: "+e.getMessage());
			
		}
		finally {
			
			System.out.println("Me alegras");
			
		}
		
		
		
	}

}
