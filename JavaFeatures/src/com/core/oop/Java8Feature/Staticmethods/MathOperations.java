package com.core.oop.Java8Feature.Staticmethods;

//Define an interface with static methods
interface MathOperations {
 
 // Static method in interface
 static int add(int a, int b) {
     return a + b;
 }
 
 // Static method in interface
 static double squareRoot(double number) {
     return Math.sqrt(number);
 }
 
 // Default method (not static)
 default void printResult(int result) {
     System.out.println("Result: " + result);
 }
}
