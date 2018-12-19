package com.bridgelabz.Demo;

import org.junit.Test;

import junit.framework.TestCase;

public class TestFactorial extends TestCase {
	
	Factorial f = new Factorial();
	
	@Test
	public void testFactorial1() {
		
		assertEquals(120, f.factorial(5));
	
	}
	
	public void testFactorial2() {
		assertEquals(0, f.factorial(0));
	}
	


}
