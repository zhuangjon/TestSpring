package com.tedu.spring.bean;

public class Person {
	private String username;
	private Integer age;
	private Car car;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Car getCar() {
		return car;
	}
	public void setCar(Car car) {
		this.car = car;
	}
	public Person(String username, Integer age, Car car) {
		super();
		this.username = username;
		this.age = age;
		this.car = car;
	}
	public Person() {
		super();
	}
	@Override
	public String toString() {
		return "Person [username=" + username + ", age=" + age + ", car=" + car + "]";
	}
}
