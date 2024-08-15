package com.core.designpatterns.structuralpattern.Decorator;


//The Decorator Pattern allows you to add responsibilities to objects dynamically without
//affecting other objects.
public class DecoratorPatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Coffee coffee = new SimpleCoffee();
        System.out.println(coffee.getDescription() + " $" + coffee.cost());

        coffee = new MilkDecorator(coffee);
        System.out.println(coffee.getDescription() + " $" + coffee.cost());
	}

}
