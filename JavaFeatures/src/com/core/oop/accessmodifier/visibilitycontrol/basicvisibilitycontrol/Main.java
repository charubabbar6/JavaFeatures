package com.core.oop.accessmodifier.visibilitycontrol.basicvisibilitycontrol;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Superclass superclass = new Superclass();
        Subclass subclass = new Subclass();
        
     // Accessing methods from Superclass
        System.out.println("Accessing Superclass methods:");
        superclass.publicMethod(); // Outputs: Public method in Superclass
        superclass.protectedMethod(); // Outputs: Protected method in Superclass
        superclass.defaultMethod(); // Outputs: Default method in Superclass
        // superclass.privateMethod(); // Error: privateMethod() has private access in Superclass

     // Accessing methods from Subclass
        System.out.println("\nAccessing Subclass methods:");
        subclass.publicMethod(); // Outputs: Public method in Subclass
        subclass.protectedMethod(); // Outputs: Protected method in Subclass
        subclass.defaultMethod(); // Outputs: Default method in Subclass
        
     // Demonstrating visibility restrictions
        System.out.println("\nDemonstrating visibility restrictions:");
        Superclass ref = new Subclass();
        ref.publicMethod(); // Outputs: Public method in Subclass
        ref.protectedMethod(); // Outputs: Protected method in Subclass
        // ref.defaultMethod(); // Error: defaultMethod() is not accessible from Superclass reference

        // Note: private methods are not accessible or overrideable in subclasses
        // Uncommenting below will cause an error:
        // ref.privateMethod(); // Error: privateMethod() has private access in Superclass
        
	}

}
//Restricting Visibility of Methods in Derived Classes
//1. Overriding Methods:
//When a method is overridden in a subclass, the visibility of the overriding method 
//cannot be more restrictive than the method in the superclass. This means that if the
//superclass method is public, the subclass method can be public or protected, but not 
//private or package-private.

//2. Reducing Visibility:
//To reduce visibility in a derived class, you must ensure that the method you are 
//overriding is protected or package-private in the superclass. You cannot make a public
//method in the superclass more restrictive in the subclass.