package com.roberttaylor.spring.test;

import org.springframework.beans.factory.annotation.InitDestroyAnnotationBeanPostProcessor;

public class Address {
	private String street;
	private String postcode;
	
	public Address() {
		
	}
	
	public Address(String street, String postcode) {
		super();
		this.street = street;
		this.postcode = postcode;
	}
	
	public void init() {
		System.out.println("Bean Created " + this);
	}

	@Override
	public String toString() {
		return "Address [street=" + street + ", postcode=" + postcode + "]";
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getPostcode() {
		return postcode;
	}

	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}
	
	
	
	
	
}
