package com.ubs.opsit.interviews;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Main {

	public static void main(String[] args) 
	{
		String timeStr = "13:17:01";
		
		Calendar calendar = GregorianCalendar.getInstance(); 
		calendar.setTime(new Date());  
		timeStr = calendar.get(Calendar.HOUR_OF_DAY) + ":" +  
		          calendar.get(Calendar.MINUTE) + ":" +      
		          calendar.get(Calendar.SECOND);    
		
		System.out.println("time Input: > " + timeStr);
		
		TimeConverter timeConverter = new TimeConverterImpl();
		String time = timeConverter.convertTime(timeStr);
		System.out.println(time);
	}

}
