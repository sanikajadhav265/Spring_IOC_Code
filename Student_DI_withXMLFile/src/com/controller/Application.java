package com.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.entity.Student;

public class Application {
	
	public static void main(String[] args) {
		
	ApplicationContext ac	=new ClassPathXmlApplicationContext("beans.xml");
	
	Student student=ac.getBean("student", Student.class);
	System.out.println("Student Details:"+student);
	
	}

}
