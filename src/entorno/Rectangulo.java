package entorno;

/**
 * Esta clase sirve como base para el calculo de areas de un rectangulo
 * @author Sid Ahmed Souidi
 * @version 1.0
 */

public class Rectangulo {

	/**
	 * campo que recoge la longitud de u rectangulo
	 */
    private double longitud;
    /**
     * campo que recoge la anchura de un rectangulo
     */
    private double anchura;
                                    
    /**
     * 
     * Este metodo recibe los parametros longitud y anchura y asigna los valores
     * @param longitud
     * @param anchura
     */
   
    public Rectangulo(double longitud, double anchura) {
    	
        this.longitud = longitud;
        
        this.anchura = anchura;
    }
    
    
    /**
     * 
     * 
     * @return devuelve el area del rectangulo creado como objeto
     */
    
    public double calcularArea() {
    	
        return longitud * anchura;
    }
    
    /**
     * 
     * @return Devuelve el perimetro del rectangulo
     * @see String#toLowerCase()
     */
    
    public double calcularPerimetro() {
    	
        return 2 * (longitud + anchura);
    }
    
    public double getLongitud() {
    	
        return longitud;
    }
    
    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }
   
    public double getAnchura() {
        return anchura;
    }
    
    public void setAnchura(double anchura) {
        this.anchura = anchura;
    }
}
