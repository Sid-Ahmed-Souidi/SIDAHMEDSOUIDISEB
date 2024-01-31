package unidad7.ejemplos;

public class AlmazaraRun {

	public static void main(String[] args) {

		Almazara a1 = new Almazara(1, "Coria");
		Almazara a2 = new Almazara(2, "Navalmoral de la Mata",4);
		
		// esto es un proceso que se intentara introducir en un objeto creado
		ProcesoAlmazara p1 = new ProcesoAlmazara();
		Cliente c1 = new Cliente("9768769D","Raul",true);
		
		p1.setCliente(c1);
		
		
		a1.mostrarDatos();
		System.out.println("-------");
		a2.mostrarDatos();
		
		
		
		System.out.println("Proceso añadido");
		a1.addProceso(p1);
		a1.mostrarDatos();
	}

}
