package com.core.oop.collectionframework.Set;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetSortedExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create a TreeSet
        Set<String> treeSet = new TreeSet<>();
        
        // Add elements to the TreeSet
        treeSet.add("Apple");
        treeSet.add("Banana");
        treeSet.add("Cherry");
        treeSet.add("Date");
        treeSet.add("Fig");
        treeSet.add("Grape");
        
     // Print the TreeSet (elements will be sorted in ascending order)
        
        System.out.println("TreeSet elements (sorted): " + treeSet);
        
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
        
        // Get the first and last elements
        System.out.println("First element: " + ((TreeSet<String>) treeSet).first());
        System.out.println("Last element: " + ((TreeSet<String>) treeSet).last());
        
        // Get elements in a range
        Set<String> subSet = ((TreeSet<String>) treeSet).subSet("Banana", "Fig");
        System.out.println("Subset from Banana to Fig: " + subSet);
        
        // Get elements greater than a certain value
        Set<String> tailSet = ((TreeSet<String>) treeSet).tailSet("Date");
        System.out.println("Tail set from Date: " + tailSet);
        
        // Get elements less than a certain value
        Set<String> headSet = ((TreeSet<String>) treeSet).headSet("Fig");
        System.out.println("Head set up to Fig: " + headSet);
	}

}
//TreeSet is a commonly used implementation of the SortedSet interface. 
//It maintains elements in a sorted order based on their natural ordering or a provided comparator
//Use when you need a sorted collection and the ability to perform range operations.