package com.entity;

public class Customer {

	private int cId;
	private String cName;
	private long mobNO;
	private String address;

	public int getcId() {
		return cId;
	}

	public void setcId(int cId) {
		this.cId = cId;
	}

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	public long getMobNO() {
		return mobNO;
	}

	public void setMobNO(long mobNO) {
		this.mobNO = mobNO;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Customer [\n cId=" + cId + ",\n cName=" + cName + ",\n mobNO=" + mobNO + ",\n address=" + address + "]";
	}

}
