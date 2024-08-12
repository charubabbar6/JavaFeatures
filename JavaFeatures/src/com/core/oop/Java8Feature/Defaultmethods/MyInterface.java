package com.core.oop.Java8Feature.Defaultmethods;

//Interface with a default method
interface MyInterface {
 // Abstract method (does not have a body)
 void abstractMethod();

 // Default method with implementation
 default void defaultMethod() {
     System.out.println("This is a default method.");
 }
}
