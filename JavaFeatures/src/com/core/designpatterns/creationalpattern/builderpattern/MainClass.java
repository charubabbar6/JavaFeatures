package com.core.designpatterns.creationalpattern.builderpattern;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create object of required homebuilder
				EarthQuakeResistantBuilder earthQuakeResistantBuilder = new EarthQuakeResistantBuilder();
				
				//create object of director that will keep an eye on your builder
				Director director = new Director(earthQuakeResistantBuilder);
				
				director.manageRequiredHomeConstruction();
				Home homeConstructedAtTheEnd = director.getComplexObjectOfHome();
				
				System.out.println(homeConstructedAtTheEnd);
				System.out.println(homeConstructedAtTheEnd.floor);
	}

}
//Builder Pattern refers to approach that focuses on constructing a complex object
//from simple objects using step-by-step approach.

//Major roles used in this design patterns are :

//Complex Object / Final Product – e.g. house – complex object which we will generate 
//with builder design pattern
//Builder – abstract class / interface that defines all ways to create the product. 
//It also has getFinalProduct method that will finally return complex object.
//ConcreteBuilder – multiple Builder Impls that will give different final objects 
//which are complex to design,
//Director: Controls complex object creation. It has 2 main goals : 
//1st to call appropriate concrete builder class to create correct complex object.
//2nd to return that complex object.