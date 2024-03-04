package unidad8.ejemplos.Tarea2;

import unidad8.ejemplos.Tarea1.Cuenta;
import unidad8.ejemplos.Tarea1.CuentaAhorro;
import unidad8.ejemplos.Tarea1.CuentaCorriente;

public class GestorCuentas {

	public static void main(String[] args) {
		
		
		CuentaAhorros PrimeraCuenta = new CuentaAhorros("Sid",10.00);
		//Cuenta SegundaCuenta = new CuentaCorriente("Ahmed" ,15.00, 3);
		
		
		System.out.println("Nombre cuenta: "+PrimeraCuenta.getNombre());
		System.out.println("Cantidad: "+PrimeraCuenta.getCantidad());		
		
		
		
		System.out.println(PrimeraCuenta.esValidoDeposito());
		
		
		
	}

}
