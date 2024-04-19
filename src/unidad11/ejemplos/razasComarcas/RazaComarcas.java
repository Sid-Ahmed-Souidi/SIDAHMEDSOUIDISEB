package unidad11.ejemplos.razasComarcas;

import java.io.FileReader;

import com.google.gson.Gson;

import unidad11.ejemplos.json.tarjetas.Tarjeta;
import unidad11.ejemplos.json.tarjetas.Tarjetas;

public class RazaComarcas {

	public static void main(String[] args) {

		
		Gson gson = new Gson();
		
		try {
			FileReader lector = new FileReader("ficheros1/json/razasComarcasExtremadura.json");
			
			Ganados ganados = gson.fromJson(lector, Ganados.class);
			
			
			lector.close();

			for(Ganado ganado : ganados.getGanados()) {
				
			System.out.println("codigo: "+ganado.getCodigo());
				System.out.println("raza_ganado: "+ganado.getRaza_ganado());
				System.out.println("asociada: "+ganado.getFecha());
				System.out.println("Fecha Caducidad: "+ganado.getZonas());
				
			}
			
			lector.close();	
		} catch (Exception e) {

			
		}

		
		
	}

}
