package com.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.confige.AppConfige;
import com.entity.Student;

public class Application {

	public static void main(String[] args) {

		ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfige.class);

		Student student = ac.getBean("std", Student.class);
//		Student student= (Student) ac.getBean("std");
 
		System.out.println(student);
	}

}
