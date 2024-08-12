package com.core.ood.association.manytoone;

public class Mainclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create Department object
        Department department = new Department();
        department.setDepartmentName("Human Resources");
     // Create Employee object
        Employee employee = new Employee();
        employee.setDepartment(department);
     // Retrieve and display the department name through the employee
        Department empDepartment = employee.getDepartment();
        if (empDepartment != null) {
            System.out.println("Employee's Department: " + empDepartment.getDepartmentName());
        } else {
            System.out.println("Employee is not assigned to any department.");
        }
	}

}
