package com.core.designpatterns.creationalpattern.builderpattern;

public class CarDirector {
	
	private CarBuilder builder;
	
	 public CarDirector(CarBuilder builder) {
	        this.builder = builder;
	    }
	 
	 public Car construct() {
	        builder.buildModel();
	        builder.buildEngine();
	        builder.buildWheels();
	        return builder.getResult();
	    }
	
}
