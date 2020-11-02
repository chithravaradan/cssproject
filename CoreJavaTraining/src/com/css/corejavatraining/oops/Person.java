package com.css.corejavatraining.oops;

public class Person {
	private String name;
	private int age;
	private String phone;
	private String email;
	private String address;
	
	public Person(String name, int age, String phone, String email, String address) {
		super();
		this.name = name;
		this.age = age;
		this.phone = phone;
		this.email = email;
		this.address = address;
	}
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", phone=" + phone + ", email=" + email + ", address="
				+ address + "]";
	}
}