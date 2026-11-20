package com.controller;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.entity.Department;
import com.entity.Employee;

public class Application {
	
	public static void main(String[] args) {
		System.out.println("-------Application Start-------");
//		System.out.println("Using BeanFactory");
//		Resource resource=new ClassPathResource("beans.xml");
//		
//		BeanFactory bf=new XmlBeanFactory(resource);
//		
//	     Employee employee=(Employee) bf.getBean("emp");
//	     Department department = (Department) bf.getBean("dept");
//	     
//	     employee.m1();
//	     employee.m2();
//	     department.dept();
//		
		System.out.println("Using Application Context");
		ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml","beans1.xml");
	    Employee employee = (Employee) ac.getBean("emp");
		Department department = (Department) ac.getBean("dept");
		
		employee.m1();
		employee.m2();
		department.dept();
		 
		
		
		
		
		
		
	}

}
