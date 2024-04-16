package unidad11.ejemplos.json;

import java.io.File;
import java.io.FileReader;

import javax.swing.plaf.synth.SynthOptionPaneUI;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class LeerJson {

	public static void main(String[] args)  {
		
		
		JSONParser parser = new JSONParser();
		
		
		try {
		FileReader lector = new FileReader("ficheros1" + File.separator + "json" + File.separator + "Menu.json");
		Object objecto = parser.parse(lector);
		JSONObject jsonObject = (JSONObject)objecto;
		
		
		JSONArray array =(JSONArray)jsonObject.get("PlatoFuerte");
		
		for(int i =0 ; i<array.size() ; i++) {
			
			JSONObject plato = (JSONObject) array.get(i);
			String nombre = (String) plato.get("nombre");
			String precio = (String) plato.get("precio");
			
			System.out.println("nombre: "+nombre);
			System.out.println("precio: "+precio);
		}
		
		
		
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
		
	}

}
