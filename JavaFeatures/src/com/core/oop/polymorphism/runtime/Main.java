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
        //myCat.privatemethod();//The method privatemethod() from the type Animal is not visible
        myCat.staticmethod();//static method in parent//but we can't override//method hiding
	}

}
//Runtime Polymorphism (Method Overriding)/Dynamic polymorphism
//Method overriding occurs when a subclass provides a specific implementation for a method 
//that is already defined in its superclass. At runtime, Java determines which method to execute
//based on the object's runtime type.
//Reference Variable 1. Object of child class 2. Object of Parent class.
//***************
//Can you override a private or static method in Java?
//		1) you can not override a private or static method in Java.
//
//		2) you cannot override a private method in sub class because it's not accessible there, 
//what you do is create another private method with the same name in the child class.
//
//		3) For static methods if you create a similar method with same return type and same method arguments in
//child class then it will hide the superclass method, this is known as method hiding.
