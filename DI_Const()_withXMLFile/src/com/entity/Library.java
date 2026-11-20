package com.entity;

import java.util.List;
//import java.util.Set;

public class Library {

	private int libId;
	private String libName;
	private String libAddress;
	private String libOwner;
	private boolean availablebook;
	private int totalbooks;
	private List<String> books;

	public Library() {

	}

//	public Library(int libId, String libName, String libAddress, String libOwner, boolean availablebook, int totalbooks,
//			Set<String> books) {
//		super();
//		this.libId = libId;
//		this.libName = libName;
//		this.libAddress = libAddress;
//		this.libOwner = libOwner;
//		this.availablebook = availablebook;
//		this.totalbooks = totalbooks;
//		this.books = books;
//	}

	public Library(int libId, String libName, String libAddress, String libOwner, boolean availablebook, int totalbooks,
			List<String> books) {
		super();
		this.libId = libId;
		this.libName = libName;
		this.libAddress = libAddress;
		this.libOwner = libOwner;
		this.availablebook = availablebook;
		this.totalbooks = totalbooks;
		this.books = books;
	}

	@Override
	public String toString() {
		return "Library [libId=" + libId + ", libName=" + libName + ", libAddress=" + libAddress + ", libOwner="
				+ libOwner + ", availablebook=" + availablebook + ", totalbooks=" + totalbooks + ", books=" + books
				+ "]";
	}
	
	

	
}
