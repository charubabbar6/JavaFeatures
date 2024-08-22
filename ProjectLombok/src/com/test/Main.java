package com.test;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Using the all-args constructor
        Person person = new Person("Charu Babbar", 30, "charubabbar6@gmail.com");

        // Using Lombok-generated getters and toString method
        System.out.println(person.getName());
        System.out.println(person);

        // Modifying the object using Lombok-generated setter
        person.setAge(31);
        System.out.println(person.getAge());
        System.out.println(person);
	}

}
