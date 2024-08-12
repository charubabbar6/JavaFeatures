package com.core.oop.abstraction;

public class AbstractionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape circle = new Circle(); // Creating an instance of Circle
        Shape rectangle = new Rectangle(); // Creating an instance of Rectangle

        circle.draw(); // Outputs: Drawing a circle
        circle.color(); // Outputs: Coloring the shape

        rectangle.draw(); // Outputs: Drawing a rectangle
        rectangle.color(); // Outputs: Coloring the shape
	}

}
//achieve 0% to 100% abstration
//Abstraction in Java is one of the core principles of object-oriented programming (OOP). 
//It involves hiding the complex implementation details of a system and exposing only the 
//necessary parts to the user.
//****
//it can have construtor ,static methods also.
//it can have final methods which will force the subclass not to change the body of method.

//Abstract Classes: An abstract class is a class that cannot be instantiated directly and 
//can contain abstract methods (methods without implementation) as well as concrete methods 
//(methods with implementation). Abstract classes are used to provide a common base for 
//subclasses to extend and implement specific functionality.

//Abstract Methods: An abstract method is a method that is declared in an abstract class 
//but does not have an implementation. Subclasses that extend the abstract class must provide
//implementations for these abstract methods.

//Interfaces: An interface is a reference type in Java that can contain only constants, 
//method signatures, default methods, static methods, and nested types. Interfaces are used 
//to specify a set of methods that a class must implement. Interfaces help achieve abstraction 
//by defining "what" methods a class should have without specifying "how" these methods should 
//be implemented.