package com.core.ood.association.onetomany;
//A one-to-many association means that one object of a class is associated 
//with multiple objects of another class.
import java.util.ArrayList;
import java.util.List;

public class Department {
	private List<Employee> employees = new ArrayList<>();

    // Method to add an employee
    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    // Getter for employees
    public List<Employee> getEmployees() {
        return employees;
    }
}
