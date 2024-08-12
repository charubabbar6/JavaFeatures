package com.core.oop.polymorphism.upcasting;

//Derived class
class Dog extends Animal {
 @Override
 public void makeSound() {
     System.out.println("Dog barks");
 }

 public void fetch() {
     System.out.println("Dog fetches the ball");
 }
}