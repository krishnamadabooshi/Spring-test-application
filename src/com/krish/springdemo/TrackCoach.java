package com.krish.springdemo;

public class TrackCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Run for 30 mins";
	}

	@Override
	public String getDailyFortune() {
		return "you are lucky today";
	}

}
