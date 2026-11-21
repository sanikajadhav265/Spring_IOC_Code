package com.configration;

import javax.annotation.PostConstruct;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.entity.Hospital;

@Configuration
public class AppConfige {

	@Bean(name = "hospital")
	public Hospital getHospitalDetails() {

		Hospital hospital = new Hospital();

		return hospital;
	}

	@PostConstruct
	public void getpaitent() {
		System.out.println("Hospital Patient");
	}
	
	@Bean(name="hospital")
	public Hospital nurseDetails() {
		System.out.println("Nurse Details");
		return new Hospital();
	}
}
