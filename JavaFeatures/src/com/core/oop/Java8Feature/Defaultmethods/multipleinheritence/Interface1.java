package com.core.oop.Java8Feature.Defaultmethods.multipleinheritence;

public interface Interface1 {
	default void conflictMethod() {
        System.out.println("Interface1's default implementation.");
    }
}
