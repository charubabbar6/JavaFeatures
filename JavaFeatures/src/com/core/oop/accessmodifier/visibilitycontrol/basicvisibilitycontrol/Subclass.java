package com.core.oop.accessmodifier.visibilitycontrol.basicvisibilitycontrol;

//Subclass
public class Subclass extends Superclass {
	// Overriding public method - must remain public or protected
    @Override
    public void publicMethod() {
        System.out.println("Public method in Subclass");
    }

    // Overriding protected method - can be protected or public
    @Override
    protected void protectedMethod() {
        System.out.println("Protected method in Subclass");
    }

    // Overriding default method - can be protected, public, or default
    @Override
    void defaultMethod() {
        System.out.println("Default method in Subclass");
    }
  
    // Cannot override private method - it's not visible to subclass
    // private void privateMethod() {} // Not allowed

}
