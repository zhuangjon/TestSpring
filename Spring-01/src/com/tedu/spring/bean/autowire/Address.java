package com.tedu.spring.bean.autowire;

public class Address {
	private String city;

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Address(String city) {
		super();
		this.city = city;
	}

	public Address() {
		super();
	}

	@Override
	public String toString() {
		return "Address [city=" + city + "]";
	}
	
}
