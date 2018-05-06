package com.ubs.opsit.interviews;

public class SecondCalculator implements TimeCalculator 
{
	private int seconds;
	
	public SecondCalculator(int seconds)
	{
		this.seconds = seconds;
	}

	@Override
	public String calculate() 
	{
		String time = (this.seconds % 2) == 0 ? "Y" : "O";
		return time;
	}

}
