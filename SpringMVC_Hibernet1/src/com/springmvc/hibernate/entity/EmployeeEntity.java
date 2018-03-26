package com.springmvc.hibernate.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee")
public class EmployeeEntity {
	
	@Id
	@Column(name="empid")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;  
	
	@Column(name="empName")
	private String name;  
	
	@Column(name="empSalary")
	private float salary;
	
	@Column(name="empDesignation")
	private String designation;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(double d) {
		this.salary = (float) d;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public EmployeeEntity(int id, String name, float salary, String designation) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.designation =designation;
	}
	
	public EmployeeEntity() {
		
	}
	
	
	

}