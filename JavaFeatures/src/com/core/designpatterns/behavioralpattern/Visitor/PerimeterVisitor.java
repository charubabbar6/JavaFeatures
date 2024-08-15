package com.core.designpatterns.behavioralpattern.Visitor;

//ConcreteVisitor
//Implements the visitor interface and defines the specific operations for each type of element.
public class PerimeterVisitor implements Visitor {

	@Override
	public void visit(Circle circle) {
		// TODO Auto-generated method stub
		double perimeter = 2 * Math.PI * circle.getRadius();
        System.out.println("Perimeter of Circle: " + perimeter);
	}

	@Override
	public void visit(Rectangle rectangle) {
		// TODO Auto-generated method stub
		double perimeter = 2 * (rectangle.getWidth() + rectangle.getHeight());
        System.out.println("Perimeter of Rectangle: " + perimeter);
	}

}
