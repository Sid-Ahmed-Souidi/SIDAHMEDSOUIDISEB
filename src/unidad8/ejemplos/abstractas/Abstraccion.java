package unidad8.ejemplos.abstractas;

public class Abstraccion {
	// Definición de la clase abstracta
	abstract class Animal {
	    // Variable de instancia
	    String nombre;

	    // Constructor
	    public Animal(String nombre) {
	        this.nombre = nombre;
	    }

	    // Método abstracto que debe ser implementado por las clases hijas
	    abstract void hacerSonido();

	    // Método concreto
	    void moverse() {
	        System.out.println(nombre + " se está moviendo");
	    }
	}

	// Clase hija que extiende la clase abstracta
	class Perro extends Animal {
	    // Constructor
	    public Perro(String nombre) {
	        super(nombre);
	    }

	    // Implementación del método abstracto
	    @Override
	    void hacerSonido() {
	        System.out.println(nombre + " hace guau");
	    }
	}

	public class Main {
	    public static void main(String[] args) {
	        // No podemos crear un objeto de la clase abstracta Animal
	        // Animal animal = new Animal("Animal");

	        // Creamos un objeto de la clase hija Perro
	   //     Perro miPerro = new Perro("Bobby");

	        // Llamamos a métodos de la clase Perro
	    //    miPerro.hacerSonido();
	     //   miPerro.moverse();
	    }
	}
}
