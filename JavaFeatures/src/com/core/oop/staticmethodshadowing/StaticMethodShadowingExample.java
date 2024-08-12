package com.core.oop.staticmethodshadowing;

public class StaticMethodShadowingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Calling static methods using class names
        Parent.staticMethod(); // Outputs: Static method in Parent
        Child.staticMethod();  // Outputs: Static method in Child
     // Calling static methods using references
        Parent parent = new Child();
        parent.staticMethod(); // Outputs: Static method in Parent (Reference type determines method)

        Child child = new Child();
        child.staticMethod();  // Outputs: Static method in Child
	}

}
//shadowing of static methods
//1. concept of overriding 2. concept of static methods
//if we merge both concepts then shadowing of static methods comes in picture
// static methods are resolved based on the reference type, not the actual object.

//Shadowing vs. Overriding: Static methods do not participate in method overriding. 
//Instead, when a subclass defines a static method with the same name and parameter 
//list as in the superclass, it shadows the superclass method.
//
//Resolution at Compile-Time: The method that is executed is determined at compile-time 
//based on the reference type. The JVM does not perform dynamic dispatch for static methods.
//
//Access to Shadowed Methods: Both the shadowed and shadowing static methods can be 
//accessed using their respective class names. However, a reference of a superclass type 
//will call the static method defined in the superclass, regardless of the actual object type.

