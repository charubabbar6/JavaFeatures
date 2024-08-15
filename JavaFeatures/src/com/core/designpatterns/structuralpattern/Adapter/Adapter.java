package com.core.designpatterns.structuralpattern.Adapter;

//Adapter class
public class Adapter implements Target {

	private Adaptee adaptee;
	
	public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }
	
	@Override
	public void request() {
		// TODO Auto-generated method stub
		adaptee.specificRequest();
	}

}
