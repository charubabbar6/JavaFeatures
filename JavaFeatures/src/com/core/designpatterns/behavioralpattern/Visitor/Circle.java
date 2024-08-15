package com.core.designpatterns.behavioralpattern.Visitor;

//ConcreteElements
//Implements the element interface and provides an implementation 
//of the accept method, which calls the visit method on the visitor.
public class Circle implements Shape {
	private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
	@Override
	public void accept(Visitor visitor) {
		// TODO Auto-generated method stub
		 visitor.visit(this);
	}

}
