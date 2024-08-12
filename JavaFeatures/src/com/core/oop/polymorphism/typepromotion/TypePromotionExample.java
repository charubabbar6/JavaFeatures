package com.core.oop.polymorphism.typepromotion;

public class TypePromotionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte byteValue = 10;
        short shortValue = 20;
        char charValue = 'A'; // ASCII value 65
     // Promotion to int
        int result = byteValue + shortValue; // byte and short are promoted to int
        System.out.println("Result of byte + short: " + result); // Outputs 30
     // Promotion to int and then to double
        double doubleResult = byteValue + charValue; // byte and char are promoted to int, then to double
        System.out.println("Result of byte + char (double): " + doubleResult); // Outputs 75.0

        // Promotion to float
        float floatValue = 3.14f;
        float promotedFloat = byteValue + floatValue; // byte is promoted to float
        System.out.println("Result of byte + float: " + promotedFloat); // Outputs 13.14

	}

}
//cte if two methods are there which one to call
