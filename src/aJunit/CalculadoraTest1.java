package aJunit;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculadoraTest1 {

	  @Test
	    public void testPrimo() {
	        Calculadora calculadora = new Calculadora();
	        assertFalse(calculadora.esPrimo(4)); 
	    }

	    @Test
	    public void testMaximoComunDivisor() {
	        Calculadora calc = new Calculadora();
	        assertEquals(3, calc.maximoComunDivisor(6, 9)); 
	    }

	    @Test
	    public void testPotencia() {
	        Calculadora calc = new Calculadora();
	        assertEquals(1000.0, calc.potencia(10.0, 3), 0.0001); 
	    }
	
		    
		
}
