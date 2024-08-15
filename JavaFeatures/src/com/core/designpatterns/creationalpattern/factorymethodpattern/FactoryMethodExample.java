package com.core.designpatterns.creationalpattern.factorymethodpattern;
//Defines an interface for creating an object, but allows subclasses to alter the type of 
//objects that will be created.
public class FactoryMethodExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Creator creatorA = new ConcreteCreatorA();
        Product productA = creatorA.factoryMethod();
        productA.use();
        
        Creator creatorB = new ConcreteCreatorB();
        Product productB = creatorB.factoryMethod();
        productB.use();
	}

}
