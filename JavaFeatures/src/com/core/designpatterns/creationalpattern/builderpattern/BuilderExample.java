package com.core.designpatterns.creationalpattern.builderpattern;

//Separates the construction of a complex object from its representation so that the 
//same construction process can create different representations.
public class BuilderExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 CarBuilder builder = new SportsCarBuilder();
	        CarDirector director = new CarDirector(builder);
	        Car car = director.construct();
	        System.out.println(car);
	}

}
