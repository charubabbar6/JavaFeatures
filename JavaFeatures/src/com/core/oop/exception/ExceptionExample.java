package com.core.oop.exception;

public class ExceptionExample {
	public static void main(String[] args) {
        try {
            int result = divide(10, 0);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed.");
        }
    }

    public static int divide(int a, int b) {
        return a / b; // This will throw an ArithmeticException when b is 0
    }
}
