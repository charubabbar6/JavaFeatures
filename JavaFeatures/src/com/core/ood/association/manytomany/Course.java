package com.core.ood.association.manytomany;

import java.util.HashSet;
import java.util.Set;

public class Course {
	private Set<Student> students = new HashSet<>();

    // Method to add a student
    public void addStudent(Student student) {
        students.add(student);
    }

    // Getter for students
    public Set<Student> getStudents() {
        return students;
    }
}
