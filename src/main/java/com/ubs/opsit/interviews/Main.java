package com.ubs.opsit.interviews;

public class Main {

	public static void main(String[] args) 
	{
		String timeStr = "13:17:01";
		
		TimeConverter timeConverter = new TimeConverterImpl();
		String time = timeConverter.convertTime(timeStr);
		System.out.println(time);
	}

}
