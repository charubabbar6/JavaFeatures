package com.core.designpatterns.creationalpattern.factorymethodpattern;

//Concrete Creator B
class ConcreteCreatorB extends Creator {

	@Override
	public Product factoryMethod() {
		// TODO Auto-generated method stub
		return new ConcreteProductB();
	}

}
