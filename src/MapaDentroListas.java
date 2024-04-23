import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class MapaDentroListas {

	 public static void main(String[] args) {
	        // Creamos un HashMap donde la clave es un carácter y el valor asociado es una lista de cadenas
	        Map<Character, List<String>> nombresPorInicial = new HashMap<>();
	        
	        // Añadimos algunos nombres a la lista asociada a la clave 'A'
	        List<String> nombresConA = new ArrayList<>();
	        nombresConA.add("Ana");
	        nombresConA.add("Alberto");
	        nombresConA.add("Adriana");
	        nombresPorInicial.put('A', nombresConA);
	        
	        // Añadimos algunos nombres a la lista asociada a la clave 'B'
	        List<String> nombresConB = new ArrayList<>();
	        nombresConB.add("Beto");
	        nombresConB.add("Beatriz");
	        nombresPorInicial.put('B', nombresConB);
	        
	        // Añadimos algunos nombres a la lista asociada a la clave 'C'
	        List<String> nombresConC = new ArrayList<>();
	        nombresConC.add("Carlos");
	        nombresPorInicial.put('C', nombresConC);
	        
	        // Ahora podemos recuperar los nombres asociados a una inicial específica
	        List<String> nombresConB2 = nombresPorInicial.get('B');
	        System.out.println("Nombres que comienzan con la inicial 'B': " + nombresConB2);
	        
	        System.out.println("Recorrer una lista");
	        for (String alumno : nombresConB2) {
	        	System.out.println(alumno);
				
			}
	        System.out.println("Recorrer un mapa");
	        for (Entry<Character, List<String>> entry : nombresPorInicial.entrySet()) {
	            System.out.println("Clave: " + entry.getKey() + ", Valor: " + entry.getValue());
	        }
	    }

}
