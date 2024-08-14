package com.core.oop.collectionframework.Set;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create a LinkedHashSet
        Set<String> linkedHashSet = new LinkedHashSet<>();
        
        // Add elements
        linkedHashSet.add("Apple");
        linkedHashSet.add("Banana");
        linkedHashSet.add("Cherry");
        linkedHashSet.add("Apple"); // Duplicate element, will not be added
        
        // Print the LinkedHashSet
        System.out.println("LinkedHashSet elements: " + linkedHashSet);
        
        // Check if an element exists
        boolean hasBanana = linkedHashSet.contains("Banana");
        System.out.println("Contains Banana: " + hasBanana);
        
        // Remove an element
        linkedHashSet.remove("Cherry");
        System.out.println("LinkedHashSet after removal: " + linkedHashSet);
        
        // Iterate over the LinkedHashSet
        System.out.println("Iterating over LinkedHashSet:");
        for (String fruit : linkedHashSet) {
            System.out.println(fruit);
        }
	}

}
//LinkedHashSet is an implementation of the Set interface that uses a hash table and a linked list. 
//It maintains the insertion order of elements, unlike HashSet. This means that elements are iterated in the 
//order they were added.
//
//LinkedHashSet:
//
//Characteristics: Maintains insertion order, allows null elements.
//Use Case: When you need to preserve the order of elements as they were added.