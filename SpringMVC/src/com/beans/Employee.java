package com.beans;

public class Employee {

	private String name;
	//private int id;
	private double salary;
	private String designation;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(String name, double salary, String designation) {
		super();
		this.name = name;
		//this.id = id;
		this.salary = salary;
		this.designation = designation;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	/*public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}*/
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
}
