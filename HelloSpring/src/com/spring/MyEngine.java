package com.spring;

public class MyEngine {

	public static void main(String[] args) {
		
		MyConstructor cons = new MyConstructor("samad", 53);
		
		//cons.setAge(22);
		//cons.setName("ac");
		
		System.out.println(cons.getName());
		System.out.println(cons.getAge());
	}

}
