package com.core.designpatterns.creationalpattern.prototypepattern;

//Creates new objects by copying an existing object, known as the prototype.
public class PrototypeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConcretePrototype prototype = new ConcretePrototype("Prototype 1");
        ConcretePrototype clone = (ConcretePrototype) prototype.clone();
        
        System.out.println("Original: " + prototype.getName());
        System.out.println("Clone: " + clone.getName());
	}

}
//prototype pattern refers to craeting duplicate object while keeping performance in mind.
//it involves implementing a prototype interface which tells to craete a clone of the current object.
//This pattern is used when creation of object directly is costly.e.g. datbase calls are required  too much 
//processing that will take a lot of memory.

//We can cache the object ,returns its clone on next request.
//
//Steps:
//1) create main class which call CacheImpl Class.
//2) CacheImpl class has 2 methods : 1st to load the key value in map and 
//create the cache. 2nd to return the required cloned object.
//3) The main class , parent of all reuired concerete class contains cloning technique. 
//Rest concrete class are normal POJOs, nothing special.
//
//Mainclass--->loads cache  & returns required class instance clone-->profession-->engineer
//																			|
//																			|--->Doctor
//																			|
//																			|--->Teacher