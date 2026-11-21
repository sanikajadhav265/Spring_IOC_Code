package com.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.configration.AppConfige;
import com.entity.Hospital;

public class Application {
	
	public static void main(String[] args) {
		
		ApplicationContext ac=new AnnotationConfigApplicationContext(AppConfige.class);
		
		Hospital hospital =ac.getBean("hospital", Hospital.class);
	//	System.out.println(hospital);
	}

}
