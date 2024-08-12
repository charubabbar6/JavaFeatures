package com.core.oop.abstraction;

//Subclass that extends Shape
class Circle extends Shape {
 // Providing implementation for the abstract method
 @Override
 void draw() {
     System.out.println("Drawing a circle");
 }
}
