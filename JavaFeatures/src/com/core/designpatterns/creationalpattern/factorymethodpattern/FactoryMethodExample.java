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
//In the Factory pattern, we don't expose the creation logic to 
//the client and refer the created object using a standard interface.
//Factory pattern is also known as virtual constructor.

//Steps:
//1) create main class which call factory class.
//2) Factory class returns required class instance 

//e.g. Main class--->factory class---|
//									 |
//									 Professtion
//									 	|
//						-----------------------------------
//						|				|				   |
//						Enginner		Doctor			Teacher