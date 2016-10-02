package es.upm.miw.spai.ecp2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class UserTest {
	
	private User u;
	
	@Before
	public void before(){
		u = new User(0, "Juan", "Robisco");
	}

	@Test
	public void testGetNumber(){
		assertEquals(0, u.getNumber());
	}
	
	@Test
	public void testGetName(){
		assertEquals("Juan", u.getName());
	}
	
	@Test
	public void testGetFamilyName(){
		assertEquals("Robisco", u.getFamilyName());
	}
	
	@Test
	public void testFullName() {
		assertEquals("Juan Robisco", u.fullName());
	}

	@Test
	public void testInitials() {
		assertEquals("J.R", u.initials());
	}

    @Test
    public void testMayus() {
        assertEquals("JUAN",u.mayus());
    }	
	
}