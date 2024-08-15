package com.core.designpatterns.structuralpattern.Bridge;

//The Bridge Pattern is a structural design pattern that separates an abstraction
//from its implementation, allowing the two to evolve independently. This pattern 
//is particularly useful when you need to extend the functionality of a system without 
//modifying existing code.
public class BridgePatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Renderer vectorRenderer = new VectorRenderer();
        Renderer rasterRenderer = new RasterRenderer();

        Shape circle1 = new Circle(vectorRenderer, 5, 10, 7);
        Shape circle2 = new Circle(rasterRenderer, 10, 20, 14);

        circle1.draw();  // Output: Drawing a circle at (5.0, 10.0) with radius 7.0 using Vector Renderer.
        circle2.draw();  // Output: Drawing a circle at (10.0, 20.0)
	}

}
//The Bridge Pattern involves:
//
//Abstraction: Defines the abstract interface and maintains a reference to an Implementor object.
//Refined Abstraction: Extends the Abstraction and can add more functionalities.
//Implementor: Defines the interface for implementation classes.
//Concrete Implementor: Implements the Implementor interface and defines specific implementations.