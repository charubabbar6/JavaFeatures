package com.core.oop.collectionframework.Set;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create a HashSet
        Set<String> hashSet = new HashSet<>();
        
        // Add elements
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Cherry");
        hashSet.add("Apple"); // Duplicate element, will not be added
        
        // Print the HashSet
        System.out.println("HashSet elements: " + hashSet);
        
        // Check if an element exists
        boolean hasBanana = hashSet.contains("Banana");
        System.out.println("Contains Banana: " + hasBanana);
        
        // Remove an element
        hashSet.remove("Cherry");
        System.out.println("HashSet after removal: " + hashSet);
        
        // Iterate over the HashSet
        System.out.println("Iterating over HashSet:");
        for (String fruit : hashSet) {
            System.out.println(fruit);
        }
	}

}
//HashSet is an implementation of the Set interface that uses a hash table. 
//It does not guarantee any specific order of elements. It is best suited for situations where fast lookups and 
//operations like add, remove, and contains are required.

//HashSet:

//Characteristics: Unordered, does not guarantee any specific order, allows null elements.
//Use Case: When you need fast performance and don’t care about the order of elements.