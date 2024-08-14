package com.core.oop.collectionframework.List;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create a LinkedList
        List<String> linkedList = new LinkedList<>();
     // Add elements
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Cherry");
        
        // Access elements
        System.out.println("Element at index 1: " + linkedList.get(1));
     // Iterate over elements
        System.out.println("LinkedList elements:");
        for (String fruit : linkedList) {
            System.out.println(fruit);
        }
     // Remove an element
        linkedList.remove("Banana");
        
        // Check the updated list
        System.out.println("Updated LinkedList elements:");
        for (String fruit : linkedList) {
            System.out.println(fruit);
        }
	}

}
//LinkedList is a doubly linked list implementation of the List interface. 
//It provides efficient insertions and deletions but slower random access compared to ArrayList.