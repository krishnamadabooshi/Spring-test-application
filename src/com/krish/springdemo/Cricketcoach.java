package com.krish.springdemo;

public class Cricketcoach implements Coach {

	private FortuneService fortuneService;
	@Override
	public String getDailyWorkout() {
		return "Practice batting for 3 hours daily";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

//	public void set
}
