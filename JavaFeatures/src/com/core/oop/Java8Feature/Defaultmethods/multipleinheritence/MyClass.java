package com.core.oop.Java8Feature.Defaultmethods.multipleinheritence;

public class MyClass implements Interface1, Interface2{

	@Override
	public void conflictMethod() {
		// TODO Auto-generated method stub
		Interface1.super.conflictMethod();
	}

//	@Override
//    public void conflictMethod() {
//        System.out.println("MyClass's implementation.");
//    }

}
