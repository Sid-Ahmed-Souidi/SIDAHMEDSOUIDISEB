package ENVOLTORIOS;

import java.util.ArrayList;
import java.util.List;

public class envoltorio {
	
	public static void main(String[] args) {
        // Creamos una lista para almacenar objetos Integer
        List<Integer> listaNumeros = new ArrayList<>();
        
        // Creamos un número entero y lo envolvemos en un objeto Integer
        int numeroPrimitivo = 42;
        Integer numeroObjeto = Integer.valueOf(numeroPrimitivo);
        
        // Agregamos el objeto Integer a la lista
        listaNumeros.add(numeroObjeto);
        
        // Podemos acceder al valor entero utilizando el método intValue() del objeto Integer
        int numeroRecuperado = listaNumeros.get(0).intValue();
        
        // Imprimimos el número recuperado
        System.out.println("Número recuperado: " + numeroRecuperado);
    }

}
