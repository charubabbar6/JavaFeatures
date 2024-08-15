package com.core.designpatterns.structuralpattern.Adapter;

//The Adapter Pattern allows incompatible interfaces to work together. 
//It acts as a bridge between two incompatible interfaces.
public class AdapterPatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Adaptee adaptee = new Adaptee();
        Target target = new Adapter(adaptee);
        target.request();  // Output: Specific request
	}

}
