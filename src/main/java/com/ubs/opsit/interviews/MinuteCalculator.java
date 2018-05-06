package com.ubs.opsit.interviews;

public class MinuteCalculator implements TimeCalculator {
	
	private static final int ROW_ONE_LAMP_COUNT = 11; 
	private static final int ROW_TWO_LAMP_COUNT = 4;
	
	private int minute;
	
	public MinuteCalculator(int minute)
	{
		this.minute = minute;
	}
	
	@Override
	public String calculate() 
	{
		StringBuffer sb = new StringBuffer();	
		
		/************ FIRST ROW TIME CONVERSION *****************/
		int fiveMinDivisions = this.minute / 5;
		
		if (fiveMinDivisions <= 0)
		{
			//System.out.print("OOOOOOOOOOO");
			sb.append("OOOOOOOOOOO");
			
		} else
		{
			  for (int i=1; i<=ROW_ONE_LAMP_COUNT; i++)
			  {
				 if (i <= fiveMinDivisions)
				 {
				   String lampType = (i%3 == 0) ? "R" : "Y";
				   //System.out.print(lamp);
				   sb.append(lampType);
				   
				 } else
				 {
					//System.out.print("O"); 
					 sb.append("O");
				 }
			  }
		}
		//System.out.println(""); 
		sb.append("\n");
		
		/************ SECOND ROW TIME CONVERSION *****************/
		int remainingMinutes = this.minute % 5;
		if (remainingMinutes <= 0)
		{
			//System.out.print("OOOO");
			sb.append("OOOO");
			
		} else
		{
			for (int i=1; i<=ROW_TWO_LAMP_COUNT; i++)
			{
				 String lampType = (i <= remainingMinutes) ? "Y" : "O"; 
				 //System.out.print(lamp);
				 sb.append(lampType);
			}
		}
		return sb.toString();
	}
	

}
