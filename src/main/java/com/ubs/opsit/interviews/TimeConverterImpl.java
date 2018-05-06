package com.ubs.opsit.interviews;

public class TimeConverterImpl implements TimeConverter {

	@Override
	public String convertTime(String aTime)  
	{
		StringBuffer sb = new StringBuffer();	
		String time [] = aTime.split(":");
		
		//System.out.println("Hour:" + time[0]);
		//System.out.println("Minutes:" + time[1]);
		//System.out.println("Seconds:" + time[2]);
		
		int hour = Integer.parseInt(time[0]);
		int minute = Integer.parseInt(time[1]);
		int second = Integer.parseInt(time[2]);
		
		TimeCalculator secondCalculator = new SecondCalculator(second);
		TimeCalculator hourCalculator = new HourCalculator(hour);
		TimeCalculator minuteCalculator = new MinuteCalculator(minute);
		
		sb.append(secondCalculator.calculate());
		sb.append("\n");
		sb.append(hourCalculator.calculate());
		sb.append("\n");
		sb.append(minuteCalculator.calculate());
		sb.append("\n");
	
		return sb.toString();
	}

}
