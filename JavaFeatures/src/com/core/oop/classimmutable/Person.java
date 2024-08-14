package com.core.oop.classimmutable;

public final class Person {
	private final String name;
    private final int age;

    // Constructor initializes the fields
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter for name (no setter to modify it)
    public String getName() {
        return name;
    }

    // Getter for age (no setter to modify it)
    public int getAge() {
        return age;
    }

    // toString() for a meaningful representation
    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }
}
