package unidad9.ejemplos.colecciones.conjuntos;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ComparacionSet {

	public static void main(String[] args) {
		
		
		Set<String> frutasAlmacen = new HashSet<String>();
		Set<String> frutasTienda = new LinkedHashSet<String>();
		Set<String> frutasCampo = new TreeSet<String>();		
			
		
		
		for(String fruta : Arrays.asList("mango","manzana","platano","pera"))
		{
			frutasAlmacen.add(fruta);
			frutasTienda.add(fruta);
			frutasCampo.add(fruta);
			
		}
		
		System.out.println("Orden en HashSet : "+frutasAlmacen);
		System.out.println("Orden en LinkedHashSet : "+frutasTienda);
		System.out.println("Orden en TreeSet : "+frutasCampo);

		
		Set<Integer> numeros = new HashSet<Integer>();
		long tiempoInicio = System.nanoTime();
		for(int i=0 ;i<10000000;i++) {
			numeros.add(i);
		}
		long tiempoFinal = System.nanoTime();
		System.out.println("Tiempo real en insertar 10M de elementos "
				+ "en un HashSet en segundos "+(tiempoFinal-tiempoInicio));
		
		
		
		
		numeros = new LinkedHashSet<Integer>();
		 tiempoInicio = System.nanoTime();
		for(int i=0 ;i<10000000;i++) {
			numeros.add(i);
		}
		 tiempoFinal = System.nanoTime();
		System.out.println("Tiempo real en insertar 10M de elementos "
				+ "en un LinkedHashSet en segundos "+(tiempoFinal-tiempoInicio));
		
		
		
		numeros = new TreeSet<Integer>();
		 tiempoInicio = System.nanoTime();
		for(int i=0 ;i<10000000;i++) {
			numeros.add(i);
		}
		 tiempoFinal = System.nanoTime();
		System.out.println("Tiempo real en insertar 10M de elementos "
				+ "en un TreeSet en segundos "+(tiempoFinal-tiempoInicio));
		
		
	}

}
