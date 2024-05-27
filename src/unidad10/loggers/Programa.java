package unidad10.loggers;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class Programa {

	static Logger logger = Logger.getLogger(Programa.class);
	
	public static void main(String[] args) {
		
		String usuario = "María";
		
		
		PropertyConfigurator.configure("log4j.properties");
		
		logger.debug("Este es un mensaje de depuración");
		logger.info("El usuario "+usuario+ " se ha registrado");
		//logger.warn("Este es un mensaje de warning");
		//logger.error("Este mensaje es de error");
		//logger.fatal("Este es un mensaje fatal");
		
		Vacaciones vacaciones = new Vacaciones();
		
		vacaciones.hacerAlgo();
		
		logger.info("Saliendo de la aplicación");
		
		logger.debug("Este es un mensaje de depuración");
		
		logger.debug("Este es un mensaje de depuración");
		
		
		logger.debug("Este es un mensaje de depuración");
		
		
		logger.debug("Este es un mensaje de depuración");
		
		
		logger.debug("Este es un mensaje de depuración");
		
		
		logger.debug("Este es un mensaje de depuración");
		
		
		logger.debug("Este es un mensaje de depuración");
		
		
		logger.debug("Este es un mensaje de depuración");
		
		logger.debug("Este es un mensaje de depuración");
		
		
	}

}









