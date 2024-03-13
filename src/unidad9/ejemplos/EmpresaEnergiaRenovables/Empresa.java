package unidad9.ejemplos.EmpresaEnergiaRenovables;

public class Empresa {

	public static void main(String[] args) {
		
		
		Planta planta1 = new Planta("111", "Navalmoral de la Mata", TIPO_PLANTA.PLACA);

		Placa placa1 = new Placa("10000XXX","Norte"); //1000-NAV
		
		Molino molino1 = new Molino("121");
		
		
		planta1.addRecurso(placa1);
	}

}
