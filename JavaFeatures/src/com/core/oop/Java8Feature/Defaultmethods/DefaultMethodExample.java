package com.core.oop.Java8Feature.Defaultmethods;

public class DefaultMethodExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyClass myClass = new MyClass();

        // Call the overridden method
        myClass.abstractMethod(); // Outputs: Implementation of abstract method.

        // Call the default method
        myClass.defaultMethod(); // Outputs: Overridden default method.
	}

}
