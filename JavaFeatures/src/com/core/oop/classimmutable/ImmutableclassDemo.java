package com.core.oop.classimmutable;

public class ImmutableclassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Create an immutable Person object
        Person person = new Person("Alice", 30);
        // Print details of the person
        System.out.println(person);
     // Access fields via getters
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
     // Attempting to change fields is not possible because there are no setters
        // person.setName("Bob"); // This would not compile
	}

}
//Declare the class as final to prevent subclassing.
//Make all fields private so that direct access is not allowed
//and final so they can only be assigned once.
//Provide no setter methods to modify fields.
//initailize all fields via constructor performing a deep copy.
//perform cloning of objects in getter methods to return a copy rather than returning the actual object reference.
//Ensure that methods that return object references return new instances rather than 
//modifying internal state.