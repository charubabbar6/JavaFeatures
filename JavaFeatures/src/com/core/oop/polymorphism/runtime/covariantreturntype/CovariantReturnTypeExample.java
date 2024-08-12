package com.core.oop.polymorphism.runtime.covariantreturntype;

public class CovariantReturnTypeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal myAnimal = new Dog(); // Upcasting
        Dog myDog = (Dog) myAnimal.getAnimal(); // getAnimal() returns Dog, so this cast is safe
        System.out.println("Got a dog: " + myDog);
        myAnimal.specialcapability();
        
	}

}
//Key Points about Covariant Return Types:
//Return Type Compatibility: The return type of the overriding method in the subclass must be a 
//subtype of the return type declared in the superclass method.
//
//Method Signature: The method signature (name and parameter list) must remain the same in both the superclass and subclass. 
//Only the return type can vary covariantly.
//
//Type Safety: Covariant return types help in providing more specific types while still adhering to the contract defined by the 
//superclass method, improving type safety and clarity in the code.