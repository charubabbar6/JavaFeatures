package com.core.designpatterns.structuralpattern.Bridge;

//4. Create Refined Abstractions
//Refined Abstraction
public class Circle extends Shape{
	
	private float x, y, radius;

	public Circle(Renderer renderer, float x, float y, float radius) {
		super(renderer);
		// TODO Auto-generated constructor stub
		this.x = x;
        this.y = y;
        this.radius = radius;
	}
	 @Override
	    void draw() {
	        renderer.renderCircle(x, y, radius);
	    }

}
