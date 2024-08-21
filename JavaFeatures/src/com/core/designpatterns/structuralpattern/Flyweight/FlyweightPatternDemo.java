package com.core.designpatterns.structuralpattern.Flyweight;



public class FlyweightPatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FlyweightFactory factory = new FlyweightFactory();

        Flyweight flyweight1 = factory.getFlyweight("Arial", 12, "Red");
        Flyweight flyweight2 = factory.getFlyweight("Arial", 12, "Red");
        Flyweight flyweight3 = factory.getFlyweight("Times New Roman", 14, "Blue");

        flyweight1.display('A');
        flyweight2.display('B');
        flyweight3.display('C');
	}

}
//The Flyweight Pattern is a structural design pattern used to minimize memory usage
//by sharing as many objects as possible. It is particularly useful when dealing with a
//large number of objects that have similar data. The pattern achieves this by separating
//the intrinsic state (shared state) from the extrinsic state (unique state), which can be
//managed and adjusted externally.
//Flyweight Interface: Defines the interface for objects that can be shared.
//Concrete Flyweight: Implements the Flyweight interface and stores the intrinsic state.
//Flyweight Factory: Manages the creation and reuse of Flyweight objects.
//Client: Maintains references to Flyweight objects and stores the extrinsic state.

//client-->calls/creates factory instance-->Factory-->contains Map and logic to createnew object
//if not in MAP else return if key exists in Map. -->specific object