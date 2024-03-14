package unidad9.ejemplos.EmpresaEnergiaRenovables;

public class Empresa {

	public static void main(String[] args) {
		
		Planta planta1 = new Planta("23456-RED", "Navalmoral de la Mata", TIPO_PLANTA.PLACA);

		Planta planta2 = new Planta("12422-TED", "Almaraz", TIPO_PLANTA.MOLINO);
		
		Planta planta3 = new Planta("12422-TED", "Almaraz", TIPO_PLANTA.MOLINO);


		Placa placa1 = new Placa("23435-REW",ORIENTACIONES.NORTE); //1000-NAV
		Placa placa2 = new Placa("23345-RAW",ORIENTACIONES.SUR); //1000-NAV

		Molino molino1 = new Molino("12121-WQE");
		
		//placa1.setId("23451-REW");
		
		planta1.addRecurso(placa1);
		System.out.println(placa1.getId());
		planta2.addRecurso(molino1);
		System.out.println(placa2.getId());
		
		
		System.out.println("Energia generada por placa");
		System.out.println(placa1.calculoEnergiaPlaca(100, 1212));
		System.out.println("Energia generada por Molino");
		System.out.println(molino1.calculoEnergiaMolino(10, 12923));
		
		
		System.out.println("Energia generada por la planta que contiene placas solares");
		planta1.energiaGeneradaPlanta(placa1.calculoEnergiaPlaca(100, 1212));
	
		planta1.energiaGeneradaPlanta(placa1.calculoEnergiaPlaca(100, 1212));
		
		
	}

}
