package tareasFinales.sistemaBanca;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Banco {

	
	
	public static Scanner entrada = new Scanner(System.in);

    public static List<Cliente> listaClientes = new ArrayList<Cliente>();

	protected String nombre ;
	protected String localizacion;
	
	
	
	
	public Banco(String nombre, String localizacion) {
		super();
		this.nombre = nombre;
		this.localizacion = localizacion;
	}


	


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getLocalizacion() {
		return localizacion;
	}

	public void setLocalizacion(String localizacion) {
		this.localizacion = localizacion;
	}
	
	
	public static Cliente  registrar() {
		
		int idCliente = (int) (Math.random()*10 + 1); 
		System.out.println("Introduce el nombre ");
		String nombre = entrada.next();
		System.out.println("Introduce el email ");
		String email = entrada.next();
		Cliente cliente = new Cliente(idCliente, nombre ,email);
		listaClientes.add(cliente);
		
		return cliente;
		
		
	} 
	
	
	public static boolean  login() {
	
		System.out.println("Introduce el nombre ");
		   String nombre = entrada.next();
		   System.out.println("Introduce el email ");
		   String email = entrada.next();
		   
		   boolean registrado = false; 
		for (Cliente cliente : listaClientes) {
			if(cliente.getNombre().equals(nombre) && cliente.getEmail().equals(email)) {
				registrado = true;
				return registrado;
				
				
			}
			
			
		}
		return registrado ;
		
		

	}

}
