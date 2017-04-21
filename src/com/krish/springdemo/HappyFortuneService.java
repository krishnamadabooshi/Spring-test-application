package com.krish.springdemo;

public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "today is a happy day";
	}

}
