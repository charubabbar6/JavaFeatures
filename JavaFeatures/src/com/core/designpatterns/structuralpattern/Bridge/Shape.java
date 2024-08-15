package com.core.designpatterns.structuralpattern.Bridge;


//3. Define the Abstraction
//Abstraction
abstract class Shape {
	protected Renderer renderer;

    public Shape(Renderer renderer) {
        this.renderer = renderer;
    }

    abstract void draw();
}
