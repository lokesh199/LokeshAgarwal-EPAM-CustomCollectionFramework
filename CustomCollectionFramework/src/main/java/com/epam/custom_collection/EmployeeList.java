package com.epam.custom_collection;

import java.util.ArrayList;

import com.epam.custom_employee.Employee;

public class EmployeeList {
	ArrayList<Employee> employee;

	public EmployeeList(int size) {
		this.employee = new ArrayList<Employee>(size);
	}

	public void addAtIndex(int index, Employee employee) {
		this.employee.add(index, employee);
	}

	public boolean addAtEnd(Employee employee) {
		return this.employee.add(employee);
	}

	public void removeEmployee(Employee employee) {
		this.employee.remove(employee);
	}

	public Employee removeAtIndex(int index) {
		return this.employee.remove(index);
	}

	public void display() {
		int count = 1;
		for (Employee employee : this.employee) {
			System.out.println("\n\n" + count 
					+ "\nName = " + employee.getName() 
					+ "\nId = " + employee.getId()
					+ "\nAddress = " + employee.getAddress() 
					+ "\nAge = " + employee.getAge() 
					+ "\nSalary = " + employee.getSalary() 
					+ "\nExperience = " + employee.getExperience()
					);
			count++;
		}
	}
	
	public int size(){
		return this.size();
	}
}