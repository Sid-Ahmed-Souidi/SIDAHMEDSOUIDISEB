package unidad11.ejemplos.json;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class EscribirJson {

	public static void main(String[] args)  {
		
		JSONParser parser = new JSONParser();
		
		
		try {
			FileReader lector = new FileReader("ficheros1/json/Menu.json");
			
			Object objeto = parser.parse(lector);
			JSONObject jsonObject = (JSONObject)objeto;
			
			
			JSONArray array =(JSONArray)jsonObject.get("PlatoFuerte");
			//Crear un nuevo objeto JSON
			JSONObject nuevoPlato = new JSONObject();
			nuevoPlato.put("nombre", "Arroz Caldoso");
			nuevoPlato.put("precio", "12");
			nuevoPlato.put("duracion", "30 minutos");
			nuevoPlato.put("tamaño", "Mediano");
			
			array.add(nuevoPlato);
			
			try(FileWriter escritor = new FileWriter("ficheros1/json/MenuModificado.json")){
				
				
				escritor.write(jsonObject.toJSONString());
				escritor.flush();
				System.out.println("Objeto JSON modificado en el archivo");
				
			}catch(IOException e) {
				e.printStackTrace();
			}


			
			
			
		} catch (Exception e) {
			
			
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
