package com.core.oop.collectionframework.List;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create an ArrayList
        List<String> arrayList = new ArrayList<>();
        // Add elements
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Cherry");
        
     // Access elements
        System.out.println("Element at index 1: " + arrayList.get(1));
        
     // Iterate over elements
        System.out.println("ArrayList elements:");
        for (String fruit : arrayList) {
            System.out.println(fruit);
        }
     // Remove an element
        arrayList.remove("Banana");
        
        // Check the updated list
        System.out.println("Updated ArrayList elements:");
        for (String fruit : arrayList) {
            System.out.println(fruit);
        }
	}
	

}
//ArrayList is a resizable array implementation of the List interface. 
//It provides fast random access but slow insertions and deletions 
//(except at the end).