package unidad11.ejemplos.json.tarjetas;

import java.io.FileWriter;
import java.util.Arrays;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class EscribirTarjetas {

	public static void main(String[] args) {

		List<Tarjeta> listaTarjetas = Arrays.asList(
				
			new Tarjeta("Visa","74592546","2222222","Juan Perez","12/26"),
			new Tarjeta("Mastercard","74592546","2222222","Juan pablo","12/26"),
			new Tarjeta("Visa","74592546","2222222","Juan alberto","12/26")
				
				);
		
		
		
		Tarjetas contenedor = new Tarjetas();
		contenedor.setTarjetas(listaTarjetas);
		
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		
		try {
			
			
			FileWriter escritor = new FileWriter("ficheros1/json/tarjetasBanco.json");
			gson.toJson(contenedor,escritor);
			escritor.close();
			
		} catch (Exception e) {
			e.printStackTrace();

		}
				
				
		
		
	}

}
