package com.core.oop.Java8Feature.Staticmethods;

public class StaticMethodExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // Calling static methods using the interface name
        int sum = MathOperations.add(5, 3); // Calls MathOperations.add()
        double root = MathOperations.squareRoot(16); // Calls MathOperations.squareRoot()

        System.out.println("Sum: " + sum); // Outputs: Sum: 8
        System.out.println("Square root: " + root); // Outputs: Square root: 4.0
        
        // Static methods cannot be called through an implementing class instance
        // The following line would cause a compile-time error:
        // MyClass myClass = new MyClass();
        // myClass.add(5, 3); // Error: Cannot resolve method 'add' in 'MyClass'
	}

}
