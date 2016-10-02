package es.upm.miw.spai.ecp2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class FractionTest {
	private Fraction f;

	@Before
	public void before(){
		f = new Fraction(1,2);
	}
	
	
	@Test
	public void testGetNumerator() {
		assertEquals(1, f.getNumerator());
	}

	@Test
	public void testGetDenominator() {
		assertEquals(2, f.getDenominator());
	}
	
	@Test
	public void testDecimal() {
		assertEquals((double)1/2, f.decimal(), 10e-3);
	}

	@Test
	public void testMultiplication(){
		int numerator = 2;
		int denominator = 3;
		
		assertEquals(2, f.multiplication(numerator, denominator).getNumerator());
		assertEquals(6, f.multiplication(numerator, denominator).getDenominator());
	}
    
	@Test
	public void testIsPropia() {
        assertEquals(true,f.isPropia());
        f = new Fraction(2,2);
        assertEquals(false,f.isPropia());
        f = new Fraction(3,2);
        assertEquals(false,f.isPropia());        
    }   

	@Test
	public void testIsImPropia() {
        assertEquals(false,f.isImPropia());
        f = new Fraction(2,2);
        assertEquals(false,f.isImPropia());
        f = new Fraction(3,2);
        assertEquals(true,f.isImPropia());        
    }	
	
}