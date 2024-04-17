package unidad11.ejemplos.json.tarjetas;

import java.io.FileReader;

import com.google.gson.Gson;

public class LectorTarjetas {

	public static void main(String[] args) {
		
		
		
		Gson gson = new Gson();
		
		try {
			
			FileReader lector = new FileReader("ficheros1/json/tarjetas.json");
			
			Tarjetas tarjetas = gson.fromJson(lector, Tarjetas.class);
			
			lector.close();
			
			for(Tarjeta tarjeta : tarjetas.getTarjetas()) {
				
				System.out.println("Tipo: "+tarjeta.getTipo_de_tarjeta());
				System.out.println("Titular: "+tarjeta.getTitular());
				System.out.println("asociada: "+tarjeta.getNumero_de_cuenta_asociada());
				System.out.println("Fecha Caducidad: "+tarjeta.getFecha_caducidad());
				
			}
			
		} catch (Exception e) {

			e.printStackTrace();
		
		}
		
		
		
		

		
	}

}
