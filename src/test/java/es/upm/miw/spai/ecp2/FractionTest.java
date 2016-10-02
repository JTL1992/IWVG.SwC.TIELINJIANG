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

}