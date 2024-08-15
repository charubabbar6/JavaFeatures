package com.core.designpatterns.structuralpattern.Decorator;

//Concrete component
public class SimpleCoffee implements Coffee {

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return "Simple coffee";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 5;
	}

}
