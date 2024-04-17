package unidad11.ejemplos.json.gson;

import com.google.gson.Gson;

public class LeerGson {

	public static void main(String[] args) {
		
		String json = "{'nombre':'Paco','email':'paco@educarex.es','curso':'DAW'}";
		Gson  gson = new Gson();
		Usuario usuario = gson.fromJson(json , Usuario.class);
		
		System.out.println(usuario);
		
	}

}
