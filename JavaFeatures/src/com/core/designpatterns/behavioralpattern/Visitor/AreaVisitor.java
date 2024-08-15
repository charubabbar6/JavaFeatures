package com.core.designpatterns.behavioralpattern.Visitor;

//ConcreteVisitor
//Implements the visitor interface and defines the specific operations for each type of element.
public class AreaVisitor implements Visitor {

	@Override
	public void visit(Circle circle) {
		// TODO Auto-generated method stub
		double area = Math.PI * circle.getRadius() * circle.getRadius();
        System.out.println("Area of Circle: " + area);
	}

	@Override
	public void visit(Rectangle rectangle) {
		// TODO Auto-generated method stub
		double area = rectangle.getWidth() * rectangle.getHeight();
        System.out.println("Area of Rectangle: " + area);
	}

}
