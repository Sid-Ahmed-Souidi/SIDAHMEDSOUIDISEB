package unidad8.ejemplos.sooper.Contenedores;

import unidad8.ejemplos.sooper.Enum.TipoContenedor;



public class Caja extends Contenedores{

	//Otras opciones que son menos elegantes que estan en el codigo de luis
	
	
	public Caja(String referencia, int alto, int ancho) {
		super(referencia, alto, ancho);
	
	}

	public TipoContenedor getTipo() {
		return TipoContenedor.CAJA ;
	}
}
