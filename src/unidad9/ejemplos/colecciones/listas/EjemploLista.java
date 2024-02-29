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
		Usuario usuario3 = new Usuario(1,"Buker");
		
		
		List<Usuario> usuarios = new ArrayList<Usuario>();
		
		usuarios.add(usuario1);
		usuarios.add(usuario2);
		usuarios.add(usuario3);
		System.out.println("Usuarios----");
		System.out.println(usuarios);
		
		
		
	}
		
}
