package datosBancarios;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class JegestionCuentas {
/**
	private static List<Cuenta> cuentas = new ArrayList<Cuenta>();
	private static Map<String, List<Cuenta>> mapCuentas = new HashMap<String, List<Cuenta>>();

	public static void main(String[] args) {

		File fichero = new File("Ficheros" + File.separator + "prueba" + File.separator + "balances.csv");

		if (checkIsFileExists(fichero)) {
			leerFichero(fichero);

			crearDirectorios();
			for (String clave : mapCuentas.keySet()) {
				System.out.println(clave);

				List<Cuenta> lista = mapCuentas.get(clave);
				for (Cuenta cuenta : lista) {
					System.out.println(cuenta);
				}
			}

			escribirFicheros();
			crearFicheroDescubierto();
			crearJSON();
		} else {
			System.out.printf("El fichero %s no existe", fichero.getAbsolutePath());
		}

	}

	

	private static void crearJSON() {
		File fichero = new File("datosBancarios" + File.separator + "cuentasPlus.json");
		if (!checkIsFileExists(fichero)) {
			try {
				fichero.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
				e.getMessage();
			}
		}

		Gson gson = new GsonBuilder().setPrettyPrinting().create();

		try (PrintWriter escritor = new PrintWriter(new BufferedWriter(new FileWriter(fichero)))) {

			for (Cuenta cuenta : cuentas) {
				if (cuenta.getBalance() > 900000) {
					gson.toJson(cuenta, escritor);
				}
			}

		} catch (IOException e) {

			e.getMessage();

		}

	}

	private static void crearFicheroDescubierto() {
		File fichero = new File("datosBancarios" + File.separator + "cuentasEnDescubierto.txt");
		if (!checkIsFileExists(fichero)) {
			try {
				fichero.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
				e.getMessage();
			}
		}

		for (Cuenta cuenta : cuentas) {

			if (cuenta.getBalance() < 0) {
				try (PrintWriter escritor = new PrintWriter(new BufferedWriter(new FileWriter(fichero, true)))) {

					escritor.println("ID: " + cuenta.getIdCliente() + ", IBAN: " + cuenta.getIBAN() + ", Balance: "
							+ cuenta.getBalance());

				} catch (IOException e) {

					e.getMessage();

				}
			}

		}
	}

	private static void escribirFicheros() {
		
		Iterator<String> it = mapCuentas.keySet().iterator();

		while (it.hasNext()) {
			String clave = (String) it.next();

			File fichero = new File("datosBancarios" + File.separator + clave + File.separator + "cuentas.txt");
			List<Cuenta> cuentas = mapCuentas.get(clave);

			for (Cuenta cuenta : cuentas) {
				try (PrintWriter escritor = new PrintWriter(new BufferedWriter(new FileWriter(fichero, true)))) {

					escritor.println("ID: " + cuenta.getIdCliente() + ", IBAN: " + cuenta.getIBAN() + ", Balance: "
							+ cuenta.getBalance());

				} catch (IOException e) {

					e.getMessage();

				}
			}
		}

	}

	private static void crearDirectorios() {
		File directorio = new File("datosBancarios");
		File fichero = null;

		if (!checkIsFileExists(directorio)) {
			directorio.mkdir();
		}

		for (String clave : mapCuentas.keySet()) {

			File ruta = new File(directorio + File.separator + clave);
			if (!checkIsFileExists(ruta)) {
				ruta.mkdirs();
				fichero = new File(ruta + File.separator + "cuentas.txt");

				if (!checkIsFileExists(fichero)) {
					try {
						fichero.createNewFile();
					} catch (IOException e) {
						e.printStackTrace();
						e.getMessage();
					}
				}
			}

		}
	}

	private static void leerFichero(File fichero) {

		try (BufferedReader lector = new BufferedReader(new FileReader(fichero))) {

			String linea = lector.readLine();
			int numeroLinea = 0;
			while (linea != null) {

				if (numeroLinea > 0) {
					String[] datos = separarDatos(linea);
					Cuenta cuenta = crearCuenta(datos);
					almacenarCuenta(cuenta);
				}

				linea = lector.readLine();
				numeroLinea++;
			}

			addCuentasPorIBAN();

		} catch (IOException e) {
			e.printStackTrace();
			e.getMessage();
		}

	}

	private static void almacenarCuenta(Cuenta cuenta) {
		if (cuenta.getIdCliente() != "" && cuenta.getIBAN() != "" && cuenta.getBalance() != 0) {
			cuentas.add(cuenta);
		}
	}

	private static void addCuentasPorIBAN() {
		for (Cuenta cuenta : cuentas) {//Itera sobre cada cuenta.

			String clave = cuenta.getIBAN().substring(0, 2);//Extrae los dos primeros caracteres del IBAN para usar como clave.
			mapCuentas.put(clave, new ArrayList<Cuenta>());//Inicializa una nueva lista vacía en el mapa para cada clave si no existe ya.
		}

		for (Cuenta cuenta : cuentas) {//Itera sobre cada cuenta.
			String clave = cuenta.getIBAN().substring(0, 2);//Usa los dos primeros caracteres del IBAN para recuperar la lista correspondiente del mapa.
			List<Cuenta> cuentas = mapCuentas.get(clave);//obtengo la lista correspondiente con la clave de la cuenta
			cuentas.add(cuenta); //Añade la cuenta a la lista correcta.
		}
	}

	private static Cuenta crearCuenta(String[] datos) {
		Cuenta cuenta = new Cuenta("", "", 0);

		if (datos.length == 3) {

			if (datos[1].substring(0, 2).matches("[A-Z]*")) {
				cuenta = new Cuenta(datos[0], datos[1], Double.parseDouble(datos[2]));
			}

		}

		return cuenta;
	}

	private static String[] separarDatos(String linea) {
		String[] datos = linea.split(",");

		return datos;
	}

	private static boolean checkIsFileExists(File fichero) {
		return (fichero.exists()) ? true : false;
	}
	*/
}
