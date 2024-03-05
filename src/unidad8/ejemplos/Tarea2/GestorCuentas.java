package unidad8.ejemplos.Tarea2;

import unidad8.ejemplos.Tarea1.Cuenta;
import unidad8.ejemplos.Tarea1.CuentaAhorro;
import unidad8.ejemplos.Tarea1.CuentaCorriente;

public class GestorCuentas {

	public static void main(String[] args) {
		
		
		CuentaAhorros PrimeraCuenta = new CuentaAhorros("Sid",10.00);
		CuentaCorrientes SegundaCuenta = new CuentaCorrientes("Ahmed" ,15.00);
		
		
		System.out.println("-----CUENTA AHORRO---------");
		System.out.println("Nombre cuenta: "+PrimeraCuenta.getNombre());
		System.out.println("Cantidad: "+PrimeraCuenta.getCantidad());		

		System.out.println(PrimeraCuenta.esValidoDeposito());
		System.out.println("Cantidad: "+PrimeraCuenta.getCantidad());		
		System.out.println(PrimeraCuenta.esValidoRetirar());
		System.out.println("Cantidad: "+PrimeraCuenta.getCantidad());		

		System.out.println("-----CUENTA CORRIENTE---------");
		System.out.println("Nombre cuenta: "+SegundaCuenta.getNombre());
		System.out.println("Cantidad: "+SegundaCuenta.getCantidad());		

		System.out.println(SegundaCuenta.esValidoDeposito());
		System.out.println("Cantidad: "+SegundaCuenta.getCantidad());		
		System.out.println(SegundaCuenta.esValidoRetirar());
		System.out.println("Cantidad: "+SegundaCuenta.getCantidad());	
		
		
	}

}
