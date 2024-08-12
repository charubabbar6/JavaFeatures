package com.core.oop.Java8Feature.Defaultmethods;

//Class implementing the interface
class MyClass implements MyInterface {

	@Override
	public void abstractMethod() {
		// TODO Auto-generated method stub
		System.out.println("Implementation of abstract method.");
	}
	// Optional: Override defaultMethod if needed
    @Override
    public void defaultMethod() {
        System.out.println("Overridden default method.");
    }

}
