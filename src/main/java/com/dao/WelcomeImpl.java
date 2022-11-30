package com.dao;

import org.springframework.stereotype.Component;

@Component("wl")
public class WelcomeImpl implements Welcome {

	@Override
	public String sayHello(String name) {
		
		return "Hey "+name+"Welcome to AOP";
	}

	@Override
	public void sayHi(String name) {
		System.out.println("Hi"+name+"Welcome to AOP");
		
	}
	

}
