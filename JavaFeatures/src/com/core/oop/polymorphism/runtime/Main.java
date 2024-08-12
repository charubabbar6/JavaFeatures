package com.core.oop.polymorphism.runtime;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal myAnimal = new Animal(); // Animal reference and object
        Animal myDog = new Dog();       // Animal reference but Dog object
        Animal myCat = new Cat();       // Animal reference but Cat object
        
        myAnimal.makeSound(); // Outputs: Animal makes a sound
        myDog.makeSound();    // Outputs: Dog barks
        myCat.makeSound();    // Outputs: Cat meows
	}

}
//Runtime Polymorphism (Method Overriding)/Dynamic polymorphism
//Method overriding occurs when a subclass provides a specific implementation for a method 
//that is already defined in its superclass. At runtime, Java determines which method to execute
//based on the object's runtime type.
//Reference Variable 1. Object of child class 2. Object of Parent class.