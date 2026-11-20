package com.confige;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.entity.Student;

@Configuration
public class AppConfige {
	
	@Bean(name="std")
	public Student getStudent() {
		
	  Student std=new Student();
	  std.setsId(101);
	  std.setRollNo(12);
	  std.setsName("Sanika");
	  std.setMarks(89.90f);
	  std.setAddress("Nigdi");
	  
	  return std;
	}
	
	

}
