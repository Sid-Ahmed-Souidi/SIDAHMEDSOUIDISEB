package Examenes.tercerExamen.Ejercicio3;

public class ejercicioeResueltoia {
	import java.util.Arrays;
	import java.util.HashSet;
	import java.util.Set;

	// Clase abstracta Dinosaurio
	abstract class Dinosaurio {
	    protected String id;
	    protected String nombre;
	    protected int edad;
	    protected int altura;
	    protected int peso;
	    protected String tipoSangre;
	    protected String dieta;

	    public Dinosaurio(String nombre, int edad, int altura, int peso, String tipoSangre, String dieta) {
	        this.nombre = nombre;
	        this.edad = edad;
	        this.altura = altura;
	        this.peso = peso;
	        this.tipoSangre = tipoSangre;
	        this.dieta = dieta;
	        this.id = generarId();
	    }

	    // Método abstracto para mostrar información
	    public abstract void mostrarInformacion();

	    // Método abstracto para calcular la cantidad de agua
	    public abstract void calcularAgua();

	    // Método para generar el ID del dinosaurio
	    private String generarId() {
	        String especie = nombre.substring(0, Math.min(3, nombre.length())).toUpperCase();
	        // Suponiendo que el ID es el número de instancia
	        return especie + hashCode();
	    }
	}

	// Clase para representar dinosaurios terrestres
	class Terrestre extends Dinosaurio {
	    private boolean predador;
	    private int cantidadComidaDiaria;
	    private int distanciaDiaria;

	    public Terrestre(String nombre, int edad, int altura, int peso, String tipoSangre, String dieta, boolean predador,
	                     int cantidadComidaDiaria, int distanciaDiaria) {
	        super(nombre, edad, altura, peso, tipoSangre, dieta);
	        this.predador = predador;
	        this.cantidadComidaDiaria = cantidadComidaDiaria;
	        this.distanciaDiaria = distanciaDiaria;
	    }

	    @Override
	    public void mostrarInformacion() {
	        System.out.println("Dinosaurio Terrestre: " + nombre + ", ID: " + id);
	    }

	    @Override
	    public void calcularAgua() {
	        // Calcular agua para dinosaurios terrestres
	    }
	}

	// Clase para representar dinosaurios acuáticos
	class Acuatico extends Dinosaurio {
	    private boolean bucea;
	    private int distanciaNatacion;
	    private int velocidadNatacion;
	    private int profundidadNatacion;

	    public Acuatico(String nombre, int edad, int altura, int peso, String tipoSangre, String dieta, boolean bucea,
	                    int distanciaNatacion, int velocidadNatacion, int profundidadNatacion) {
	        super(nombre, edad, altura, peso, tipoSangre, dieta);
	        this.bucea = bucea;
	        this.distanciaNatacion = distanciaNatacion;
	        this.velocidadNatacion = velocidadNatacion;
	        this.profundidadNatacion = profundidadNatacion;
	    }

	    @Override
	    public void mostrarInformacion() {
	        System.out.println("Dinosaurio Acuático: " + nombre + ", ID: " + id);
	    }

	    @Override
	    public void calcularAgua() {
	        // Calcular agua para dinosaurios acuáticos
	    }
	}

	// Clase para representar dinosaurios voladores
	class Volador extends Dinosaurio {
	    private boolean migraciones;
	    private int alturaMaximaVuelo;
	    private int mediaHuevos;

	    public Volador(String nombre, int edad, int altura, int peso, String tipoSangre, String dieta, boolean migraciones,
	                   int alturaMaximaVuelo, int mediaHuevos) {
	        super(nombre, edad, altura, peso, tipoSangre, dieta);
	        this.migraciones = migraciones;
	        this.alturaMaximaVuelo = alturaMaximaVuelo;
	        this.mediaHuevos = mediaHuevos;
	    }

	    @Override
	    public void mostrarInformacion() {
	        System.out.println("Dinosaurio Volador: " + nombre + ", ID: " + id);
	    }

	    @Override
	    public void calcularAgua() {
	        // Calcular agua para dinosaurios voladores
	    }
	}

	// Clase para representar una especie de dinosaurio
	class EspeciesDinosaurios {
	    // Definir las especies disponibles para cada tipo de dinosaurio
	    public static final Set<String> TERRESTRES = new HashSet<>(Arrays.asList(
	            "Tyrannosaurus rex", "Triceratops", "Velociraptor", "Stegosaurus", "Brachiosaurus"));
	    public static final Set<String> VOLADORES = new HashSet<>(Arrays.asList(
	            "Pteranodon", "Quetzalcoatlus", "Dimorphodon"));
	    public static final Set<String> ACUATICOS = new HashSet<>(Arrays.asList(
	            "Plesiosaurus", "Mosasaurus", "Ichthyosaurus"));

	    // Método para verificar si una especie pertenece a un tipo de dinosaurio
	    public static boolean esTerrestre(String especie) {
	        return TERRESTRES.contains(especie);
	    }

	    public static boolean esVolador(String especie) {
	        return VOLADORES.contains(especie);
	    }

	    public static boolean esAcuatico(String especie) {
	        return ACUATICOS.contains(especie);
	    }
	}

	public class Main {
	    public static void main(String[] args) {
	        // Ejemplo de creación de dinosaurios
	        Dinosaurio tiranosaurio = crearDinosaurio("Tyrannosaurus rex", 10, 15, 5000, "caliente", "carne");
	        Dinosaurio pteranodon = crearDinosaurio("Pteranodon", 5, 10, 200, "caliente", "pescado");
	        Dinosaurio plesiosaurus = crearDinosaurio("Plesiosaurus", 8, 5, 1500, "fría", "pescado");

	        // Mostrar información de los dinosaurios
	        if (tiranosaurio != null) tiranosaurio.mostrarInformacion();
	        if (pteranodon != null) pteranodon.mostrarInformacion();
	        if (plesiosaurus != null) plesiosaurus.mostrarInformacion();
	    }

	    // Método para crear dinosaurios con validación de especies
	    public static Dinosaurio crearDinosaurio(String nombreEspecie, int edad, int altura, int peso, String tipoSangre, String dieta) {
	        Dinosaurio dinosaurio = null;
	        if (EspeciesDinosaurios.esTerrestre(nombreEspecie)) {
	            // Crear un dinosaurio terrestre
	            dinosaurio = new Terrestre(nombreEspecie, edad, altura, peso, tipoSangre, dieta, true, 10, 20);
	        } else if (EspeciesDinosaurios.esVolador(nombreEspecie)) {
	            // Crear un dinosaurio volador
	            dinosaurio = new Volador(nombreEspecie, edad, altura, peso, tipoSangre, dieta, true, 1000, 10);
	        } else if (EspeciesDinosaurios.esAcuatico(nombreEspecie)) {
	            // Crear un dinosaurio acuático
	            dinosaurio = new Acuatico(nombreEspecie, edad, altura, peso, tipoSangre, dieta, true, 500, 20, 100);
	        } else {
	            System.out.println("Especie de dinosaurio no válida: " + nombreEspecie);
	        }
	        return dinosaurio;
	    }
	}
}
