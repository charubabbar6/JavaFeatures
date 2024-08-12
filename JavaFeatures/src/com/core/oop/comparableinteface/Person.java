package com.core.oop.comparableinteface;

import java.util.Arrays;
//In Java, Comparable and Comparator are interfaces used to define the order of objects. 
public class Person implements Comparable<Person> {

	private String name;
	private int age;

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public int compareTo(Person other) {
		// TODO Auto-generated method stub
		return Integer.compare(this.age, other.age);// compare by age
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person[] people = {
	            new Person("Alice", 30),
	            new Person("Bob", 25),
	            new Person("Charlie", 35)
	        };
		Arrays.sort(people);// Sorts using the natural ordering defined by compareTo
		System.out.println("Sorted by age:");
		//System.out.println(Arrays.toString(people));
        for (Person person : people) {
            System.out.println(person);
        }
	}

}
//The Comparable interface is used to define the natural ordering of objects of a class.
//A class that implements Comparable must override the compareTo method.
//
//Comparable Interface Methods
//int compareTo(T o): Compares the current object with the specified object for order. 
//Returns:
//1. A negative integer if the current object is less than the specified object.
//2. Zero if the current object is equal to the specified object.
//3. A positive integer if the current object is greater than the specified object.
//Comparable:
//
//Used to define the natural ordering of a class.
//Implemented by the class itself.
//Only one natural ordering can be defined.