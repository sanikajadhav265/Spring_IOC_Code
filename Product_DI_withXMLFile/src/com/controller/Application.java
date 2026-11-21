package com.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.entity.Product;

public class Application {

	public static void main(String[] args) {

		ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");

		Product product = ac.getBean("product", Product.class);
		System.out.println("Product Details:" + product);
	}

}
