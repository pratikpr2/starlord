package com.bridgelabz.constructorinjection;

public class Employee {

	private int id;
	private String name;
	private Address address;
	
	public Employee() {
		System.out.println("Default Constructor");
	}
	
	public Employee(int id,String name,Address address) {
		this.id=id;
		this.name=name;
		this.address=address;
	}
	void show() {
		System.out.println(id+" "+name);
		System.out.println(address.toString());
	}
}
