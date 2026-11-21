package com.confige;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.entity.Student;
import com.entity.Subject;

@Configuration
public class AppConfige {

	@Bean(name = "std")
	public Student getStudent() {

		Student std = new Student();
		std.setsId(101);
		std.setRollNo(42);
		std.setsName("Om");
		std.setStandard("9th");
		std.setDivision('B');
		std.setMarks(78.90f);
		// std.setSubject(getSubject1());
		return std;
	}

	@Bean(name = "sub1")
	public Subject getSubject1() {

		Subject sub = new Subject();
		sub.setSubId(11);
		sub.setSubName("Geography");
		sub.setFaculty("Vijay Sir");

		return sub;

	}

	@Bean(name = "sub2")
	@Primary
	public Subject getSubject2() {

		Subject sub = new Subject();
		sub.setSubId(12);
		sub.setSubName("History");
		sub.setFaculty("Amol Sir");

		return sub;

	}
	
	@Bean(name = "sub3")
	public Subject getSubject3() {

		Subject sub = new Subject();
		sub.setSubId(13);
		sub.setSubName("Hindi");
		sub.setFaculty("Pradip Sir");

		return sub;

	}

}
