package unidad10;

public class DemoDivision {

	public static void main(String[] args) {

		
		int a = 10;
		int b = 0;
		double resultado =0;
		
		try{
			resultado = a/b;	
			
		}catch(ArithmeticException e){
			System.out.println("Se ha producido un error");
			System.out.println(e.getMessage());
			System.out.println(e.toString());
			
			
		}
		finally {
			System.out.println("Resultado: "+resultado);
		}
		
		
		
		
		
		System.out.println("Resultado: "+resultado);
	}

}
