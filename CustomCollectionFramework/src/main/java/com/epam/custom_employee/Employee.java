package com.epam.custom_employee;

public class Employee {
	private String employeeName;
	private String employeeId;
	private String employeeAddress;
	private int employeeAge;
	private double salary;
	private int experience;

	public String getName() {
		return this.employeeName;
	}

	public String getId() {
		return this.employeeId;
	}

	public String getAddress() {
		return this.employeeAddress;
	}

	public int getAge() {
		return this.employeeAge;
	}

	public double getSalary() {
		return this.salary;
	}

	public int getExperience() {
		return this.experience;
	}

	public void setName(String name) {
		this.employeeName = name;
	}

	public void setId(String id) {
		this.employeeId = id;
	}

	public void setAddress(String address) {
		this.employeeAddress = address;
	}

	public void setAge(int age) {
		this.employeeAge = age;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}
}