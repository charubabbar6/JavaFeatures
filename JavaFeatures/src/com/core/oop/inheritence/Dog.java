package com.core.oop.inheritence;

public class Dog extends Animal{
	
	public void bark() {
        System.out.println("The dog barks.");
    }
	public void eat() {
        super.eat(); // Calls the parent class's eat method
        System.out.println("The dog eats kibble.");
    }

}
