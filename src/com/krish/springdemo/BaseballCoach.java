package com.krish.springdemo;

public class BaseballCoach  implements Coach {

	private FortuneService fortuneservice;
	
	public BaseballCoach(FortuneService thefortuneservice) {
		fortuneservice = thefortuneservice;
	}	 
	@Override
	public String getDailyWorkout(){
		return "Spend 30 min in batting";
	}

	@Override
	public String getDailyFortune() {
		return fortuneservice.getFortune();
	}
}
