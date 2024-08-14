package com.core.oop.polymorphism.runtime;

//Base class
class Animal {
 // Method to be overridden
 public void makeSound() {
     System.out.println("Animal makes a sound");
 }
 private void privatemethod() {
	 System.out.println("private method in parent");
 }
 static void staticmethod() {
	 System.out.println("static method in parent");
 }
}