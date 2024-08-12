package com.core.oop.passbyvalue;

public class PassByValueExample {
	public static void modifyPrimitive(int x) {
        x = 10; // Modifies the copy of the value
       // System.out.println("Value of x: " + x);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 5;
		System.out.println("Value of a before modifyPrimitive: " + a); // Outputs: 5
        modifyPrimitive(a);
        System.out.println("Value of a after modifyPrimitive: " + a); // Outputs: 5
	}

}
