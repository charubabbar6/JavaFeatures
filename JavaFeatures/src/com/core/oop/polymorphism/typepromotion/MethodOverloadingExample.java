package com.core.oop.polymorphism.typepromotion;

public class MethodOverloadingExample {
	// Method with int parameter
    public void display(int a) {
        System.out.println("Integer version: " + a);
    }
//    public void display(long a) {
//        System.out.println("Long version: " + a);
//    }

    // Method with double parameter
    public void display(double a) {
        System.out.println("Double version: " + a);
    }
    public void display(int a,long b) {
        System.out.println( a+b);
    }
    public void display(long a,int b) {
        System.out.println( a+b);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloadingExample example = new MethodOverloadingExample();

        byte byteValue = 5;
        float floatValue = 5.5f;

        // byte is promoted to int
        example.display(byteValue); // Calls the display(int) method

        // float is promoted to double
        example.display(floatValue); // Calls the display(double) method
        
        //example.display(10,20);//cte
	}

}
