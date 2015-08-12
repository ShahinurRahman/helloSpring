package com.abcd.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Xyz {

	public static void main(String[] args) {

		ApplicationContext contex = new ClassPathXmlApplicationContext();
		Abc abc = (Abc) contex.getBean("abc");
		
		abc.getA();
		
		/*
		Abc abc = new Abc("asad", "samad", 222); 
		abc.setA("Mamun");
		abc.setB("Noman");
		abc.setC(123);
		
		System.out.println(abc.getA());
		System.out.println(abc.getB());
		System.out.println(abc.getC());
		*/
	}
}
