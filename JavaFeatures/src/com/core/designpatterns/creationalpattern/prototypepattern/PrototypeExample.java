package com.core.designpatterns.creationalpattern.prototypepattern;

//Creates new objects by copying an existing object, known as the prototype.
public class PrototypeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConcretePrototype prototype = new ConcretePrototype("Prototype 1");
        ConcretePrototype clone = (ConcretePrototype) prototype.clone();
        
        System.out.println("Original: " + prototype.getName());
        System.out.println("Clone: " + clone.getName());
	}

}
