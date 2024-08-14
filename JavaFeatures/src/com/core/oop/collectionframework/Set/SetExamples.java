package com.core.oop.collectionframework.Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // Example 1: HashSet
        System.out.println("HashSet Example:");
        Set<String> hashSet = new HashSet<>();
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Cherry");
        hashSet.add("Date");
        hashSet.add("Apple"); // Duplicate, will not be added
        System.out.println("HashSet elements: " + hashSet);
        
        boolean hasBanana = hashSet.contains("Banana");
        System.out.println("Contains Banana: " + hasBanana);
        
        hashSet.remove("Cherry");
        System.out.println("HashSet after removal: " + hashSet);
        
        System.out.println("Iterating over HashSet:");
        for (String fruit : hashSet) {
            System.out.println(fruit);
        }
        
     // Example 2: LinkedHashSet
        System.out.println("\nLinkedHashSet Example:");
        Set<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("Apple");
        linkedHashSet.add("Banana");
        linkedHashSet.add("Cherry");
        linkedHashSet.add("Date");
        linkedHashSet.add("Apple"); // Duplicate, will not be added
        
        System.out.println("LinkedHashSet elements: " + linkedHashSet);
        
        boolean hasCherry = linkedHashSet.contains("Cherry");
        System.out.println("Contains Cherry: " + hasCherry);
        
        linkedHashSet.remove("Date");
        System.out.println("LinkedHashSet after removal: " + linkedHashSet);
        
        System.out.println("Iterating over LinkedHashSet:");
        for (String fruit : linkedHashSet) {
            System.out.println(fruit);
            
         // Example 3: TreeSet
            System.out.println("\nTreeSet Example:");
            Set<String> treeSet = new TreeSet<>();
            treeSet.add("Apple");
            treeSet.add("Banana");
            treeSet.add("Cherry");
            treeSet.add("Date");
            // treeSet.add(null); // This will throw NullPointerException
            
            System.out.println("TreeSet elements (sorted): " + treeSet);
            
            boolean hasDate = treeSet.contains("Date");
            System.out.println("Contains Date: " + hasDate);
            
            treeSet.remove("Banana");
            System.out.println("TreeSet after removal: " + treeSet);
            
            System.out.println("Iterating over TreeSet:");
            for (String fruits : treeSet) {
                System.out.println(fruits);
            }
            
            // Additional TreeSet operations
            System.out.println("First element: " + ((TreeSet<String>) treeSet).first());
            System.out.println("Last element: " + ((TreeSet<String>) treeSet).last());
            System.out.println("Subset from Apple to Date: " + ((TreeSet<String>) treeSet).subSet("Apple", "Date"));
     
        }
	}

}
