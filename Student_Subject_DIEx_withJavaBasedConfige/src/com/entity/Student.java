package com.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Student {

	private int sId;
	private int rollNo;
	private String sName;
	private String standard;
	private char division;
	private float marks;
	@Autowired
	@Qualifier(value = "sub1")
	private Subject subject1;
	
	@Autowired
	@Qualifier(value = "sub2")
	private Subject subject2;

	@Autowired
	@Qualifier(value = "sub3")
	private Subject subject3;

	public int getsId() {
		return sId;
	}

	public void setsId(int sId) {
		this.sId = sId;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public String getStandard() {
		return standard;
	}

	public void setStandard(String standard) {
		this.standard = standard;
	}

	public char getDivision() {
		return division;
	}

	public void setDivision(char division) {
		this.division = division;
	}

	public float getMarks() {
		return marks;
	}

	public void setMarks(float marks) {
		this.marks = marks;
	}

	public Subject getSubject1() {
		return subject1;
	}

	public void setSubject1(Subject subject1) {
		this.subject1 = subject1;
	}

	public Subject getSubject2() {
		return subject2;
	}

	public void setSubject2(Subject subject2) {
		this.subject2 = subject2;
	}

	public Subject getSubject3() {
		return subject3;
	}

	public void setSubject3(Subject subject3) {
		this.subject3 = subject3;
	}

	@Override
	public String toString() {
		return "Student [sId=" + sId + ", rollNo=" + rollNo + ", sName=" + sName + ", standard=" + standard
				+ ", division=" + division + ", marks=" + marks + "\n subject1=" + subject1 + "\n subject2=" + subject2
				+ "\n subject3=" + subject3 + "]";
	}

}
