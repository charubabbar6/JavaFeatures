package com.core.oop.abstraction;

//Abstract class
abstract class Shape {
 // Abstract method (does not have a body)
 abstract void draw();

 // Regular method
 void color() {
     System.out.println("Coloring the shape");
 }
}
