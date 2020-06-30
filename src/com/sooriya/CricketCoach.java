package com.sooriya;

public class CricketCoach implements Coach {

	private String emailAddress;
	private String name;
	
	
	public String getEmailAddress() {
		return emailAddress;
	}


	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	@Override
	public String getDailyWorkout() {
		return "Practice bowling for daily 30 mins";
	}

}
