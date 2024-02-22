package unidad8.ejemplos.Tarea1;

public class CuentaAhorro extends Cuenta{


	
	public CuentaAhorro(String nombre, double cantidad) {
		super(nombre, cantidad);
		System.out.println("Se le ha ingresado 10 euros de bono");
		cantidad = cantidad + 10 ;
	}

	/**public CuentaAhorro(String nombre, double cantidadd) {
		super(nombre, cantidad);
		
		System.out.println("Se le ha ingresado 10 euros de bono");
		cantidad = cantidad + 10 ;
	
	}*/
	
	
	
	@Override
	public String toString() {
		super.toString();
		String cadena = "Cuenta Ahorro"+nombre+"\n"+
		"Saldo:"+cantidad;
		return cadena;
	}

	
	
	
}
