package com.core.oop.Java8Feature.Defaultmethods.multipleinheritence;

public interface Interface2 {
	default void conflictMethod() {
        System.out.println("Interface2's default implementation.");
    }
}
