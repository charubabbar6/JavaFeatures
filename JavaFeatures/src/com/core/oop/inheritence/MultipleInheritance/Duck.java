package com.core.oop.inheritence.MultipleInheritance;

public class Duck  implements Flyable, Swimmable{

	@Override
	public void swim() {
		// TODO Auto-generated method stub
		System.out.println("The duck swims.");
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("The duck flies.");
	}

}
//Java does not support multiple inheritance of classes to avoid complexity and ambiguity. 
//However, a class can implement multiple interfaces.