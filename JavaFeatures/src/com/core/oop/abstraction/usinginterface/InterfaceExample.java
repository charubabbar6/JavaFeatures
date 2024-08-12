package com.core.oop.abstraction.usinginterface;

public class InterfaceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Drawable circle = new Circle(); // Creating an instance of Circle
        Drawable rectangle = new Rectangle(); // Creating an instance of Rectangle

        circle.draw(); // Outputs: Drawing a circle
        rectangle.draw(); // Outputs: Drawing a rectangle
	}

}
//achieve 100% abstration
//If we need a class where all my methods are abstract
//all field are public static final in interface bydefault
//all methods are public abstrcat in interface bydefault