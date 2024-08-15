package com.core.designpatterns.structuralpattern.Facade;

//The Facade Pattern provides a unified interface to a set of interfaces in a subsystem, 
//making it easier to use.
public class FacadePatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Facade facade = new Facade();
        facade.operation();
	}

}
