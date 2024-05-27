import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class mapas {

	public static void main(String[] args) {
        // Crear un HashMap
        Map<String, List<String>> map = new HashMap<>();

        // Añadir valores al mapa
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        map.put("Fruits", fruits);

        
        List<String> vegetables = new ArrayList<>();
        vegetables.add("Carrot");
        vegetables.add("Potato");
        map.put("Vegetables", vegetables);

        
        
        // Mostrar el contenido del mapa
        System.out.println("Contenido del mapa:");
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Acceder a un valor específico
        List<String> fruitsList = map.get("Fruits");
        System.out.println("Frutas: " + fruitsList);

        
        
        // Comprobar si una clave existe
        if (map.containsKey("Vegetables")) {
            System.out.println("El mapa contiene la clave 'Vegetables'");
        }
        
        

        // Comprobar si un valor existe
        if (map.containsValue(fruits)) {
            System.out.println("El mapa contiene la lista de frutas");
        }
        
        
        

        // Eliminar una entrada  y el valor asociado a la clave que en este caso es una lista 
        map.remove("Vegetables");
        System.out.println("Mapa después de eliminar 'Vegetables': " + map);

        
        
        // Reemplazar una entrada
        List<String> newFruits = new ArrayList<>();
        newFruits.add("Mango");
        newFruits.add("Pineapple");
        map.put("Fruits", newFruits);
        System.out.println("Mapa después de reemplazar 'Fruits': " + map);

        
        // Iterar sobre las claves
        System.out.println("Claves en el mapa:");
        for (String key : map.keySet()) {
         System.out.println(key);
        }

        
        // Iterar sobre los valores
        System.out.println("Valores en el mapa:");
        for (List<String> value : map.values()) {
            System.out.println(value);
        }
    }
}
