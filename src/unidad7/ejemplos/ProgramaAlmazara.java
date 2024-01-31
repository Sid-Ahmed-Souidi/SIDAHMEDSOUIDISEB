package unidad7.ejemplos;

public class ProgramaAlmazara {

	public static final int NUM_PROCESOS = 10;
	
	public static void main(String[] args) throws InterruptedException {
		
		// creamos una array vacia donde almacenaremos los objetos que creamos en el siguiente bucle for
		ProcesoAlmazara[] procesosAlmazara = new ProcesoAlmazara[NUM_PROCESOS];
		
		for(int i=0;i<10;i++) {
			// vamos recorriendo la array y almacenando los objetos 
			procesosAlmazara [i] = new ProcesoAlmazara();
			System.out.println("PRoceso creado");
		}
		
		for(int i=0;i<10;i++) {
			// aqui vamos mostrando los objetos creados 
			System.out.println("_____________________");
			procesosAlmazara[i].mostrarDatos();
			Thread.sleep(2000);
		}
		

	}

}
