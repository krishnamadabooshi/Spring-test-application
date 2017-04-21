package com.krish.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {

		//load the spring configuration file
		
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		Coach trackCoach = context.getBean("myTrackCoach", Coach.class);
		Coach baseballCoach = context.getBean("myBaseballCoach", Coach.class);
		System.out.println(trackCoach.getDailyWorkout());
		System.out.println(baseballCoach.getDailyWorkout());
		System.out.println(baseballCoach.getDailyFortune());
		context.close();
	}

}
