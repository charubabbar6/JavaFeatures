package com.core.oop.polymorphism.runtime.covariantreturntype;

//Derived class
class Dog extends Animal {
 // Overriding the method with a more specific return type
 @Override
 public Dog getAnimal() {
     return new Dog();
 }

//public Object specialcapability() {
//	System.out.println("I am a Dog");
//	return "Covariant type of child";
//}
 public String specialcapability() {
		System.out.println("I am a Dog");
		return "Covariant type of child";
	}
}
