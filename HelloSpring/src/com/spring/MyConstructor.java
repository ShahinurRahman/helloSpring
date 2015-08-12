package com.spring;

public class MyConstructor {

	private String name;
	private  Integer age;	

	public MyConstructor(String name, Integer age){
		this.name = name+"-from here";
		this.age = age+10;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	
	
}
