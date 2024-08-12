package com.core.oop.polymorphism.runtime.fieldhiding;

//Derived class
class Dog extends Animal {
 // Data member hiding
 public String name = "Dog";

 @Override
 public void makeSound() {
     System.out.println("Dog barks");
 }

 public void showName() {
     System.out.println("Dog's name: " + name);
 }
}