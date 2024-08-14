package com.core.oop.collectionframework.List;

import java.util.List;
import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create a Vector
        List<String> vector = new Vector<>();
        
        // Add elements
        vector.add("Apple");
        vector.add("Banana");
        vector.add("Cherry");
        
     // Access elements
        System.out.println("Element at index 1: " + vector.get(1)); 
        
     // Iterate over elements
        System.out.println("Vector elements:");
        for (String fruit : vector) {
            System.out.println(fruit);
        }
        
        // Remove an element
        vector.remove("Banana");
        
        // Check the updated list
        System.out.println("Updated Vector elements:");
        for (String fruit : vector) {
            System.out.println(fruit);
        }
	}

}
//Vector is a synchronized resizable array implementation of the List interface. 
//It is thread-safe but has higher overhead due to synchronization.