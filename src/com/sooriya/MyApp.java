package com.sooriya;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

	public static void main(String[] args) {
        // creating Spring container and loading configuration file into spring container
		ClassPathXmlApplicationContext context = new 
				ClassPathXmlApplicationContext("applicationContext.xml");
		
		// retrieving beans from container
		CricketCoach theCoach = context.getBean("myCoach",CricketCoach.class);
		// calling methods on beans
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getEmailAddress());
		System.out.println(theCoach.getName());
		context.close();
	}

}
