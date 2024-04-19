package unidad11.ejemplos.RazasGanaderas2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class RegistroRaza {
	// contiene los objetos registros  que lo hace gson
	// por cada objeto hay una raza , zona "caceres";
	 static List<Registro> registros;
	 //en el mapa hay clave , valor donde recorremos la lista y comprobamos la clave 
	 // que seria la zona y si no existe nos crea
	 static Map<String,Map> zonas = new HashMap<String,Map>();
	 
	public static void main(String[] args)  {
		
		
		String ruta = "ficheros/json/razasComarcasExtremadura.json";
		File fichero = new File(ruta);
		
		try(BufferedReader lector = new BufferedReader(new FileReader(fichero))){
		
		
		StringBuilder contenido = new StringBuilder();
		String linea ;
		while((linea=lector.readLine()) != null) {
			 contenido.append(linea);
		}
		
		
		Gson gson = new Gson();
		Type listaTipo = new TypeToken<List<Registro>>(){}.getType();
		registros = gson.fromJson(contenido.toString(),listaTipo);
	
		
		
		registrarZonas();
		registrarRazas();
		sumarCantidadesPorZona();
		mostrarDatos();
		
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}
		
		private static void mostrarDatos() {
			for(String nombreZona:zonas.keySet()) {
				Map<String , Integer> zona = zonas.get(nombreZona);
				for(String nombreRaza : zona.keySet()) {
					int cantidad = zona.get(nombreZona);
					System.out.println("Zona: "+nombreZona+" Raza: "+nombreRaza+" Cantidad: "+cantidad);
				}
				
			}
			
	}

		private static void sumarCantidadesPorZona() {
			
			for(Registro registro : registros) {
				
				Map<String , Integer>zona = zonas.get(registro.getZonas());
				
				int cantidad = registro.getNumero();
				//getRaza_ganado te recuperas el numero del mapa por el mapa por zona "bovino" --> 400
				int contador = zona.get(registro.getRaza_ganado());
				// aqui sumamos por  raza la cantidad que hay del objeto en la lista + la cantidad 
				// que hay en el mapa que se llama "contador"
				zona.put(registro.getRaza_ganado(), contador+cantidad);
			}		
	}
		
	

		private static void registrarRazas() {
			for(Registro registro : registros) {
				// creamos el mapa y pedimos el mapa asociado a la clave  ;"plasencia"
				Map<String , Integer>zona = zonas.get(registro.getZonas());
				// y creamos como "clave" la raza y el "valor" inicializamos con 0 
				zona.put(registro.getRaza_ganado(), 0);
			}		
	}

		private static void registrarZonas() {
			 for(Registro registro : registros) {
				 //añadimos la clave con la zona y el valor un  nuevo mapa 
				 zonas.put(registro.getZonas(), new HashMap<String, Integer>());
			 }
			 
			 
	
	}
	
	
	
	

}
