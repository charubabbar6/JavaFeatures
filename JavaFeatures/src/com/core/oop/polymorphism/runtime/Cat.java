package com.core.oop.polymorphism.runtime;

//Another derived class
class Cat extends Animal {
 @Override
 public void makeSound() {
     System.out.println("Cat meows");
 }
 private void privatemethod() {
	 System.out.println("private method in child");
 }
 static void staticmethod() {
	 System.out.println("static method in child");
 }
}
