package com.entity;

public class Product {

	private int pId;
	private String pName;
	private double price;
	private int quantity;
	private boolean isAvailable;
	private Customer customer;
	public int getpId() {
		return pId;
	}
	public void setpId(int pId) {
		this.pId = pId;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public boolean getIsAvailable() {
		return isAvailable;
	}
	public void setIsAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	@Override
	public String toString() {
		return "Product [\n pId=" + pId + ",\n pName=" + pName + ",\n price=" + price + ",\n quantity=" + quantity
				+ ",\n isAvailable=" + isAvailable + ",\n customer=" + customer + "]";
	}

	
}
