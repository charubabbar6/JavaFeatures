package com.core.oop.accessmodifier;

public class Parent {
	protected int protectedField = 30;
    private int privateField = 40;

    // Accessor methods for package-private and private fields
    int getDefaultField() {
        return defaultField;
    }

    private int defaultField = 50;

    protected void protectedMethod() {
        System.out.println("Protected method in Parent");
    }

    private void privateMethod() {
        System.out.println("Private method in Parent");
    }

    // Nested static class
    public static class NestedStaticClass {
        public void accessOuterClassFields() {
            System.out.println("Accessing from NestedStaticClass:");
            // Static nested class cannot access instance fields directly
            Parent outer = new Parent();
            System.out.println("Protected field: " + outer.protectedField);  // Accessible
            // System.out.println("Default field: " + outer.defaultField); // Not accessible
            System.out.println("Default field through accessor: " + outer.getDefaultField()); // Accessible
        }
    }

    // Inner class
    public class InnerClass {
        public void accessOuterClassFields() {
            System.out.println("Accessing from InnerClass:");
            // Inner class can access all members of the outer class
            System.out.println("Protected field: " + protectedField); // Accessible
            System.out.println("Default field: " + defaultField); // Accessible
            System.out.println("Private field: " + privateField); // Accessible
        }
    }
}
