package com.scm.boo.beans;

import java.util.Date;

public class WishMessageGenerator {

	private Date date;

	public WishMessageGenerator() {
		System.out.println("WishMessageGenerator 0-param constructor");
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		System.out.println("WishMessageGenerator setter method executed");
		this.date = date;
	}

	public String generateWishMessage(String username) {
		System.out.println("inside generateWishMessage()");
		
		// 1. get hour of the day
		int hour = date.getHours();

		if (hour < 12)
			return "Good morning " + username;
		else if (hour < 16)
			return "Good afternoon " + username;
		else if (hour < 18)
			return "Good evening " + username;
		else
			return "Good night " + username;
	}
}
