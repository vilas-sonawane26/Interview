package com.ubs.opsit.interviews;

import static org.junit.Assert.*;

import org.junit.Test;

public class MinuteCalculatorTest {

	@Test
	public void test() {
		TimeCalculator test1 = new MinuteCalculator(0);
		String result =	test1.calculate();
		assertEquals("OOOOOOOOOOO\nOOOO", result);
	  
		TimeCalculator test2 = new MinuteCalculator(17);
		result = test2.calculate();
		assertEquals("YYROOOOOOOO\nYYOO", result);
		
		TimeCalculator test3 = new MinuteCalculator(59);
		result = test3.calculate();
		assertEquals("YYRYYRYYRYY\nYYYY", result);
		
		TimeCalculator test4 = new MinuteCalculator(10);
		result = test4.calculate();
		assertEquals("YYOOOOOOOOO\nOOOO", result);
	}

}
