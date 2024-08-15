package com.core.designpatterns.behavioralpattern.Visitor;

//The Visitor design pattern is a behavioral pattern that lets you define
//new operations on elements of an object structure without changing the 
//elements themselves. This pattern is particularly useful when you need 
//to perform operations on elements of a complex object structure and you
//want to keep the operations separate from the element classes.
public class VisitorPatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(4, 6);

        Visitor areaVisitor = new AreaVisitor();
        Visitor perimeterVisitor = new PerimeterVisitor();

        System.out.println("Calculating areas:");
        circle.accept(areaVisitor);
        rectangle.accept(areaVisitor);

        System.out.println("\nCalculating perimeters:");
        circle.accept(perimeterVisitor);
        rectangle.accept(perimeterVisitor);
	}

}
//Demonstrates how the Visitor pattern allows for operations on Shape objects. 
//Different Visitor implementations are used to calculate areas and perimeters.