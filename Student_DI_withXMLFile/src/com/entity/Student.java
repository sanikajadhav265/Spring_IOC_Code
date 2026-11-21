package com.entity;

public class Student {

	private int sId;
	private int rollNo;
	private String sName;
	private long mobNo;
	private String emailId;
	private Address currentAddress;
	private Address permnentAddress;
	private Address hostelAddress;

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

	public long getMobNo() {
		return mobNo;
	}

	public void setMobNo(long mobNo) {
		this.mobNo = mobNo;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public Address getCurrentAddress() {
		return currentAddress;
	}

	public void setCurrentAddress(Address currentAddress) {
		this.currentAddress = currentAddress;
	}

	public Address getPermnentAddress() {
		return permnentAddress;
	}

	public void setPermnentAddress(Address permnentAddress) {
		this.permnentAddress = permnentAddress;
	}

	public Address getHostelAddress() {
		return hostelAddress;
	}

	public void setHostelAddress(Address hostelAddress) {
		this.hostelAddress = hostelAddress;
	}

	@Override
	public String toString() {
		return "Student [sId=" + sId + ", rollNo=" + rollNo + ", sName=" + sName + ", mobNo=" + mobNo + ", emailId="
				+ emailId + ",\n currentAddress=" + currentAddress + ",\n permnentAddress=" + permnentAddress
				+ ",\n hostelAddress=" + hostelAddress + "]";
	}

}
