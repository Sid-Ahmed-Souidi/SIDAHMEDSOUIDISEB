package unidad7.ejemplos;

public class ProgramaBicicletas {

	public static void main(String[] args) {
		
		Bicicleta bici = new Bicicleta(1,2,"ORBEA","X34","ROJO");
		Bicicleta bici2 = new Bicicleta(2,3,"BH","X342","NEGRO");

		
		bici.imprimirDatos();

		bici.setMarca("Orbea");
		
		bici2.imprimirDatos();
	}

}
