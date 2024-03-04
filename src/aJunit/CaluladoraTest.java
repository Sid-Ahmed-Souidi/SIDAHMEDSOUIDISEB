package aJunit;

import static org.junit.Assert.*;
import org.junit.Test; 

public class CaluladoraTest {
	
	
	
    @Test
	public void testPrimo() {
		Calculadora calculadora =new Calculadora();
		assertTrue(calculadora.esPrimo(2));
        assertTrue(calculadora.esPrimo(3));
        assertTrue(calculadora.esPrimo(5));
        assertTrue(calculadora.esPrimo(7));
	}
	   @Test
	    public void testMaximoComunDivisor() {
	        Calculadora calc = new Calculadora();
	        assertEquals(5, calc.maximoComunDivisor(15, 10));
	        assertEquals(7, calc.maximoComunDivisor(35, 42));
	        assertEquals(1, calc.maximoComunDivisor(17, 23));
	    }

	    @Test
	    public void testPotencia() {
	        Calculadora calc = new Calculadora();
	        assertEquals(8.0, calc.potencia(2.0, 3), 0.0001);
	        assertEquals(27.0, calc.potencia(3.0, 3), 0.0001);
	        assertEquals(1.0, calc.potencia(10.0, 0), 0.0001);
	    }
	
	
	
	
}
	


