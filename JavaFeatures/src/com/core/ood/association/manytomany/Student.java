package com.core.ood.association.manytomany;

import java.util.HashSet;
import java.util.Set;

public class Student {
	private Set<Course> courses = new HashSet<>();

    // Method to add a course
    public void addCourse(Course course) {
        courses.add(course);
    }

    // Getter for courses
    public Set<Course> getCourses() {
        return courses;
    }
}
