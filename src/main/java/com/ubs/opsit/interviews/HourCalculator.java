package com.ubs.opsit.interviews;

public class HourCalculator implements TimeCalculator {

	private static final int ROW_ONE_LAMP_COUNT = 4; 
	private static final int ROW_TWO_LAMP_COUNT = 4;
	
	private int hour;
	
	public HourCalculator(int hour)
	{
		this.hour = hour;
	}
	
	@Override
	public String calculate()
	{
	    StringBuffer sb = new StringBuffer();	
	    
	    /************ FIRST ROW TIME CONVERSION *****************/
		int fiveHourDivision = this.hour / 5 ;
		if (fiveHourDivision <= 0)
		{
			//System.out.print("OOOO");
			sb.append("OOOO");
			
		} else
		{
			for (int i=1; i<=ROW_ONE_LAMP_COUNT; i++) 
		    {
				String lampType = (i <= fiveHourDivision) ? "R" : "O";
		    	//System.out.print(lamp);
				sb.append(lampType);
		    }
		}
		
		//System.out.println();
		sb.append("\n");
		
		/************ SECOND ROW TIME CONVERSION *****************/
		int oneHourCount = this.hour % 5 ;
		for (int i=1; i<=ROW_TWO_LAMP_COUNT; i++) 
		{
			String lampType = (i <= oneHourCount) ? "R" : "O";
			//System.out.print(lamp);
			sb.append(lampType);
		}

		return sb.toString();
	}

}
