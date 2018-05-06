package com.ubs.opsit.interviews;

import static org.junit.Assert.*;

import org.junit.Test;

public class HourCalculatorTest {

	@Test
	public void test() {
		
		TimeCalculator test1 = new HourCalculator(0);
		String result =	test1.calculate();
		assertEquals("OOOO\nOOOO", result);
	  
		TimeCalculator test2 = new HourCalculator(13);
		result = test2.calculate();
		assertEquals("RROO\nRRRO", result);
		
		TimeCalculator test3 = new HourCalculator(23);
		result = test3.calculate();
		assertEquals("RRRR\nRRRO", result);
		
		TimeCalculator test4 = new HourCalculator(24);
		result = test4.calculate();
		assertEquals("RRRR\nRRRR", result);
	}

}
