package com.core.designpatterns.structuralpattern.Decorator;

//Decorator class
abstract class CoffeeDecorator implements Coffee {
	
	protected Coffee decoratedCoffee;
	
	

	public CoffeeDecorator(Coffee decoratedCoffee) {
		this.decoratedCoffee = decoratedCoffee;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		 return decoratedCoffee.getDescription() ;
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		 return decoratedCoffee.cost() ;
	}

}
