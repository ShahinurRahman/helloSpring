package com.spring;

import java.io.Serializable;

import org.springframework.context.event.ApplicationContextEvent;

public class Test {
	
	public Test(String somthing){
		
	}

	private String name;

	public void setName(String name) {
		this.name = name;
	}

	public void getName() {
		System.out.println("Your Name : " + name);
	}
}
