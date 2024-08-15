package com.core.designpatterns.creationalpattern.builderpattern;

// Product
public class Car {
	private String model;
    private String engine;
    private int wheels;
	public void setModel(String model) {
		this.model = model;
	}
	public void setEngine(String engine) {
		this.engine = engine;
	}
	public void setWheels(int wheels) {
		this.wheels = wheels;
	}
	@Override
	public String toString() {
		return "Car [model=" + model + ", engine=" + engine + ", wheels=" + wheels + "]";
	}
    
    
}
