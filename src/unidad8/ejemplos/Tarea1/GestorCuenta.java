package unidad8.ejemplos.Tarea1;

public class GestorCuenta {

	public static void main(String[] args) {
		
		Cuenta PrimeraCuenta = new CuentaAhorro("Sid",10.00);
		Cuenta SegundaCuenta = new CuentaCorriente("Ahmed" ,15.00, 3);
		
		System.out.println("Nombre cuenta: "+PrimeraCuenta.getNombre());
		System.out.println("Cantidad: "+PrimeraCuenta.getCantidad());

		PrimeraCuenta.setCantidad(-15.00);
		
		System.out.println("Cantidad Modificada: "+PrimeraCuenta.getCantidad());
				
		PrimeraCuenta.setNombre();
		System.out.println("Nombre cuenta: "+PrimeraCuenta.getNombre());
		
		PrimeraCuenta.ingresar();
		
	    System.out.println("Esta es la cantidad despues del ingreso"+PrimeraCuenta.getCantidad());    

		PrimeraCuenta.retirar(4);
	    System.out.println("Esta es la cantidad despues del retiro"+PrimeraCuenta.getCantidad());    

	    System.out.println("------------");
	    System.out.println(PrimeraCuenta);
	    System.out.println("------------"); 
	    System.out.println(SegundaCuenta);

			
	}

}
