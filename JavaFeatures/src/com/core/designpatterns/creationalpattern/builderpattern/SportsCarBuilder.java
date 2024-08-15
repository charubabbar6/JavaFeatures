package com.core.designpatterns.creationalpattern.builderpattern;

//Concrete Builder
public class SportsCarBuilder implements CarBuilder {
	private Car car = new Car();
	@Override
	public void buildModel() {
		// TODO Auto-generated method stub
		car.setModel("Sports Car");
	}

	@Override
	public void buildEngine() {
		// TODO Auto-generated method stub
		car.setEngine("V8 Engine");
	}

	@Override
	public void buildWheels() {
		// TODO Auto-generated method stub
		car.setWheels(4);
	}

	@Override
	public Car getResult() {
		// TODO Auto-generated method stub
		  return car;
	}

}
