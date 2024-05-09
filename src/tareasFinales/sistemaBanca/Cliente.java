package tareasFinales.sistemaBanca;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cliente {
    public static List<Cuenta> listaCuentas = new ArrayList<Cuenta>();

	public static Scanner entrada = new Scanner(System.in);

	protected int   idCliente;
	protected String  nombre;
	protected String  email;
	
	
	public Cliente(int  idCliente, String nombre, String email) {
		super();
		this.idCliente = idCliente;
		this.nombre = nombre;
		this.email = email;
	}

	
	

	public int getIdCliente() {
		return idCliente;
	}


	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}
	
	
	public static void abrirCuenta() {
		
		
		int idCuenta = (int) (Math.random()*100000000 + 1); 
		System.out.println("Introduzca cuanto tendrá de balance en esta cuenta");
		double balance = entrada.nextDouble();
		Cuenta cuenta = new Cuenta(idCuenta , balance);
		listaCuentas.add(cuenta);
		
		
		
	} 
	
	
	
}
	

	


