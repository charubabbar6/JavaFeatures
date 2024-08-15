package com.core.designpatterns.structuralpattern.Bridge;

//Concrete Implementor 2
public class RasterRenderer implements Renderer {

	@Override
	public void renderCircle(float x, float y, float radius) {
		// TODO Auto-generated method stub
		System.out.println("Drawing a circle at (" + x + ", " + y + ") with radius " + radius + " using Raster Renderer.");
	}

}
