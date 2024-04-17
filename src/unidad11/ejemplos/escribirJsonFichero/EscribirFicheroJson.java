package unidad11.ejemplos.escribirJsonFichero;

import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class EscribirFicheroJson {

	public static void main(String[] args) {


		
		Cliente cliente1 = new Cliente("Paco","paco@gmail.com",34,2342423,"Plasencia",true);
		Cliente cliente2 = new Cliente("Elena","Elena@gmail.com",44,234223,"Plasencia",false);
		Cliente cliente3 = new Cliente("Lucia","lucia@gmail.com",54,2342423,"Plasencia",true);
		
		
		List<Cliente> clientes = new ArrayList<Cliente>();
		clientes.add(cliente1);
		clientes.add(cliente2);
		clientes.add(cliente3);
		
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		String json = gson.toJson(clientes);
		System.out.println(json);
		
		
		try {
			FileWriter escritor = new FileWriter("ficheros1/json/clientesNuevos.json");
			escritor.write(json);
			
			
			escritor.close();
			
			System.out.println("Se ha escrito correctamente");
		} catch (Exception e) {
		e.printStackTrace();	

		}
		


		
	}

}
