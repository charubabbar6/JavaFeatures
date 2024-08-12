package com.core.oop.comparatorinteface;

import java.util.Arrays;
import java.util.Comparator;

public class Person {
	private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person[] people = {
	            new Person("Alice", 30),
	            new Person("Bob", 25),
	            new Person("Charlie", 35)
	        };
		// Comparator for sorting by name
        Comparator<Person> nameComparator = new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                return p1.getName().compareTo(p2.getName());
            }
        };
        
     // Comparator for sorting by age
        Comparator<Person> ageComparator = new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                return Integer.compare(p1.getAge(), p2.getAge());
            }
        };
        
     // Sort by name
        Arrays.sort(people, nameComparator);
        System.out.println("Sorted by name:");
        for (Person person : people) {
            System.out.println(person);
        }
        
     // Sort by age
        Arrays.sort(people, ageComparator);
        System.out.println("\nSorted by age:");
        for (Person person : people) {
            System.out.println(person);
        }
	}

}
//The Comparator interface is used to define multiple ways to compare objects of a class,
//and it’s useful when you want to sort objects in different ways.
//
//Comparator Interface Methods
//int compare(T o1, T o2): Compares two objects for order. Returns:
//
//1. A negative integer if o1 is less than o2.
//2. Zero if o1 is equal to o2.
//3. A positive integer if o1 is greater than o2.
//boolean equals(Object obj): Checks if this comparator is equal to another object (not usually overridden).
//Comparator:
//
//Used to define multiple ways of comparing objects.
//Implemented externally, typically in a separate class or using lambda expressions.
//Allows for sorting objects in various ways (e.g., by name, by age).