package com.core.oop.accessmodifier.visibilitycontrol.basicvisibilitycontrol;

//Superclass
public class Superclass {
	// Public method in superclass
    public void publicMethod() {
        System.out.println("Public method in Superclass");
    }
 // Protected method in superclass
    protected void protectedMethod() {
        System.out.println("Protected method in Superclass");
    }
 // Default (package-private) method in superclass
    void defaultMethod() {
        System.out.println("Default method in Superclass");
    }

    // Private method in superclass (cannot be overridden)
    private void privateMethod() {
        System.out.println("Private method in Superclass");
    }
}
