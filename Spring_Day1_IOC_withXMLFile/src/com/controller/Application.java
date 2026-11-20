package com.controller;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.entity.Student;

public class Application {
	
	public static void main(String[] args) {
		System.out.println("----------------Application Start-------------");
		
		System.out.println("--------Bean Factory-----------");
		Resource resource=new ClassPathResource("beans.xml");
		
//		    BeanFactory bf=new XmlBeanFactory(resource);
//		    
//		    Student student=(Student) bf.getBean("std");
//		    
//		    student.m1();
		    
		
//	System.out.println("---------------Application Context--------------");
		
//	ApplicationContext ac=new ClassPathXmlApplicationContext("beans.xml");
	
//	Student student=(Student) ac.getBean("std");
//	
//	student.m1();
	}

}
