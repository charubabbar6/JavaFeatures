package com.core.oop.staticmethodshadowing;

//Subclass
class Child extends Parent {
 // Static method in subclass with the same signature
 static void staticMethod() {
     System.out.println("Static method in Child");
 }

}
