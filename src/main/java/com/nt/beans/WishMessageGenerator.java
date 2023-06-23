package com.nt.beans;

import java.util.Date;

public class WishMessageGenerator {
	//HAS-A property (supporting composition or injection)
	private Date date;
	
	//setter method supporting setter injection
	public void setDate(Date date)
	{
		System.out.println("WishMessageGenerator.setDate()");
		this.date=date;
		
	}
	//b.mehtod
	public String generateMessage(String user)
	{
		//get current hour of the day
		int hour=date.getHours();//0-23
		if(hour<12)
			return"Good morning"+user;
		else if(hour<16)
			return"Good Afternoon"+user;
		else if(hour<20)
			return"Good Evening"+user;
		else
			return"Good Night"+user;
	}
	

}
