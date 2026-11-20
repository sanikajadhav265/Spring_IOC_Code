package com.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.entity.Library;

public class Application {

	public static void main(String[] args) {
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
		
		Library lib1= ac.getBean("library", Library.class);
//		System.out.println(lib1.hashCode());
//		Library lib2= ac.getBean("library", Library.class);
//        System.out.println(lib2.hashCode());
		
		System.out.println("Library Details:"+lib1);
	}
}
