package com.core.ood.association.onetomany;

import java.util.List;

public class Mainclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create Department object
        Department department = new Department();
     // Create Employee objects
        Employee employee1 = new Employee();
        employee1.setName("Charu");
        Employee employee2 = new Employee();
        employee2.setName("Arjun");

        Employee employee3 = new Employee();
        employee3.setName("Sushant");
     // Add Employee objects to the Department
        department.addEmployee(employee1);
        department.addEmployee(employee2);
        department.addEmployee(employee3);
        // Retrieve and display the list of employees
        List<Employee> employees = department.getEmployees();
        System.out.println("Employees in the department:");
        for (Employee employee : employees) {
            System.out.println(employee.getName());
        }
		}

}
