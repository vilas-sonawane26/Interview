package com.ubs.opsit.interviews;

import static org.junit.Assert.*;

import org.junit.Test;

public class SecondCalculatorTest {

	@Test
	public void test() {
		
		TimeCalculator test1 = new SecondCalculator(1);
		String result =	test1.calculate();
		assertEquals("O", result);
	  
		
		TimeCalculator test2 = new SecondCalculator(2);
		result = test2.calculate();
		assertEquals("Y", result);
	}

}
