package com.core.oop.polymorphism.runtime.covariantreturntype;

//Base class
class Animal {
 // Method that returns a generic type Animal
 public Animal getAnimal() {
     return new Animal();
 }
 public Object specialcapability() {
		System.out.println("I am a Animal");
		return "Covariant type of parent";
	}
}
