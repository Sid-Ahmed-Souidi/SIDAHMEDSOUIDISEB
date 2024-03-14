package unidad9.ejemplos.EmpresaEnergiaRenovables;

public class Empresa {

	public static void main(String[] args) {
		
		Planta planta1 = new Planta("23456-RED", "Navalmoral de la Mata", TIPO_PLANTA.PLACA);

		Planta planta2 = new Planta("12422-TED", "Almaraz", TIPO_PLANTA.MOLINO);
		
		Planta planta3 = new Planta("12422-TED", "Almaraz", TIPO_PLANTA.MOLINO);


		Placa placa1 = new Placa("23435-REW",ORIENTACIONES.NORTE); //1000-NAV
		Placa placa2 = new Placa("23345-RAW",ORIENTACIONES.SUR); //1000-NAV

		Molino molino1 = new Molino("12121-WQE");
		Molino molino2 = new Molino("12121-SwE");

		
		//placa1.setId("23451-REW");
		
		planta1.addRecurso(placa1);
		System.out.println(placa1.getId());
		planta2.addRecurso(molino1);
		System.out.println(placa2.getId());
		
		
		System.out.println("Energia generada por placa");
 		System.out.println("Energia generada por Molino");
		System.out.println(molino1.calculoEnergiaMolino(10, 12923));
		
		
		System.out.println("Energia generada por la planta 1 que contiene placas solares");
		System.out.println(planta1.energiaGeneradaPlanta((placa1.calculoEnergiaPlaca(100, 1000)) , placa1));
	
		System.out.println(planta1.energiaGeneradaPlanta(placa1.calculoEnergiaPlaca(100, 1000) ,  placa1));
		
		System.out.println("Energia generada por la planta 2 que contiene molinos de viento");

		System.out.println(planta2.energiaGeneradaPlanta(molino1.calculoEnergiaMolino(10, 1500) ,  molino1));
		
		System.out.println("Energia generada por la planta 3 que contiene molinos de viento");
		
		System.out.println(planta3.energiaGeneradaPlanta(molino2.calculoEnergiaMolino(10, 3000) ,  molino2));

		
		System.out.println("Total de energia generada en toda la comunidad");
		 

	}

}
