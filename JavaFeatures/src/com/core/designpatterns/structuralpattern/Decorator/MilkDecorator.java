package com.core.designpatterns.structuralpattern.Decorator;

public class MilkDecorator extends CoffeeDecorator  {

	public MilkDecorator(Coffee decoratedCoffee) {
		super(decoratedCoffee);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return decoratedCoffee.getDescription() + ", Milk";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		 return decoratedCoffee.cost() + 2;
	}

}
