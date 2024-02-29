package unidad9.ejemplos.colecciones.listas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class EjemploLista {

	public static void main(String[] args) {
		List al1 = new ArrayList();	
		List al2 = new ArrayList(10);
		List al3 = new ArrayList(al1);
		List <String>al4 = new ArrayList<String>();
		List<String> al5 = new ArrayList<String>(Arrays.asList("A","B","C"));
		
		
		Usuario usuario1 = new Usuario(1,"Pedro");
		Usuario usuario2 = new Usuario(2,"Salama");
		Usuario usuario3 = new Usuario(3,"Buker");
		
		
		List<Usuario> usuarios = new ArrayList<Usuario>();
		
		usuarios.add(usuario1);
		usuarios.add(usuario2);
		usuarios.add(usuario3);
		System.out.println("Usuarios----");
		System.out.println(usuarios);
		
		List<Usuario> listUsuarios = new ArrayList<Usuario>();
		listUsuarios.addAll(usuarios);
		System.out.println("Lista usuarios----");
		System.out.println(listUsuarios);
		
		List<Usuario> Empleados = new ArrayList<Usuario>(10);
		Usuario usuario4 = new Usuario(4,"Antonio");
		Usuario usuario5 = new Usuario(5,"Jose");
		Usuario usuario6 = new Usuario(6,"miguel");
		
		Empleados.add(usuario4);
		Empleados.add(usuario5);
		Empleados.add(usuario6);
		
		System.out.println("Lista empleados----");
		System.out.println(Empleados);
		
		
		Empleados.addAll(1 ,listUsuarios);		
		System.out.println(Empleados);
		
		Usuario usuario7 = new Usuario(7,"Amor");
		Empleados.add(usuario7);
		System.out.println("List Empleados++");
		System.out.println(Empleados);
		
		
		Empleados.remove(usuario5);
		System.out.println("List Empleados remove");
		System.out.println(Empleados);
		
		Empleados.remove(3);
		System.out.println("List Empleados remove posicion 3");
		System.out.println(Empleados);
		
	}
	
		Usuario usuario8 = new Usuario(8, "Serapio");
		Empleados.set(3, usuario8);
		
}
