package pruebas.evaluacion2.recuperacion.Ejercicio3;

public class GestionDinosaurios {
	


	public static void main(String[] args) {
		
		
		Dinosaurio terrestre = new Terrestres("id123",30, 10 , "fria", "carne", true);
		Dinosaurio acuatico = new Acuarticos("id333",30, 10 , "fria", "hierba", true);
		Dinosaurio volador = new Voladores("id123",30, 10 , "caliente", "carne", true);
		
		
		
		System.out.println(terrestre);
		System.out.println(acuatico);
		System.out.println(volador);
		
		
		terrestre.calcularAgua(100, "fria", "carne");
		acuatico.calcularAgua(100, "fria", "hierba");
		volador.calcularAgua(100, "caliente", "carne");


		
		

		
		
			
		
		
	}


}
