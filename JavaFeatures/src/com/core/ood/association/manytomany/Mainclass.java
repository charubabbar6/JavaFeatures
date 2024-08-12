package com.core.ood.association.manytomany;

public class Mainclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create Course objects
        Course math = new Course();
        Course science = new Course();
     // Create Student objects
        Student charu = new Student();
        Student sushant = new Student();
        
     // Add students to courses
        math.addStudent(charu);
        math.addStudent(sushant);

        science.addStudent(charu);
        
     // Add courses to students
        charu.addCourse(math);
        charu.addCourse(science);
        sushant.addCourse(math);
        
     // Display the courses each student is enrolled in
        System.out.println("Courses for Alice:");
        for (Course course : charu.getCourses()) {
            System.out.println(course);
        }

        System.out.println("Courses for Bob:");
        for (Course course : sushant.getCourses()) {
            System.out.println(course);
        }

        // Display the students enrolled in each course
        System.out.println("Students in Math course:");
        for (Student student : math.getStudents()) {
            System.out.println(student);
        }

        System.out.println("Students in Science course:");
        for (Student student : science.getStudents()) {
            System.out.println(student);
        }
	}

}
