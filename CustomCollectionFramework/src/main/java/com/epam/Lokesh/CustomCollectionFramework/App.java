package com.epam.Lokesh.CustomCollectionFramework;

import java.util.Scanner;

import com.epam.custom_collection.EmployeeList;
import com.epam.custom_employee.Employee;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the number of employees: ");
		int noOfEmployees = scanner.nextInt();
		scanner.nextLine(); // to flush the input stream
		EmployeeList listOfEmployees = new EmployeeList(noOfEmployees);

		for (int index = 0; index < noOfEmployees; index++) {
			Employee employeeObject = new Employee();

			System.out.println("Enter the name of Employee " + (index + 1) + ": ");
			String name = scanner.nextLine();
			employeeObject.setName(name);

			System.out.println("Enter the id of Employee " + (index + 1) + ": ");
			String id = scanner.next();
			scanner.nextLine(); // to flush the input stream
			employeeObject.setId(id);

			System.out.println("Enter the address of Employee " + (index + 1) + ": "); // address
			String address = scanner.nextLine();
			employeeObject.setAddress(address);

			System.out.println("Enter the age of Employee " + (index + 1) + ": "); // age
			int age = scanner.nextInt();
			employeeObject.setAge(age);
			scanner.nextLine(); //for flushing the input stream

			System.out.println("Enter the salary of Employee " + (index + 1) + ": "); // salary
			double salary = scanner.nextDouble();
			employeeObject.setSalary(salary);

			System.out.println("Enter the experience of Employee " + (index + 1) + ": ");// experience
			int experience = scanner.nextInt();
			scanner.nextLine(); //to flush the input stream
			employeeObject.setExperience(experience);

			listOfEmployees.addAtEnd(employeeObject);
		}
		
		listOfEmployees.display();
		scanner.close();
	}
}
