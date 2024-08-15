package com.core.designpatterns.structuralpattern.Bridge;

//2.Create Concrete Implementors
//Concrete Implementor 1
public class VectorRenderer implements Renderer {

	@Override
	public void renderCircle(float x, float y, float radius) {
		// TODO Auto-generated method stub
		System.out.println("Drawing a circle at (" + x + ", " + y + ") with radius " + radius + " using Vector Renderer.");
	}

}
