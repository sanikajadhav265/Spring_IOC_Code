package com.entity;

import java.util.List;
import java.util.Set;

public class Product {
	
	private int productId;
	private String productName;
	private double productPrice;
	private int productQuantity;
	private Set<String> customer;
	
//	public List<String> getCustomer() {
//		return customer;
//	}
//	public void setCustomer(List<String> customer) {
//		this.customer = customer;
//	}
	public int getProductId() {
		return productId;
	}
	public Set<String> getCustomer() {
		return customer;
	}
	public void setCustomer(Set<String> customer) {
		this.customer = customer;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}
	public int getProductQuantity() {
		return productQuantity;
	}
	public void setProductQuantity(int productQuantity) {
		this.productQuantity = productQuantity;
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productPrice=" + productPrice
				+ ", productQuantity=" + productQuantity + ", customer=" + customer + "]";
	}
		
		
	
	
	
	

}
