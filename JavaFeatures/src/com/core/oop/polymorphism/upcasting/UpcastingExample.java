package com.core.oop.polymorphism.upcasting;

public class UpcastingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create a Dog object
        Dog myDog = new Dog();

        // Upcasting: Dog reference to Animal reference
        Animal myAnimal = myDog; // Implicit upcasting

        // Call method from Animal class
        myAnimal.makeSound(); // Outputs: Dog barks

        // The following line would cause a compile-time error because the fetch method is not in Animal
        // myAnimal.fetch(); // Error: Cannot resolve method 'fetch' in 'Animal'

        // Downcasting (if needed) to call subclass-specific methods
        if (myAnimal instanceof Dog) {
            Dog realDog = (Dog) myAnimal; // Explicit downcasting
            realDog.fetch(); // Outputs: Dog fetches the ball
        }
	}

}
//upcasting is a form of type casting in Java where a subclass object is cast to its 
//superclass type. This is done implicitly by the Java compiler and is useful for treating 
//objects of a more specific type as objects of a more general type. Upcasting allows you to 
//use a superclass reference to refer to a subclass object, enabling polymorphism.
//Benefits of Upcasting:
//Polymorphism: Allows you to write code that can work with objects of any subclass through a common superclass reference.
//Code Flexibility: Makes it easier to manage collections of objects and methods that work with generic types.