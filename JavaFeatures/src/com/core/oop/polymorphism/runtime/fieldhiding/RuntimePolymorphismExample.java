package com.core.oop.polymorphism.runtime.fieldhiding;

public class RuntimePolymorphismExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal myAnimal = new Dog(); // Upcasting to Animal reference

        // Runtime polymorphism
        myAnimal.makeSound(); // Outputs: Dog barks

        // Accessing field (shows base class field due to reference type)
        System.out.println("Animal's name: " + myAnimal.name); // Outputs: Animal

        // Downcasting to access subclass-specific method and field
        if (myAnimal instanceof Dog) {
            Dog myDog = (Dog) myAnimal; // Downcasting
            myDog.showName(); // Outputs: Dog's name: Dog
        }
	}

}
//Key Points on Runtime Polymorphism and Data Members
//Method Polymorphism: Runtime polymorphism is achieved through method overriding. 
//When a subclass provides its own implementation of a method that is already defined in its superclass, 
//the version of the method that is executed is determined at runtime based on the object's actual type.
//
//Data Members (Fields): Fields are not polymorphic. If a subclass defines a field with the same name as a field in its superclass,
//this is not method overriding but rather field hiding. The field in the subclass hides the field in the superclass, 
//but does not override it.