package unidad8.ejemplos.Tarea1;

public class GestorCuenta {

	public static void main(String[] args) {
		
		Cuenta PrimeraCuenta = new CuentaAhorro("Sid Ahmed",10.00);
		
		System.out.println("Nombre cuenta: "+PrimeraCuenta.getNombre());
		System.out.println("Cantidad: "+PrimeraCuenta.getCantidad());

		PrimeraCuenta.setCantidad(-15.00);
		
		System.out.println("Cantidad Modificada: "+PrimeraCuenta.getCantidad());
				
		PrimeraCuenta.setNombre();
		System.out.println("Nombre cuenta: "+PrimeraCuenta.getNombre());
		
		PrimeraCuenta.Ingresar();
		
	    System.out.println("Esta es la cantidad despues del ingreso"+PrimeraCuenta.getCantidad());    

		PrimeraCuenta.Retirar();
	    System.out.println("Esta es la cantidad despues del retiro"+PrimeraCuenta.getCantidad());    

		
		

			
	}

}
