package com.core.oop.polymorphism.compiletime;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Printer printer = new Printer();
        printer.print(10);           // Calls print(int i)
        printer.print("Hello");      // Calls print(String s)
        printer.print(3.14);         // Calls print(double d)
	}

}
//Compile-time Polymorphism (Method Overloading)/static polymorphism
//Method overloading allows multiple methods in the same class to have the same name 
//but different parameters (different type or number of parameters).
//by changing no. of arguments
//by changing datatypes
//*** Overloading is not possible by changing return type only,It gives CTE due to ambiguity.