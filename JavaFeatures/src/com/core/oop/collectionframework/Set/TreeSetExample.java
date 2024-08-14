package com.core.oop.collectionframework.Set;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create a TreeSet
        Set<String> treeSet = new TreeSet<>();
        
        // Add elements
        treeSet.add("Apple");
        treeSet.add("Banana");
        treeSet.add("Cherry");
        // treeSet.add(null); // This will throw NullPointerException
        
        // Print the TreeSet (elements will be sorted)
        System.out.println("TreeSet elements: " + treeSet);
        
        // Check if an element exists
        boolean hasBanana = treeSet.contains("Banana");
        System.out.println("Contains Banana: " + hasBanana);
        
        // Remove an element
        treeSet.remove("Cherry");
        System.out.println("TreeSet after removal: " + treeSet);
        
        // Iterate over the TreeSet
        System.out.println("Iterating over TreeSet:");
        for (String fruit : treeSet) {
            System.out.println(fruit);
        }
	}

}
//TreeSet is an implementation of the Set interface that uses a Red-Black tree. 
//It is sorted according to natural ordering or by a provided comparator. 
//It does not allow null elements and provides operations that are log(n) time complexity due to the
//underlying tree structure.

//TreeSet:

//Characteristics: Sorted order, does not allow null elements, provides operations in log(n) time complexity.
//Use Case: When you need elements to be in a sorted order and require natural ordering or a custom comparator.