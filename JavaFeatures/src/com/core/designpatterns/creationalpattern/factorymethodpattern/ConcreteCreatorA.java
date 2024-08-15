package com.core.designpatterns.creationalpattern.factorymethodpattern;

//Concrete Creator A
class ConcreteCreatorA extends Creator {

	@Override
	public Product factoryMethod() {
		// TODO Auto-generated method stub
		return new ConcreteProductA();
	}

}
