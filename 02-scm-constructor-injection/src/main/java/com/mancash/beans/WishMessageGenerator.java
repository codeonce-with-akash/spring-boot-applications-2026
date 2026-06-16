package com.mancash.beans;

import java.util.Date;

//Component class
public class WishMessageGenerator {

	private Date date;

	public WishMessageGenerator(Date date) {
		System.out.println("WISHMESSAGEGENERATOR 1-PARAM CONSTRUCTOR");
		this.date = date;
	}

	// b.method
	public String generateWishMessage(String username) {
		
		System.out.println("INSIDE GENERATEWISHMESSAGE METHOD");
		
		// 1. Get current hour of the day
		int hour = date.getHours();

		// 2. Build wish message based on the current hour of the day
		if (hour < 12)
			return String.format("Good morning %s", username);
		else if (hour < 16)
			return String.format("Good afternoon %s", username);
		else if (hour < 18)
			return String.format("Good evening %s", username);
		else
			return String.format("Good night %s", username);
	}

}
